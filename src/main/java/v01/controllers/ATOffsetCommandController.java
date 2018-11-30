package v01.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ATOffsetCommandController {

    @RequestMapping(value = "/atOffsetOn")
    public String atOffsetOn(){

        return "redirect:/?command=atOffsetOn";
    }

    @RequestMapping(value = "/atOffsetOff")
    public String atOffsetOff(){

        return "redirect:/?command=atOffsetOff";
    }

    @RequestMapping(value = "/atOffsetOnOff")
    public String atOffsetOnOff(){

        return "redirect:/?command=atOffsetOnOff";
    }
}
