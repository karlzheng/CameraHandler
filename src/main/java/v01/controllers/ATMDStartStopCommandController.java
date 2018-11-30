package v01.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ATMDStartStopCommandController {

    @RequestMapping(value = "/atMDStartStop")
    public String atMDStartStop(){

        return "redirect:/?command=atMDStartStop";
    }
}
