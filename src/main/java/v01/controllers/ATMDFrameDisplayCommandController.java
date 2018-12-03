package v01.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import v01.commands.ATMDFrameDisplayCommand;

@Controller
public class ATMDFrameDisplayCommandController {

    private ATMDFrameDisplayCommand atmdFrameDisplayCommand = new ATMDFrameDisplayCommand();

    @RequestMapping(value = "/ATMDFrameDisplay_on")
    public String atMDFrameDisplayOn(){
        atmdFrameDisplayCommand.on().execute();
        return "redirect:/?command=ATMDFrameDisplay_on";
    }

    @RequestMapping(value = "/ATMDFrameDisplay_off")
    public String atMDFrameDisplayOff(){
        atmdFrameDisplayCommand.off().execute();
        return "redirect:/?command=ATMDFrameDisplay_off";
    }

    @RequestMapping(value = "/ATMDFrameDisplay_onOff")
    public String atMDFrameDisplayOnOff(){
        atmdFrameDisplayCommand.onOff().execute();
        return "redirect:/?command=ATMDFrameDisplay_onOff";
    }
}
