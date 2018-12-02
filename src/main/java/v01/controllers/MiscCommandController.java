package v01.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import v01.commands.MiscCommand;

@Controller
public class MiscCommandController {

    private MiscCommand miscCommand = new MiscCommand();

    @RequestMapping(value = "/miscAddressSet")
    public String miscAddressSet(){
        miscCommand.addressSet().execute();
        return "redirect:/?command=miscAddressSet";
    }

    @RequestMapping(value = "/miscIFClear")
    public String miscIFClear(){
        miscCommand.IFClear().execute();
        return "redirect:/?command=miscIFClear";
    }

    @RequestMapping(value = "/miscCommandCancel")
    public String miscCommandCancel(@RequestParam int socketNumber){
        miscCommand.commandCancel(socketNumber).execute();
        return "redirect:/?command=miscCommandCancel";
    }
}
