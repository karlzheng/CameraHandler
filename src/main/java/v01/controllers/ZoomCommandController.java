package v01.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import v01.commands.ZoomCommand;

@Controller
public class ZoomCommandController {

    private ZoomCommand zoomCommand = new ZoomCommand();

    @RequestMapping(value = "/zoomStop")
    public String zoomStop(){
        zoomCommand.stop().execute();
        return "redirect:/?command=zoopStop";
    }

    @RequestMapping(value = "/zoomTele")
    public String zoomTele(){
        zoomCommand.tele().execute();
        return "redirect:/?command=zoomTele";
    }

    @RequestMapping(value = "/zoomWide")
    public String zoomWide(){
        zoomCommand.wide().execute();
        return "redirect:/?command=zoomWide";
    }

    @RequestMapping(value = "/zoomTeleWithSpeed")
    public String zoomTele(@RequestParam int zoomSpeed){
        zoomCommand.tele(zoomSpeed).execute();
        return "redirect:/?command=zoomTeleWithSpeed";
    }

    @RequestMapping(value = "/zoomWideWithSpeed")
    public String zoomWide(@RequestParam int zoomSpeed){
        zoomCommand.wide(zoomSpeed).execute();
        return "redirect:/?command=zoomWideWithSpeed";
    }

    @RequestMapping(value = "/zoomDirect")
    public String zoomDirect(@RequestParam int zoomData){
        zoomCommand.direct(zoomData).execute();
        return "redirect:/?command=zoomDirect";
    }
}
