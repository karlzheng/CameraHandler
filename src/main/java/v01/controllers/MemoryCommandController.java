package v01.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MemoryCommandController {

    @RequestMapping(value = "/memoryReset")
    public String memoryReset(int positionNumber){

        return "redirect:/?command=memoryReset";
    }

    @RequestMapping(value = "/memorySet")
    public String memorySet(int positionNumber){

        return "redirect:/?command=memorySet";
    }

    @RequestMapping(value = "/memoryRecall")
    public String memoryRecall(int positionNumber){

        return "redirect:/?command=memoryRecall";
    }
}
