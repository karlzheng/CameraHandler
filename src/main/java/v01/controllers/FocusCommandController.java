package v01.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import v01.commands.FocusCommand;

@Controller
public class FocusCommandController {

    private FocusCommand focusCommand = new FocusCommand();

    @RequestMapping(value = "/Focus_stop")
    public String focusStop(){
        focusCommand.stop().execute();
        return "redirect:/?command=Focus_stop";
    }

    @RequestMapping(value = "/Focus_far")
    public String focusFar(){
        focusCommand.far().execute();
        return "redirect:/?command=Focus_far";
    }

    @RequestMapping(value = "/Focus_near")
    public String focusNear(){
        focusCommand.near().execute();
        return "redirect:/?command=Focus_near";
    }

    @RequestMapping(value = "/Focus_autoFocusOn")
    public String autoFocusOn(){
        focusCommand.autoFocusOn().execute();
        return "redirect:/?command=Focus_autoFocusOn";
    }

    @RequestMapping(value = "/Focus_manualFocusOn")
    public String manualFocusOn(){
        focusCommand.manualFocusOn().execute();
        return "redirect:/?command=Focus_manualFocusOn";
    }

    @RequestMapping(value = "/Focus_mixedFocus")
    public String mixedFocus(){
        focusCommand.mixedFocus().execute();
        return "redirect:/?command=Focus_mixedFocus";
    }

    @RequestMapping(value = "/Focus_direct")
    public String directFocus(@RequestParam int focusData){
        focusCommand.direct(focusData).execute();
        return "redirect:/?command=Focus_direct";
    }
}
