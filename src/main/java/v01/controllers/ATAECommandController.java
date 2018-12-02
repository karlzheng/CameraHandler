package v01.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import v01.commands.ATAECommand;

@Controller
public class ATAECommandController {

    private ATAECommand ataeCommand = new ATAECommand();

    @RequestMapping(value = "/atAEOn")
    public String atAEOn(){
        ataeCommand.on().execute();
        return "redirect:/?command=atAEOn";
    }

    @RequestMapping(value = "/atAEOff")
    public String atAEOff(){
        ataeCommand.off().execute();
        return "redirect:/?command=atAEOff";
    }

    @RequestMapping(value = "/atAEOnOff")
    public String atAEOnOff(){
        ataeCommand.onOff().execute();
        return "redirect:/?command=atAEOnOff";
    }
}
