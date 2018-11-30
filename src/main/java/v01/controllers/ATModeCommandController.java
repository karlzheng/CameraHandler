package v01.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ATModeCommandController {

    @RequestMapping(value = "/atModeOn")
    public String atModeOn(){

        return "redirect:/?command=atModeOn";
    }

    @RequestMapping(value = "/atModeOff")
    public String atModeOff(){

        return "redirect:/?command=atModeOff";
    }

    @RequestMapping(value = "/atModeOnOff")
    public String atModeOnOff(){

        return "redirect:/?command=atModeOnOff";
    }
}
