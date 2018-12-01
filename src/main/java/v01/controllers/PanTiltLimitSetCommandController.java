package v01.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class PanTiltLimitSetCommandController {

    @RequestMapping(value = "/panTiltlimitSet")
    public String panTiltlimitSet(@RequestParam int corner, @RequestParam int panPosition, @RequestParam int tiltPosition){

        return "redirect:/?command=panTiltlimitSet";
    }

    @RequestMapping(value = "/panTiltlimitClear")
    public String panTiltlimitClear(@RequestParam int corner){

        return "redirect:/?command=panTiltlimitClear";
    }
}
