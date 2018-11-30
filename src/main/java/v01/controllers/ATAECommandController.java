package v01.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ATAECommandController {

    @RequestMapping(value = "/ATAE-on")
    public String ATAEOn(){

        return "redirect:/?command=ATAE-on";
    }

    @RequestMapping(value = "/ATAE-off")
    public String ATAEOff(){

        return "redirect:/?command=ATAE-off";
    }

    @RequestMapping(value = "/ATAE-onOff")
    public String ATAEOnOff(){

        return "redirect:/?command=ATAE-onOff";
    }
}
