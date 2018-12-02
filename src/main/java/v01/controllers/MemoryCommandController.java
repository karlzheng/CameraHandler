package v01.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import v01.commands.MemoryCommand;

@Controller
public class MemoryCommandController {

    private MemoryCommand memoryCommand = new MemoryCommand();

    @RequestMapping(value = "/memoryReset")
    public String memoryReset(@RequestParam int positionNumber){
        memoryCommand.reset(positionNumber).execute();
        return "redirect:/?command=memoryReset";
    }

    @RequestMapping(value = "/memorySet")
    public String memorySet(@RequestParam int positionNumber){
        memoryCommand.set(positionNumber).execute();
        return "redirect:/?command=memorySet";
    }

    @RequestMapping(value = "/memoryRecall")
    public String memoryRecall(@RequestParam int positionNumber){
        memoryCommand.recall(positionNumber).execute();
        return "redirect:/?command=memoryRecall";
    }
}
