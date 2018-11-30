package v01.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ATAutoZoomCommandController {

    @RequestMapping(value = "/atAutoZoomOn")
    public String atAutoZoomOn(){

        return "redirect:/?command=atAutoZoomOn";
    }

    @RequestMapping(value = "/atAutoZoomOff")
    public String atAutoZoomOff(){

        return "redirect:/?command=atAutoZoomOff";
    }

    @RequestMapping(value = "/atAutoZoomOnOff")
    public String atAutoZoomOnOff(){

        return "redirect:/?command=atAutoZoomOnOff";
    }
}
