package v01.controllers;

import jssc.SerialPortException;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import v01.commands.ATAutoZoomCommand;

@Controller
public class ATAutoZoomCommandController {

    private ATAutoZoomCommand atAutoZoomCommand = new ATAutoZoomCommand();

    @RequestMapping(value = "/ATAutoZoom_on")
    public String atAutoZoomOn() throws SerialPortException, InterruptedException {
        atAutoZoomCommand.on().execute();
        return "redirect:/?command=ATAutoZoom_on";
    }

    @RequestMapping(value = "/ATAutoZoom_off")
    public String atAutoZoomOff() throws SerialPortException, InterruptedException {
        atAutoZoomCommand.off().execute();
        return "redirect:/?command=ATAutoZoom_off";
    }

    @RequestMapping(value = "/ATAutoZoom_onOff")
    public String atAutoZoomOnOff() throws SerialPortException, InterruptedException {
        atAutoZoomCommand.onOff().execute();
        return "redirect:/?command=ATAutoZoom_onOff";
    }
}
