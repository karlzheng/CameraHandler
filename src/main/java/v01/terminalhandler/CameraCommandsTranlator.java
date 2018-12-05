package v01.terminalhandler;

import v01.CommandList;
import v01.commands.*;

import java.util.List;
import java.util.Map;

public class CameraCommandsTranlator {

    private final Map<String, List<CommandList.CamMethod>> commandList;

    public CameraCommandsTranlator(){
        this.commandList = CommandList.getCommands();
    }

    public Command transalate(CommandContainer command){
//        switch (command.getGroupName()){
//            case "atae": new ATAECommand();                        }
//            case "atautozoom": return new ATAutoZoomCommand();
//            case "atmdframedisplay": return new ATMDFrameDisplayCommand();
//
//        }
    return null;
    }

}
