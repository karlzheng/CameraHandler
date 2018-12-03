package v01.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import v01.commands.MemoryCommand;

@Controller
public class MemoryCommandController {

    private MemoryCommand memoryCommand = new MemoryCommand();

    @RequestMapping(value = "/Memory_reset")
    public String memoryReset(@RequestParam int positionNumber){
        memoryCommand.reset(positionNumber).execute();
        return "redirect:/?command=Memory_reset";
    }

    @RequestMapping(value = "/Memory_set")
    public String memorySet(@RequestParam int positionNumber){
        memoryCommand.set(positionNumber).execute();
        return "redirect:/?command=Memory_set";
    }

    @RequestMapping(value = "/Memory_recall")
    public String memoryRecall(@RequestParam int positionNumber){
        memoryCommand.recall(positionNumber).execute();
        return "redirect:/?command=Memory_recall";
    }
}
