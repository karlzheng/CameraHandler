package v01.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class KeyLockCommandController {

    @RequestMapping(value = "/keyLockOn")
    public String keyLockOn(int positionNumber){

        return "redirect:/?command=keyLockOn";
    }

    @RequestMapping(value = "/keyLockOff")
    public String keyLockOff(int positionNumber){

        return "redirect:/?command=keyLockOff";
    }
}
