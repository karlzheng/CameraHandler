package v01.terminalhandler;

import v01.CamMethod;
import v01.CommandList;
import v01.commands.ATAECommand;
import v01.commands.Command;

import java.util.List;
import java.util.Map;

public class CameraCommandsTranslator {

    private final Map<String, List<CamMethod>> commandList;

    public CameraCommandsTranslator(){
        this.commandList = CommandList.getCommands();
    }

    public Command transalate(CommandContainer command){
        return new ATAECommand().on();
//        switch (command.getGroupName()){
//            case "atae": new ATAECommand();                        }
//            case "atautozoom": return new ATAutoZoomCommand();
//            case "atmdframedisplay": return new ATMDFrameDisplayCommand();
//            case "atmdstartstop": return new ATMDStartStopCommand();
//            case "atmode": return new ATModeCommand();
//            case "atoffset": return new ATOffsetCommand();
//            case "backlight": return new BacklightCommand();
//            case "bright": return new BrightCommand();
//            case "datascreen": return new DatascreenCommand();
//            case "focus": return new FocusCommand();
//            case "irreceive": return new IRReceiveCommand();
//            case "irreceivereturn": return new IRReceiveReturnCommand();
//            case "keylock": return new KeyLockCommand();
//            case "memory": return new MemoryCommand();
//            case "misc": return new MiscCommand();
//            case "pantilt": return new PanTiltCommand();
//            case "pantiltlimit": return new PanTiltLimitSetCommand();
//            case "power": return new PowerCommand();
//            case "zoom": return new ZoomCommand();
//            default: return null;
//        }
//        return null;
    }

}
