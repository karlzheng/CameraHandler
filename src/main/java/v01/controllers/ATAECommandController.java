package v01.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import v01.commands.ATAECommand;

@Controller
public class ATAECommandController {

    private ATAECommand ataeCommand = new ATAECommand();

    @RequestMapping(value = "/ATAE_on")
    public String atAEOn(){
        ataeCommand.on().execute();
        return "redirect:/?command=ATAE_on";
    }

    @RequestMapping(value = "/ATAE_off")
    public String atAEOff(){
        ataeCommand.off().execute();
        return "redirect:/?command=ATAE_off";
    }

    @RequestMapping(value = "/ATAE_onOff")
    public String atAEOnOff(){
        ataeCommand.onOff().execute();
        return "redirect:/?command=ATAE_onOff";
    }
}
