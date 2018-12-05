package v01.controllers;

import jssc.SerialPortException;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import v01.commands.MiscCommand;

@Controller
public class MiscCommandController {

    private MiscCommand miscCommand = new MiscCommand();

    @RequestMapping(value = "/Misc_addressSet")
    public String miscAddressSet() throws SerialPortException, InterruptedException {
        miscCommand.addressSet().execute();
        return "redirect:/?command=Misc_addressSet";
    }

    @RequestMapping(value = "/Misc_IFClear")
    public String miscIFClear() throws SerialPortException, InterruptedException {
        miscCommand.IFClear().execute();
        return "redirect:/?command=Misc_IFClear";
    }

    @RequestMapping(value = "/Misc_commandCancel")
    public String miscCommandCancel(@RequestParam int socketNumber) throws SerialPortException, InterruptedException {
        miscCommand.commandCancel(socketNumber).execute();
        return "redirect:/?command=Misc_commandCancel";
    }
}
