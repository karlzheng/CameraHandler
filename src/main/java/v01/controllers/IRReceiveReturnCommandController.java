package v01.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import v01.commands.IRReceiveReturnCommand;

@Controller
public class IRReceiveReturnCommandController {

    private IRReceiveReturnCommand irReceiveReturnCommand = new IRReceiveReturnCommand();

    @RequestMapping(value = "/IRReceiveReturn_on")
    public String irReceiveReturnOn(){
        irReceiveReturnCommand.on().execute();
        return "redirect:/?command=IRReceiveReturn_on";
    }

    @RequestMapping(value = "/IRReceiveReturn_off")
    public String irReceiveReturnOff(){
        irReceiveReturnCommand.off().execute();
        return "redirect:/?command=IRReceiveReturn_off";
    }
}
