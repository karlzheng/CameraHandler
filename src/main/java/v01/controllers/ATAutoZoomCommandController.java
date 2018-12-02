package v01.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import v01.commands.ATAutoZoomCommand;

@Controller
public class ATAutoZoomCommandController {

    private ATAutoZoomCommand atAutoZoomCommand = new ATAutoZoomCommand();

    @RequestMapping(value = "/atAutoZoomOn")
    public String atAutoZoomOn(){
        atAutoZoomCommand.on().execute();
        return "redirect:/?command=atAutoZoomOn";
    }

    @RequestMapping(value = "/atAutoZoomOff")
    public String atAutoZoomOff(){
        atAutoZoomCommand.off().execute();
        return "redirect:/?command=atAutoZoomOff";
    }

    @RequestMapping(value = "/atAutoZoomOnOff")
    public String atAutoZoomOnOff(){
        atAutoZoomCommand.onOff().execute();
        return "redirect:/?command=atAutoZoomOnOff";
    }
}
