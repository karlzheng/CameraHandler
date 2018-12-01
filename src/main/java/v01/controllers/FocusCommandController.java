package v01.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class FocusCommandController {

    @RequestMapping(value = "/focusStop")
    public String focusStop(){

        return "redirect:/?command=focusStop";
    }

    @RequestMapping(value = "/focusFar")
    public String focusFar(){

        return "redirect:/?command=focusFar";
    }

    @RequestMapping(value = "/focusNear")
    public String focusNear(){

        return "redirect:/?command=focusNear";
    }

    @RequestMapping(value = "/autoFocusOn")
    public String autoFocusOn(){

        return "redirect:/?command=autoFocusOn";
    }

    @RequestMapping(value = "/manualFocusOn")
    public String manualFocusOn(){

        return "redirect:/?command=manualFocusOn";
    }

    @RequestMapping(value = "/mixedFocus")
    public String mixedFocus(){

        return "redirect:/?command=mixedFocus";
    }

    @RequestMapping(value = "/directFocus")
    public String directFocus(@RequestParam int focusData){

        return "redirect:/?command=directFocus";
    }
}
