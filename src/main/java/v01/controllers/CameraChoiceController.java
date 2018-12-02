package v01.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import v01.commands.Command;

@Controller
public class CameraChoiceController {

    @RequestMapping(value = "/cameraChoice")
    public String cameraChoice(@RequestParam int camera){
        Command.setSelectedCamera(camera);
        if (camera > 0)
            return "redirect:/?camera=Camera " + camera;
        else
            return "redirect:/?camera=All cameras";
    }

}
