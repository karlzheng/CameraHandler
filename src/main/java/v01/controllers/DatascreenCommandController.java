package v01.controllers;

import jssc.SerialPortException;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import v01.commands.DatascreenCommand;

@Controller
public class DatascreenCommandController {

    private DatascreenCommand datascreenCommand = new DatascreenCommand();

    @RequestMapping(value = "/Datascreen_on")
    public String dataScreenOn() throws SerialPortException, InterruptedException {
        datascreenCommand.on().execute();
        return "redirect:/?command=Datascreen_on";
    }

    @RequestMapping(value = "/Datascreen_off")
    public String dataScreenOff() throws SerialPortException, InterruptedException {
        datascreenCommand.off().execute();
        return "redirect:/?command=Datascreen_off";
    }

    @RequestMapping(value = "/Datascreen_onOff")
    public String dataScreenOnOff() throws SerialPortException, InterruptedException {
        datascreenCommand.onOff().execute();
        return "redirect:/?command=Datascreen_onOff";
    }
}
