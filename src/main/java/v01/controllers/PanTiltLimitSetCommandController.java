package v01.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import v01.commands.PanTiltLimitSetCommand;

@Controller
public class PanTiltLimitSetCommandController {

    private PanTiltLimitSetCommand panTiltLimitSetCommand = new PanTiltLimitSetCommand();

    @RequestMapping(value = "/panTiltlimitSet")
    public String panTiltlimitSet(@RequestParam int corner, @RequestParam int panPosition, @RequestParam int tiltPosition){
        panTiltLimitSetCommand.limitSet(corner, panPosition, tiltPosition).execute();
        return "redirect:/?command=panTiltlimitSet";
    }

    @RequestMapping(value = "/panTiltlimitClear")
    public String panTiltlimitClear(@RequestParam int corner){
        panTiltLimitSetCommand.limitClear(corner).execute();
        return "redirect:/?command=panTiltlimitClear";
    }
}
