package v01.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import v01.commands.ATOffsetCommand;

@Controller
public class ATOffsetCommandController {

    private ATOffsetCommand atOffsetCommand = new ATOffsetCommand();

    @RequestMapping(value = "/ATOffset_on")
    public String atOffsetOn(){
        atOffsetCommand.on().execute();
        return "redirect:/?command=ATOffset_on";
    }

    @RequestMapping(value = "/ATOffset_off")
    public String atOffsetOff(){
        atOffsetCommand.off().execute();
        return "redirect:/?command=ATOffset_off";
    }

    @RequestMapping(value = "/ATOffset_onOff")
    public String atOffsetOnOff(){
        atOffsetCommand.onOff().execute();
        return "redirect:/?command=ATOffset_onOff";
    }
}
