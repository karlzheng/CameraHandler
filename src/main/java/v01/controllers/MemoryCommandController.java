package v01.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MemoryCommandController {

    @RequestMapping(value = "/memoryReset")
    public String memoryReset(@RequestParam int positionNumber){

        return "redirect:/?command=memoryReset";
    }

    @RequestMapping(value = "/memorySet")
    public String memorySet(@RequestParam int positionNumber){

        return "redirect:/?command=memorySet";
    }

    @RequestMapping(value = "/memoryRecall")
    public String memoryRecall(@RequestParam int positionNumber){

        return "redirect:/?command=memoryRecall";
    }
}
