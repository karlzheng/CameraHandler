package v01.controllers;

import jssc.SerialPortException;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import v01.commands.PanTiltCommand;

@Controller
public class PanTiltCommandController {

    private PanTiltCommand panTiltCommand = new PanTiltCommand();

    @RequestMapping(value = "/PanTilt_home")
    public String panTiltHome() throws SerialPortException, InterruptedException {
        panTiltCommand.home().execute();
        return "redirect:/?command=PanTilt_home";
    }

    @RequestMapping(value = "/PanTilt_up")
    public String panTiltUp(@RequestParam int panSpeed, @RequestParam int tiltSpeed) throws SerialPortException, InterruptedException {
        panTiltCommand.up(panSpeed, tiltSpeed).execute();
        return "redirect:/?command=PanTilt_up";
    }

    @RequestMapping(value = "/PanTilt_down")
    public String panTiltDown(@RequestParam int panSpeed, @RequestParam int tiltSpeed) throws SerialPortException, InterruptedException {
        panTiltCommand.down(panSpeed, tiltSpeed).execute();
        return "redirect:/?command=PanTilt_down";
    }

    @RequestMapping(value = "/PanTilt_left")
    public String panTiltLeft(@RequestParam int panSpeed, @RequestParam int tiltSpeed) throws SerialPortException, InterruptedException {
        panTiltCommand.left(panSpeed, tiltSpeed).execute();
        return "redirect:/?command=PanTilt_left";
    }

    @RequestMapping(value = "/PanTilt_right")
    public String panTiltRight(@RequestParam int panSpeed, @RequestParam int tiltSpeed) throws SerialPortException, InterruptedException {
        panTiltCommand.right(panSpeed, tiltSpeed).execute();
        return "redirect:/?command=PanTilt_right";
    }

    @RequestMapping(value = "/PanTilt_upLeft")
    public String panTiltUpLeft(@RequestParam int panSpeed, @RequestParam int tiltSpeed) throws SerialPortException, InterruptedException {
        panTiltCommand.upLeft(panSpeed, tiltSpeed).execute();
        return "redirect:/?command=PanTilt_upLeft";
    }

    @RequestMapping(value = "/PanTilt_upRight")
    public String panTiltUpRight(@RequestParam int panSpeed, @RequestParam int tiltSpeed) throws SerialPortException, InterruptedException {
        panTiltCommand.upRight(panSpeed, tiltSpeed).execute();
        return "redirect:/?command=PanTilt_upRight";
    }

    @RequestMapping(value = "/PanTilt_downLeft")
    public String panTiltDownLeft(@RequestParam int panSpeed, @RequestParam int tiltSpeed) throws SerialPortException, InterruptedException {
        panTiltCommand.downLeft(panSpeed, tiltSpeed).execute();
        return "redirect:/?command=PanTilt_downLeft";
    }

    @RequestMapping(value = "/PanTilt_downRight")
    public String panTiltDownRight(@RequestParam int panSpeed, @RequestParam int tiltSpeed) throws SerialPortException, InterruptedException {
        panTiltCommand.downRight(panSpeed, tiltSpeed).execute();
        return "redirect:/?command=PanTilt_downRight";
    }

    @RequestMapping(value = "/PanTilt_stop")
    public String panTiltStop(@RequestParam int panSpeed, @RequestParam int tiltSpeed) throws SerialPortException, InterruptedException {
        panTiltCommand.stop(panSpeed, tiltSpeed).execute();
        return "redirect:/?command=PanTilt_stop";
    }

    @RequestMapping(value = "/PanTilt_absolutePosition")
    public String panTiltAbsolutePosition(@RequestParam int panSpeed, @RequestParam int tiltSpeed, @RequestParam int panPosition, @RequestParam int tiltPosition)
            throws SerialPortException, InterruptedException {
        panTiltCommand.absolutePosition(panSpeed, tiltSpeed, panPosition, tiltPosition).execute();
        return "redirect:/?command=PanTilt_absolutePosition";
    }

    @RequestMapping(value = "/PanTilt_relativePosition")
    public String panTiltRelativePosition(@RequestParam int panSpeed, @RequestParam int tiltSpeed, @RequestParam int panPosition, @RequestParam int tiltPosition)
            throws SerialPortException, InterruptedException {
        panTiltCommand.relativePosition(panSpeed, tiltSpeed, panPosition, tiltPosition).execute();
        return "redirect:/?command=PanTilt_relativePosition";
    }
}
