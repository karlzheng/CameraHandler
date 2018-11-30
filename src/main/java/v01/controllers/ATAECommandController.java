package v01.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ATAECommandController {

    @RequestMapping(value = "/atAEOn")
    public String atAEOn(){

        return "redirect:/?command=ATAEOn";
    }

    @RequestMapping(value = "/atAEOff")
    public String atAEOff(){

        return "redirect:/?command=atAEOff";
    }

    @RequestMapping(value = "/atAEOnOff")
    public String atAEOnOff(){

        return "redirect:/?command=atAEOnOff";
    }
}
