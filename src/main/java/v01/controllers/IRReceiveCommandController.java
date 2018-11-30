package v01.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IRReceiveCommandController {

    @RequestMapping(value = "/irReceiveOn")
    public String irReceiveOn(){

        return "redirect:/?command=irReceiveOn";
    }

    @RequestMapping(value = "/irReceiveOff")
    public String irReceiveOff(){

        return "redirect:/?command=irReceiveOff";
    }

    @RequestMapping(value = "/irReceiveOnOff")
    public String irReceiveOnOff(){

        return "redirect:/?command=irReceiveOnOff";
    }
}
