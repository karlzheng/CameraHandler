package v01.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ATMDFrameDisplayCommandController {

    @RequestMapping(value = "/atMDFrameDisplayOn")
    public String atMDFrameDisplayOn(){

        return "redirect:/?command=atMDFrameDisplayOn";
    }

    @RequestMapping(value = "/atMDFrameDisplayOff")
    public String atMDFrameDisplayOff(){

        return "redirect:/?command=atMDFrameDisplayOff";
    }

    @RequestMapping(value = "/atMDFrameDisplayOnOff")
    public String atMDFrameDisplayOnOff(){

        return "redirect:/?command=atMDFrameDisplayOnOff";
    }
}
