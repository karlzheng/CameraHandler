package v01.controllers;

import jssc.SerialPortException;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import v01.commands.AddressSetCommand;

@Controller
public class AddressSetController {
    private AddressSetCommand addressSetCommand = new AddressSetCommand();

    @RequestMapping(value = "/AddressSet_setAddress")
    public String setAddress(@RequestParam int address) throws SerialPortException, InterruptedException {
        addressSetCommand.setAddress(address).execute();
        return "redirect:/?command=setAddress";
    }

    @RequestMapping(value = "/AddressSet_ifClear")
    public String ifClear() throws SerialPortException, InterruptedException {
        addressSetCommand.ifClear().execute();
        return "redirect:/?command=ifClear";
    }
}
