package v01.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import v01.commands.FocusCommand;

@Controller
public class FocusCommandController {

    private FocusCommand focusCommand = new FocusCommand();

    @RequestMapping(value = "/focusStop")
    public String focusStop(){
        focusCommand.stop().execute();
        return "redirect:/?command=focusStop";
    }

    @RequestMapping(value = "/focusFar")
    public String focusFar(){
        focusCommand.far().execute();
        return "redirect:/?command=focusFar";
    }

    @RequestMapping(value = "/focusNear")
    public String focusNear(){
        focusCommand.near().execute();
        return "redirect:/?command=focusNear";
    }

    @RequestMapping(value = "/autoFocusOn")
    public String autoFocusOn(){
        focusCommand.autoFocusOn().execute();
        return "redirect:/?command=autoFocusOn";
    }

    @RequestMapping(value = "/manualFocusOn")
    public String manualFocusOn(){
        focusCommand.manualFocusOn().execute();
        return "redirect:/?command=manualFocusOn";
    }

    @RequestMapping(value = "/mixedFocus")
    public String mixedFocus(){
        focusCommand.mixedFocus().execute();
        return "redirect:/?command=mixedFocus";
    }

    @RequestMapping(value = "/directFocus")
    public String directFocus(@RequestParam int focusData){
        focusCommand.direct(focusData).execute();
        return "redirect:/?command=directFocus";
    }
}
