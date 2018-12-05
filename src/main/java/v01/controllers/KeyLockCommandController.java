package v01.controllers;

import jssc.SerialPortException;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import v01.commands.KeyLockCommand;

@Controller
public class KeyLockCommandController {

    private KeyLockCommand keyLockCommand = new KeyLockCommand();

    @RequestMapping(value = "/KeyLock_on")
    public String keyLockOn() throws SerialPortException, InterruptedException {
        keyLockCommand.on().execute();
        return "redirect:/?command=KeyLock_on";
    }

    @RequestMapping(value = "/KeyLock_off")
    public String keyLockOff() throws SerialPortException, InterruptedException {
        keyLockCommand.off().execute();
        return "redirect:/?command=KeyLock_off";
    }
}
