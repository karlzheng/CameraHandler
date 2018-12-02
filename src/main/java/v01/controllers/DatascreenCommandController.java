package v01.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import v01.commands.DatascreenCommand;

@Controller
public class DatascreenCommandController {

    private DatascreenCommand datascreenCommand = new DatascreenCommand();

    @RequestMapping(value = "/dataScreenOn")
    public String dataScreenOn(){
        datascreenCommand.on().execute();
        return "redirect:/?command=dataScreenOn";
    }

    @RequestMapping(value = "/dataScreenOff")
    public String dataScreenOff(){
        datascreenCommand.off().execute();
        return "redirect:/?command=dataScreenOff";
    }

    @RequestMapping(value = "/dataScreenOnOff")
    public String dataScreenOnOff(){
        datascreenCommand.onOff().execute();
        return "redirect:/?command=dataScreenOnOff";
    }
}
