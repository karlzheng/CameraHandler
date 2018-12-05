package v01.controllers;

import jssc.SerialPortException;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import v01.commands.PowerCommand;

@Controller
public class PowerCommandController {

    private PowerCommand powerCommand = new PowerCommand();

    @RequestMapping(value = "/Power_on")
    public String powerOn() throws SerialPortException, InterruptedException {
        powerCommand.on().execute();
        return "redirect:/?command=powerOn&status=on";
    }

    @RequestMapping(value = "/Power_off")
    public String powerOff() throws SerialPortException, InterruptedException {
        powerCommand.off().execute();
        return "redirect:/?command=powerOff&status=off";
    }
}
