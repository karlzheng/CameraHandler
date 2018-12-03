package v01.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import v01.commands.BacklightCommand;

@Controller
public class BacklightCommandController {

    private BacklightCommand backlightCommand = new BacklightCommand();

    @RequestMapping(value = "/Backlight_on")
    public String backlightOn(){
        backlightCommand.on().execute();
        return "redirect:/?command=Backlight_on";
    }

    @RequestMapping(value = "/Backlight_off")
    public String backlightOff(){
        backlightCommand.off().execute();
        return "redirect:/?command=Backlight_off";
    }
}
