package v01.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class BacklightCommandController {

    @RequestMapping(value = "/backlightOn")
    public String backlightOn(){

        return "redirect:/?command=backlightOn";
    }

    @RequestMapping(value = "/backlightOff")
    public String backlightOff(){

        return "redirect:/?command=backlightOff";
    }
}
