package v01.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PanTiltCommandController {

    @RequestMapping(value = "/panTiltHome")
    public String panTiltHome(){

        return "redirect:/?command=panTiltHome";
    }

    @RequestMapping(value = "/panTiltUp")
    public String panTiltUp(int panSpeed, int tiltSpeed){

        return "redirect:/?command=panTiltUp";
    }

    @RequestMapping(value = "/panTiltDown")
    public String panTiltDown(int panSpeed, int tiltSpeed){

        return "redirect:/?command=panTiltDown";
    }

    @RequestMapping(value = "/panTiltLeft")
    public String panTiltLeft(int panSpeed, int tiltSpeed){

        return "redirect:/?command=panTiltLeft";
    }

    @RequestMapping(value = "/panTiltRight")
    public String panTiltRight(int panSpeed, int tiltSpeed){

        return "redirect:/?command=panTiltRight";
    }

    @RequestMapping(value = "/panTiltUpLeft")
    public String panTiltUpLeft(int panSpeed, int tiltSpeed){

        return "redirect:/?command=panTiltUpLeft";
    }

    @RequestMapping(value = "/panTiltUpRight")
    public String panTiltUpRight(int panSpeed, int tiltSpeed){

        return "redirect:/?command=panTiltUpRight";
    }

    @RequestMapping(value = "/panTiltDownLeft")
    public String panTiltDownLeft(int panSpeed, int tiltSpeed){

        return "redirect:/?command=panTiltDownLeft";
    }

    @RequestMapping(value = "/panTiltDownRight")
    public String panTiltDownRight(int panSpeed, int tiltSpeed){

        return "redirect:/?command=panTiltDownRight";
    }

    @RequestMapping(value = "/panTiltStop")
    public String panTiltStop(int panSpeed, int tiltSpeed){

        return "redirect:/?command=panTiltStop";
    }

    @RequestMapping(value = "/panTiltAbsolutePosition")
    public String panTiltAbsolutePosition(int panSpeed, int tiltSpeed, int panPosition, int tiltPosition){

        return "redirect:/?command=panTiltAbsolutePosition";
    }

    @RequestMapping(value = "/panTiltRelativePosition")
    public String panTiltRelativePosition(int panSpeed, int tiltSpeed, int panPosition, int tiltPosition){

        return "redirect:/?command=panTiltRelativePosition";
    }
}
