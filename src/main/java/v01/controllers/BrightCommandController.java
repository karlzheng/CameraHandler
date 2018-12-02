package v01.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import v01.commands.BrightCommand;

@Controller
public class BrightCommandController {

    private BrightCommand brightCommand = new BrightCommand();

    @RequestMapping(value = "/brightReset")
    public String brightReset(){
        brightCommand.reset().execute();
        return "redirect:/?command=brightReset";
    }

    @RequestMapping(value = "/brightUp")
    public String brightUp(){
        brightCommand.up().execute();
        return "redirect:/?command=brightUp";
    }

    @RequestMapping(value = "/brightDown")
    public String brightDown(){
        brightCommand.down().execute();
        return "redirect:/?command=brightDown";
    }
}
