package v01.controllers;

import jssc.SerialPortException;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import v01.commands.ATAECommand;

@Controller
public class ATAECommandController {

    private ATAECommand ataeCommand = new ATAECommand();

    @RequestMapping(value = "/ATAE_on")
    public String atAEOn() throws SerialPortException, InterruptedException {
        ataeCommand.on().execute();
        return "redirect:/?command=ATAE_on";
    }

    @RequestMapping(value = "/ATAE_off")
    public String atAEOff() throws SerialPortException, InterruptedException {
        ataeCommand.off().execute();
        return "redirect:/?command=ATAE_off";
    }

    @RequestMapping(value = "/ATAE_onOff")
    public String atAEOnOff() throws SerialPortException, InterruptedException {
        ataeCommand.onOff().execute();
        return "redirect:/?command=ATAE_onOff";
    }
}
