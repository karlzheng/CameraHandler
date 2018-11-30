package v01.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class DatascreenCommandController {

    @RequestMapping(value = "/dataScreenOn")
    public String dataScreenOn(){

        return "redirect:/?command=dataScreenOn";
    }

    @RequestMapping(value = "/dataScreenOff")
    public String dataScreenOff(){

        return "redirect:/?command=dataScreenOff";
    }

    @RequestMapping(value = "/dataScreenOnOff")
    public String dataScreenOnOff(){

        return "redirect:/?command=dataScreenOnOff";
    }
}
