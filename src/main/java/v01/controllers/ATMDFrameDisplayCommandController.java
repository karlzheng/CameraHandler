package v01.controllers;

import jssc.SerialPortException;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import v01.commands.ATMDFrameDisplayCommand;

@Controller
public class ATMDFrameDisplayCommandController {

    private ATMDFrameDisplayCommand atmdFrameDisplayCommand = new ATMDFrameDisplayCommand();

    @RequestMapping(value = "/ATMDFrameDisplay_on")
    public String atMDFrameDisplayOn() throws SerialPortException, InterruptedException {
        atmdFrameDisplayCommand.on().execute();
        return "redirect:/?command=ATMDFrameDisplay_on";
    }

    @RequestMapping(value = "/ATMDFrameDisplay_off")
    public String atMDFrameDisplayOff() throws SerialPortException, InterruptedException {
        atmdFrameDisplayCommand.off().execute();
        return "redirect:/?command=ATMDFrameDisplay_off";
    }

    @RequestMapping(value = "/ATMDFrameDisplay_onOff")
    public String atMDFrameDisplayOnOff() throws SerialPortException, InterruptedException {
        atmdFrameDisplayCommand.onOff().execute();
        return "redirect:/?command=ATMDFrameDisplay_onOff";
    }
}
