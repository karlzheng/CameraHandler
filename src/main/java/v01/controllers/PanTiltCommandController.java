package v01.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import v01.commands.PanTiltCommand;

@Controller
public class PanTiltCommandController {

    private PanTiltCommand panTiltCommand = new PanTiltCommand();

    @RequestMapping(value = "/panTiltHome")
    public String panTiltHome(){
        panTiltCommand.home().execute();
        return "redirect:/?command=panTiltHome";
    }

    @RequestMapping(value = "/panTiltUp")
    public String panTiltUp(@RequestParam int panSpeed, @RequestParam int tiltSpeed){
        panTiltCommand.up(panSpeed, tiltSpeed).execute();
        return "redirect:/?command=panTiltUp";
    }

    @RequestMapping(value = "/panTiltDown")
    public String panTiltDown(@RequestParam int panSpeed, @RequestParam int tiltSpeed){
        panTiltCommand.down(panSpeed, tiltSpeed).execute();
        return "redirect:/?command=panTiltDown";
    }

    @RequestMapping(value = "/panTiltLeft")
    public String panTiltLeft(@RequestParam int panSpeed, @RequestParam int tiltSpeed){
        panTiltCommand.left(panSpeed, tiltSpeed).execute();
        return "redirect:/?command=panTiltLeft";
    }

    @RequestMapping(value = "/panTiltRight")
    public String panTiltRight(@RequestParam int panSpeed, @RequestParam int tiltSpeed){
        panTiltCommand.right(panSpeed, tiltSpeed).execute();
        return "redirect:/?command=panTiltRight";
    }

    @RequestMapping(value = "/panTiltUpLeft")
    public String panTiltUpLeft(@RequestParam int panSpeed, @RequestParam int tiltSpeed){
        panTiltCommand.upLeft(panSpeed, tiltSpeed).execute();
        return "redirect:/?command=panTiltUpLeft";
    }

    @RequestMapping(value = "/panTiltUpRight")
    public String panTiltUpRight(@RequestParam int panSpeed, @RequestParam int tiltSpeed){
        panTiltCommand.upRight(panSpeed, tiltSpeed).execute();
        return "redirect:/?command=panTiltUpRight";
    }

    @RequestMapping(value = "/panTiltDownLeft")
    public String panTiltDownLeft(@RequestParam int panSpeed, @RequestParam int tiltSpeed){
        panTiltCommand.downLeft(panSpeed, tiltSpeed).execute();
        return "redirect:/?command=panTiltDownLeft";
    }

    @RequestMapping(value = "/panTiltDownRight")
    public String panTiltDownRight(@RequestParam int panSpeed, @RequestParam int tiltSpeed){
        panTiltCommand.downRight(panSpeed, tiltSpeed).execute();
        return "redirect:/?command=panTiltDownRight";
    }

    @RequestMapping(value = "/panTiltStop")
    public String panTiltStop(@RequestParam int panSpeed, @RequestParam int tiltSpeed){
        panTiltCommand.stop(panSpeed, tiltSpeed).execute();
        return "redirect:/?command=panTiltStop";
    }

    @RequestMapping(value = "/panTiltAbsolutePosition")
    public String panTiltAbsolutePosition(@RequestParam int panSpeed, @RequestParam int tiltSpeed, @RequestParam int panPosition, @RequestParam int tiltPosition){
        panTiltCommand.absolutePosition(panSpeed, tiltSpeed, panPosition, tiltPosition).execute();
        return "redirect:/?command=panTiltAbsolutePosition";
    }

    @RequestMapping(value = "/panTiltRelativePosition")
    public String panTiltRelativePosition(@RequestParam int panSpeed, @RequestParam int tiltSpeed, @RequestParam int panPosition, @RequestParam int tiltPosition){
        panTiltCommand.relativePosition(panSpeed, tiltSpeed, panPosition, tiltPosition).execute();
        return "redirect:/?command=panTiltRelativePosition";
    }
}
