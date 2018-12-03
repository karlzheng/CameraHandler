package v01.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import v01.commands.ATMDStartStopCommand;

@Controller
public class ATMDStartStopCommandController {

    private ATMDStartStopCommand atmdStartStopCommand = new ATMDStartStopCommand();

    @RequestMapping(value = "/ATMDStartStop_startStop")
    public String atMDStartStop(){
        atmdStartStopCommand.startStop().execute();
        return "redirect:/?command=ATMDStartStop_startStop";
    }
}
