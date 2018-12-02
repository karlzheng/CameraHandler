package v01.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import v01.commands.ATOffsetCommand;

@Controller
public class ATOffsetCommandController {

    private ATOffsetCommand atOffsetCommand = new ATOffsetCommand();

    @RequestMapping(value = "/atOffsetOn")
    public String atOffsetOn(){
        atOffsetCommand.on().execute();
        return "redirect:/?command=atOffsetOn";
    }

    @RequestMapping(value = "/atOffsetOff")
    public String atOffsetOff(){
        atOffsetCommand.off().execute();
        return "redirect:/?command=atOffsetOff";
    }

    @RequestMapping(value = "/atOffsetOnOff")
    public String atOffsetOnOff(){
        atOffsetCommand.onOff().execute();
        return "redirect:/?command=atOffsetOnOff";
    }
}
