package v01.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import v01.commands.MiscCommand;

@Controller
public class MiscCommandController {

    private MiscCommand miscCommand = new MiscCommand();

    @RequestMapping(value = "/Misc_addressSet")
    public String miscAddressSet(){
        miscCommand.addressSet().execute();
        return "redirect:/?command=Misc_addressSet";
    }

    @RequestMapping(value = "/Misc_IFClear")
    public String miscIFClear(){
        miscCommand.IFClear().execute();
        return "redirect:/?command=Misc_IFClear";
    }

    @RequestMapping(value = "/Misc_commandCancel")
    public String miscCommandCancel(@RequestParam int socketNumber){
        miscCommand.commandCancel(socketNumber).execute();
        return "redirect:/?command=Misc_commandCancel";
    }
}
