package v01.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import v01.commands.PowerCommand;

@Controller
public class PowerCommandController {

    private PowerCommand powerCommand = new PowerCommand();

    @RequestMapping(value = "/powerOn")
    public String powerOn(){
        powerCommand.on().execute();
        return "redirect:/?command=powerOn&status=on";
    }

    @RequestMapping(value = "/powerOff")
    public String powerOff(){
        powerCommand.off().execute();
        return "redirect:/?command=powerOff&status=off";
    }
}
