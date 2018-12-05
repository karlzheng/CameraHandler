package v01.controllers;

import jssc.SerialPortException;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import v01.commands.BrightCommand;

@Controller
public class BrightCommandController {

    private BrightCommand brightCommand = new BrightCommand();

    @RequestMapping(value = "/Bright_reset")
    public String brightReset() throws SerialPortException, InterruptedException {
        brightCommand.reset().execute();
        return "redirect:/?command=Bright_reset";
    }

    @RequestMapping(value = "/Bright_up")
    public String brightUp() throws SerialPortException, InterruptedException {
        brightCommand.up().execute();
        return "redirect:/?command=Bright_up";
    }

    @RequestMapping(value = "/Bright_down")
    public String brightDown() throws SerialPortException, InterruptedException {
        brightCommand.down().execute();
        return "redirect:/?command=Bright_down";
    }
}
