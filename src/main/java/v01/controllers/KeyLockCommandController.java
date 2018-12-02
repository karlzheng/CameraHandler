package v01.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import v01.commands.KeyLockCommand;

@Controller
public class KeyLockCommandController {

    private KeyLockCommand keyLockCommand = new KeyLockCommand();

    @RequestMapping(value = "/keyLockOn")
    public String keyLockOn(){
        keyLockCommand.on().execute();
        return "redirect:/?command=keyLockOn";
    }

    @RequestMapping(value = "/keyLockOff")
    public String keyLockOff(){
        keyLockCommand.off().execute();
        return "redirect:/?command=keyLockOff";
    }
}
