package v01.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import v01.commands.IRReceiveCommand;

@Controller
public class IRReceiveCommandController {

    private IRReceiveCommand irReceiveCommand = new IRReceiveCommand();

    @RequestMapping(value = "/IRReceive_on")
    public String irReceiveOn(){
        irReceiveCommand.on().execute();
        return "redirect:/?command=IRReceive_on";
    }

    @RequestMapping(value = "/IRReceive_off")
    public String irReceiveOff(){
        irReceiveCommand.off().execute();
        return "redirect:/?command=IRReceive_off";
    }

    @RequestMapping(value = "/IRReceive_onOff")
    public String irReceiveOnOff(){
        irReceiveCommand.onOff().execute();
        return "redirect:/?command=IRReceive_onOff";
    }
}
