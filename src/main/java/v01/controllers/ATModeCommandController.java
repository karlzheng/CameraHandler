package v01.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import v01.commands.ATModeCommand;

@Controller
public class ATModeCommandController {

    private ATModeCommand atModeCommand = new ATModeCommand();

    @RequestMapping(value = "/atModeOn")
    public String atModeOn(){
        atModeCommand.on().execute();
        return "redirect:/?command=atModeOn";
    }

    @RequestMapping(value = "/atModeOff")
    public String atModeOff(){
        atModeCommand.off().execute();
        return "redirect:/?command=atModeOff";
    }

    @RequestMapping(value = "/atModeOnOff")
    public String atModeOnOff(){
        atModeCommand.onOff().execute();
        return "redirect:/?command=atModeOnOff";
    }
}
