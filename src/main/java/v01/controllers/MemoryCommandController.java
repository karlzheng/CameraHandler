package v01.controllers;

import jssc.SerialPortException;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import v01.commands.MemoryCommand;

@Controller
public class MemoryCommandController {

    private MemoryCommand memoryCommand = new MemoryCommand();

    @RequestMapping(value = "/Memory_reset")
    public String memoryReset(@RequestParam int positionNumber) throws SerialPortException, InterruptedException {
        memoryCommand.reset(positionNumber).execute();
        return "redirect:/?command=Memory_reset";
    }

    @RequestMapping(value = "/Memory_set")
    public String memorySet(@RequestParam int positionNumber) throws SerialPortException, InterruptedException {
        memoryCommand.set(positionNumber).execute();
        return "redirect:/?command=Memory_set";
    }

    @RequestMapping(value = "/Memory_recall")
    public String memoryRecall(@RequestParam int positionNumber) throws SerialPortException, InterruptedException {
        memoryCommand.recall(positionNumber).execute();
        return "redirect:/?command=Memory_recall";
    }
}
