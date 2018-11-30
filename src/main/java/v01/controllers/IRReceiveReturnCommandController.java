package v01.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IRReceiveReturnCommandController {

    @RequestMapping(value = "/irReceiveReturnOn")
    public String irReceiveReturnOn(){

        return "redirect:/?command=irReceiveReturnOn";
    }

    @RequestMapping(value = "/irReceiveReturnOff")
    public String irReceiveReturnOff(){

        return "redirect:/?command=irReceiveReturnOff";
    }
}
