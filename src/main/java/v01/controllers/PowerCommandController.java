package v01.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PowerCommandController {

    @RequestMapping(value = "/powerOn")
    public String powerOn(){

        return "redirect:/?command=powerOn&status=on";
    }

    @RequestMapping(value = "/powerOff")
    public String powerOff(){

        return "redirect:/?command=powerOff&status=off";
    }
}
