package v01.controllers;

import jssc.SerialPortException;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import v01.commands.ZoomCommand;

@Controller
public class ZoomCommandController {

    private ZoomCommand zoomCommand = new ZoomCommand();

    @RequestMapping(value = "/Zoom_stop")
    public String zoomStop() throws SerialPortException, InterruptedException {
        zoomCommand.stop().execute();
        return "redirect:/?command=Zoom_stop";
    }

    @RequestMapping(value = "/Zoom_tele")
    public String zoomTele() throws SerialPortException, InterruptedException {
        zoomCommand.tele().execute();
        return "redirect:/?command=Zoom_tele";
    }

    @RequestMapping(value = "/Zoom_wide")
    public String zoomWide() throws SerialPortException, InterruptedException {
        zoomCommand.wide().execute();
        return "redirect:/?command=Zoom_wide";
    }

    @RequestMapping(value = "/Zoom_teleWithSpeed")
    public String zoomTele(@RequestParam int zoomSpeed) throws SerialPortException, InterruptedException {
        zoomCommand.tele(zoomSpeed).execute();
        return "redirect:/?command=Zoom_teleWithSpeed";
    }

    @RequestMapping(value = "/Zoom_wideWithSpeed")
    public String zoomWide(@RequestParam int zoomSpeed) throws SerialPortException, InterruptedException {
        zoomCommand.wide(zoomSpeed).execute();
        return "redirect:/?command=Zoom_wideWithSpeed";
    }

    @RequestMapping(value = "/Zoom_direct")
    public String zoomDirect(@RequestParam int zoomData) throws SerialPortException, InterruptedException {
        zoomCommand.direct(zoomData).execute();
        return "redirect:/?command=Zoom_direct";
    }
}
