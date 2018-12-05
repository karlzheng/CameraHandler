package v01.controllers;

import jssc.SerialPortException;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import v01.commands.FocusCommand;

@Controller
public class FocusCommandController {

    private FocusCommand focusCommand = new FocusCommand();

    @RequestMapping(value = "/Focus_stop")
    public String focusStop() throws SerialPortException, InterruptedException {
        focusCommand.stop().execute();
        return "redirect:/?command=Focus_stop";
    }

    @RequestMapping(value = "/Focus_far")
    public String focusFar() throws SerialPortException, InterruptedException {
        focusCommand.far().execute();
        return "redirect:/?command=Focus_far";
    }

    @RequestMapping(value = "/Focus_near")
    public String focusNear() throws SerialPortException, InterruptedException {
        focusCommand.near().execute();
        return "redirect:/?command=Focus_near";
    }

    @RequestMapping(value = "/Focus_autoFocusOn")
    public String autoFocusOn() throws SerialPortException, InterruptedException {
        focusCommand.autoFocusOn().execute();
        return "redirect:/?command=Focus_autoFocusOn";
    }

    @RequestMapping(value = "/Focus_manualFocusOn")
    public String manualFocusOn() throws SerialPortException, InterruptedException {
        focusCommand.manualFocusOn().execute();
        return "redirect:/?command=Focus_manualFocusOn";
    }

    @RequestMapping(value = "/Focus_mixedFocus")
    public String mixedFocus() throws SerialPortException, InterruptedException {
        focusCommand.mixedFocus().execute();
        return "redirect:/?command=Focus_mixedFocus";
    }

    @RequestMapping(value = "/Focus_direct")
    public String directFocus(@RequestParam int focusData) throws SerialPortException, InterruptedException {
        focusCommand.direct(focusData).execute();
        return "redirect:/?command=Focus_direct";
    }
}
