package v01.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PanTiltLimitSetCommandController {

    @RequestMapping(value = "/panTiltlimitSet")
    public String panTiltlimitSet(int corner, int panPosition, int tiltPosition){

        return "redirect:/?command=panTiltlimitSet";
    }

    @RequestMapping(value = "/panTiltlimitClear")
    public String panTiltlimitClear(int corner){

        return "redirect:/?command=panTiltlimitClear";
    }
}
