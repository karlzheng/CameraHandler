package v01.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class PanTiltCommandController {

    @RequestMapping(value = "/panTiltHome")
    public String panTiltHome(){

        return "redirect:/?command=panTiltHome";
    }

    @RequestMapping(value = "/panTiltUp")
    public String panTiltUp(@RequestParam int panSpeed, @RequestParam int tiltSpeed){

        return "redirect:/?command=panTiltUp";
    }

    @RequestMapping(value = "/panTiltDown")
    public String panTiltDown(@RequestParam int panSpeed, @RequestParam int tiltSpeed){

        return "redirect:/?command=panTiltDown";
    }

    @RequestMapping(value = "/panTiltLeft")
    public String panTiltLeft(@RequestParam int panSpeed, @RequestParam int tiltSpeed){

        return "redirect:/?command=panTiltLeft";
    }

    @RequestMapping(value = "/panTiltRight")
    public String panTiltRight(@RequestParam int panSpeed, @RequestParam int tiltSpeed){

        return "redirect:/?command=panTiltRight";
    }

    @RequestMapping(value = "/panTiltUpLeft")
    public String panTiltUpLeft(@RequestParam int panSpeed, @RequestParam int tiltSpeed){

        return "redirect:/?command=panTiltUpLeft";
    }

    @RequestMapping(value = "/panTiltUpRight")
    public String panTiltUpRight(@RequestParam int panSpeed, @RequestParam int tiltSpeed){

        return "redirect:/?command=panTiltUpRight";
    }

    @RequestMapping(value = "/panTiltDownLeft")
    public String panTiltDownLeft(@RequestParam int panSpeed, @RequestParam int tiltSpeed){

        return "redirect:/?command=panTiltDownLeft";
    }

    @RequestMapping(value = "/panTiltDownRight")
    public String panTiltDownRight(@RequestParam int panSpeed, @RequestParam int tiltSpeed){

        return "redirect:/?command=panTiltDownRight";
    }

    @RequestMapping(value = "/panTiltStop")
    public String panTiltStop(@RequestParam int panSpeed, @RequestParam int tiltSpeed){

        return "redirect:/?command=panTiltStop";
    }

    @RequestMapping(value = "/panTiltAbsolutePosition")
    public String panTiltAbsolutePosition(@RequestParam int panSpeed, @RequestParam int tiltSpeed, @RequestParam int panPosition, @RequestParam int tiltPosition){

        return "redirect:/?command=panTiltAbsolutePosition";
    }

    @RequestMapping(value = "/panTiltRelativePosition")
    public String panTiltRelativePosition(@RequestParam int panSpeed, @RequestParam int tiltSpeed, @RequestParam int panPosition, @RequestParam int tiltPosition){

        return "redirect:/?command=panTiltRelativePosition";
    }
}
