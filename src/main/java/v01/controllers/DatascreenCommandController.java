package v01.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import v01.commands.DatascreenCommand;

@Controller
public class DatascreenCommandController {

    private DatascreenCommand datascreenCommand = new DatascreenCommand();

    @RequestMapping(value = "/Datascreen_on")
    public String dataScreenOn(){
        datascreenCommand.on().execute();
        return "redirect:/?command=Datascreen_on";
    }

    @RequestMapping(value = "/Datascreen_off")
    public String dataScreenOff(){
        datascreenCommand.off().execute();
        return "redirect:/?command=Datascreen_off";
    }

    @RequestMapping(value = "/Datascreen_onOff")
    public String dataScreenOnOff(){
        datascreenCommand.onOff().execute();
        return "redirect:/?command=Datascreen_onOff";
    }
}
