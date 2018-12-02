package v01.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import v01.commands.IRReceiveCommand;

@Controller
public class IRReceiveCommandController {

    private IRReceiveCommand irReceiveCommand = new IRReceiveCommand();

    @RequestMapping(value = "/irReceiveOn")
    public String irReceiveOn(){
        irReceiveCommand.on().execute();
        return "redirect:/?command=irReceiveOn";
    }

    @RequestMapping(value = "/irReceiveOff")
    public String irReceiveOff(){
        irReceiveCommand.off().execute();
        return "redirect:/?command=irReceiveOff";
    }

    @RequestMapping(value = "/irReceiveOnOff")
    public String irReceiveOnOff(){
        irReceiveCommand.onOff().execute();
        return "redirect:/?command=irReceiveOnOff";
    }
}
