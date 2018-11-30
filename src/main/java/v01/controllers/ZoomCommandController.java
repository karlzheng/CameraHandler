package v01.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ZoomCommandController {

    @RequestMapping(value = "/zoomStop")
    public String zoomStop(){

        return "redirect:/?command=zoopStop";
    }

    @RequestMapping(value = "/zoomTele")
    public String zoomTele(){

        return "redirect:/?command=zoomTele";
    }

    @RequestMapping(value = "/zoomWide")
    public String zoomWide(){

        return "redirect:/?command=zoomWide";
    }

    @RequestMapping(value = "/zoomTeleWithSpeed")
    public String zoomTele(int speed){

        return "redirect:/?command=zoomTeleWithSpeed";
    }

    @RequestMapping(value = "/zoomWideWithSpeed")
    public String zoomWide(int speed){

        return "redirect:/?command=zoomWideWithSpeed";
    }

    @RequestMapping(value = "/zoomDirect")
    public String zoomDirect(int data){

        return "redirect:/?command=zoomDirect";
    }
}
