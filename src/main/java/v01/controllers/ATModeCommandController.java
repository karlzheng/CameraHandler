package v01.controllers;

import jssc.SerialPortException;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import v01.commands.ATModeCommand;

@Controller
public class ATModeCommandController {

    private ATModeCommand atModeCommand = new ATModeCommand();

    @RequestMapping(value = "/ATMode_on")
    public String atModeOn() throws SerialPortException, InterruptedException {
        atModeCommand.on().execute();
        return "redirect:/?command=ATMode_on";
    }

    @RequestMapping(value = "/ATMode_off")
    public String atModeOff() throws SerialPortException, InterruptedException {
        atModeCommand.off().execute();
        return "redirect:/?command=ATMode_off";
    }

    @RequestMapping(value = "/ATMode_onOff")
    public String atModeOnOff() throws SerialPortException, InterruptedException {
        atModeCommand.onOff().execute();
        return "redirect:/?command=ATMode_onOff";
    }
}
