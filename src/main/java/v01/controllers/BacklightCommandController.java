package v01.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import v01.commands.BacklightCommand;

@Controller
public class BacklightCommandController {

    private BacklightCommand backlightCommand = new BacklightCommand();

    @RequestMapping(value = "/backlightOn")
    public String backlightOn(){
        backlightCommand.on().execute();
        return "redirect:/?command=backlightOn";
    }

    @RequestMapping(value = "/backlightOff")
    public String backlightOff(){
        backlightCommand.off().execute();
        return "redirect:/?command=backlightOff";
    }
}
