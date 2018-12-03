package v01.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import v01.commands.ATAutoZoomCommand;

@Controller
public class ATAutoZoomCommandController {

    private ATAutoZoomCommand atAutoZoomCommand = new ATAutoZoomCommand();

    @RequestMapping(value = "/ATAutoZoom_on")
    public String atAutoZoomOn(){
        atAutoZoomCommand.on().execute();
        return "redirect:/?command=ATAutoZoom_on";
    }

    @RequestMapping(value = "/ATAutoZoom_off")
    public String atAutoZoomOff(){
        atAutoZoomCommand.off().execute();
        return "redirect:/?command=ATAutoZoom_off";
    }

    @RequestMapping(value = "/ATAutoZoom_onOff")
    public String atAutoZoomOnOff(){
        atAutoZoomCommand.onOff().execute();
        return "redirect:/?command=ATAutoZoom_onOff";
    }
}
