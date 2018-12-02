package v01.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import v01.commands.ATMDFrameDisplayCommand;

@Controller
public class ATMDFrameDisplayCommandController {

    private ATMDFrameDisplayCommand atmdFrameDisplayCommand = new ATMDFrameDisplayCommand();

    @RequestMapping(value = "/atMDFrameDisplayOn")
    public String atMDFrameDisplayOn(){
        atmdFrameDisplayCommand.on().execute();
        return "redirect:/?command=atMDFrameDisplayOn";
    }

    @RequestMapping(value = "/atMDFrameDisplayOff")
    public String atMDFrameDisplayOff(){
        atmdFrameDisplayCommand.off().execute();
        return "redirect:/?command=atMDFrameDisplayOff";
    }

    @RequestMapping(value = "/atMDFrameDisplayOnOff")
    public String atMDFrameDisplayOnOff(){
        atmdFrameDisplayCommand.onOff().execute();
        return "redirect:/?command=atMDFrameDisplayOnOff";
    }
}
