package v01;

import v01.commands.*;

import java.util.*;

public class CommandList {

    private static Map<String, List<CamMethod>> commands;

    static {
        commands = new HashMap<>();

        Param[] address = new Param[]{new Param("address", 0, 8)};
        Param[] delay = new Param[]{new Param("seconds",1,120)};
        Param[] empty = new Param[]{};
        Param[] focusData = new Param[]{new Param("focusData", 0, 100)};
        Param[] posNum = new Param[]{new Param("positionNumber", 0, 5)};
        Param[] sockNum = new Param[]{new Param("socketNumber",0,1)};
        Param[] panSpdTilSpd = new Param[]{
                new Param("panSpeed", 1, 18),
                new Param("tiltSpeed", 1, 14)};
        Param[] panTilSpdPos = new Param[]{
                new Param("panSpeed", 1, 18),
                new Param("tiltSpeed", 1, 14),
                new Param("panPosition", 0, 100),
                new Param("tiltPosition", 0, 100)};
        Param[] cornerPanTilPos = new Param[]{
                new Param("corner", 0, 1),
                new Param("panPosition", 0, 100),
                new Param("tiltPosition", 0, 100)};
        Param[] corner = new Param[]{new Param("corner", 0, 1)};
        Param[] zoomSpeed = new Param[]{new Param("zoomSpeed", 2, 7)};
        Param[] zoomData = new Param[]{new Param("zoomData", 0, 100)};

        List<CamMethod> addressSetList = Arrays.asList(
                new CamMethod("setAddress", address, AddressSetCommand.class),
                new CamMethod("ifClear", empty, AddressSetCommand.class));
        List<CamMethod> delayList = Collections.singletonList(
                new CamMethod("delay", delay, DelayCommand.class));
        List<CamMethod> ataeList = Arrays.asList(
                new CamMethod("on", empty, ATAECommand.class),
                new CamMethod("off", empty, ATAECommand.class),
                new CamMethod("onOff", empty, ATAECommand.class));
        List<CamMethod> atAutoZoomList = Arrays.asList(
                new CamMethod("on", empty, ATAutoZoomCommand.class),
                new CamMethod("off", empty, ATAutoZoomCommand.class),
                new CamMethod("onOff", empty, ATAutoZoomCommand.class));
        List<CamMethod> atmdFrameDisplayList = Arrays.asList(
                new CamMethod("on", empty, ATMDFrameDisplayCommand.class),
                new CamMethod("off", empty, ATMDFrameDisplayCommand.class),
                new CamMethod("onOff", empty, ATMDFrameDisplayCommand.class));
        List<CamMethod> atModeList = Arrays.asList(
                new CamMethod("on", empty, ATModeCommand.class),
                new CamMethod("off", empty, ATModeCommand.class),
                new CamMethod("onOff", empty, ATModeCommand.class));
        List<CamMethod> atOffsetList = Arrays.asList(
                new CamMethod("on", empty, ATOffsetCommand.class),
                new CamMethod("off", empty, ATOffsetCommand.class),
                new CamMethod("onOff", empty, ATOffsetCommand.class));
        List<CamMethod> datascreenList = Arrays.asList(
                new CamMethod("on", empty, DatascreenCommand.class),
                new CamMethod("off", empty, DatascreenCommand.class),
                new CamMethod("onOff", empty, DatascreenCommand.class));
        List<CamMethod> irReceiveList = Arrays.asList(
                new CamMethod("on", empty, IRReceiveCommand.class),
                new CamMethod("off", empty, IRReceiveCommand.class),
                new CamMethod("onOff", empty, IRReceiveCommand.class));
        List<CamMethod> backlightList = Arrays.asList(
                new CamMethod("on", empty, BacklightCommand.class),
                new CamMethod("off", empty, BacklightCommand.class));
        List<CamMethod> irReceiveReturnList = Arrays.asList(
                new CamMethod("on", empty, IRReceiveReturnCommand.class),
                new CamMethod("off", empty, IRReceiveReturnCommand.class));
        List<CamMethod> keyLockList = Arrays.asList(
                new CamMethod("on", empty, KeyLockCommand.class),
                new CamMethod("off", empty, KeyLockCommand.class));
        List<CamMethod> powerList = Arrays.asList(
                new CamMethod("on", empty, PowerCommand.class),
                new CamMethod("off", empty, PowerCommand.class));
        List<CamMethod> atmdStartStopList = Collections.singletonList(
                new CamMethod("startStop", empty, ATMDStartStopCommand.class));
        List<CamMethod> brightList = Arrays.asList(
                new CamMethod("reset", empty, BrightCommand.class),
                new CamMethod("up", empty, BrightCommand.class),
                new CamMethod("down", empty, BrightCommand.class));
        List<CamMethod> focusList = Arrays.asList(
                new CamMethod("stop", empty, FocusCommand.class),
                new CamMethod("far", empty, FocusCommand.class),
                new CamMethod("near", empty, FocusCommand.class),
                new CamMethod("autoFocusOn", empty, FocusCommand.class),
                new CamMethod("manualFocusOn", empty, FocusCommand.class),
                new CamMethod("mixedFocus", empty, FocusCommand.class),
                new CamMethod("direct", focusData, FocusCommand.class));
        List<CamMethod> memoryList = Arrays.asList(
                new CamMethod("reset", posNum, MemoryCommand.class),
                new CamMethod("set", posNum, MemoryCommand.class),
                new CamMethod("recall", posNum, MemoryCommand.class));
        List<CamMethod> miscList = Arrays.asList(
                new CamMethod("addressSet", empty, MiscCommand.class),
                new CamMethod("IFClear", empty, MiscCommand.class),
                new CamMethod("commandCancel", sockNum, MiscCommand.class));
        List<CamMethod> panTiltList = Arrays.asList(
                new CamMethod("up", panSpdTilSpd, PanTiltCommand.class),
                new CamMethod("down", panSpdTilSpd, PanTiltCommand.class),
                new CamMethod("left", panSpdTilSpd, PanTiltCommand.class),
                new CamMethod("right", panSpdTilSpd, PanTiltCommand.class),
                new CamMethod("upLeft", panSpdTilSpd, PanTiltCommand.class),
                new CamMethod("upRight", panSpdTilSpd, PanTiltCommand.class),
                new CamMethod("downLeft", panSpdTilSpd, PanTiltCommand.class),
                new CamMethod("downRight", panSpdTilSpd, PanTiltCommand.class),
                new CamMethod("stop", panSpdTilSpd, PanTiltCommand.class),
                new CamMethod("absolutePosition", panTilSpdPos, PanTiltCommand.class),
                new CamMethod("relativePosition", panTilSpdPos, PanTiltCommand.class),
                new CamMethod("home", empty, PanTiltCommand.class),
                new CamMethod("reset", empty, PanTiltCommand.class));
        List<CamMethod> panTiltLimitSetList = Arrays.asList(
                new CamMethod("limitSet", cornerPanTilPos, PanTiltLimitSetCommand.class),
                new CamMethod("limitClear", corner, PanTiltLimitSetCommand.class));
        List<CamMethod> zoomList = Arrays.asList(
                new CamMethod("stop", empty, ZoomCommand.class),
                new CamMethod("tele", empty, ZoomCommand.class),
                new CamMethod("wide", empty, ZoomCommand.class),
                new CamMethod("teleWithSpeed", zoomSpeed, ZoomCommand.class),
                new CamMethod("wideWithSpeed", zoomSpeed, ZoomCommand.class),
                new CamMethod("direct", zoomData, ZoomCommand.class));

        commands.put("AddressSet", addressSetList);
        commands.put("Delay", delayList);
        commands.put("ATAE", ataeList);
        commands.put("ATAutoZoom", atAutoZoomList);
        commands.put("ATMDFrameDisplay", atmdFrameDisplayList);
        commands.put("ATMDStartStop", atmdStartStopList);
        commands.put("ATMode", atModeList);
        commands.put("ATOffset", atOffsetList);
        commands.put("Backlight", backlightList);
        commands.put("Bright", brightList);
        commands.put("Datascreen", datascreenList);
        commands.put("Focus", focusList);
        commands.put("IRReceive", irReceiveList);
        commands.put("IRReceiveReturn", irReceiveReturnList);
        commands.put("KeyLock", keyLockList);
        commands.put("Memory", memoryList);
        commands.put("Misc", miscList);
        commands.put("PanTilt", panTiltList);
        commands.put("PanTiltLimitSet", panTiltLimitSetList);
        commands.put("Power", powerList);
        commands.put("Zoom", zoomList);
    }

    public static Map<String, List<CamMethod>> getCommands() {
        return commands;
    }

    public static Param[] getParams(String cmdFamily, String cmdName) {
        Param[] methodParams = new Param[]{};
        if (cmdFamily != null && cmdName != null) {
            List<CamMethod> camMethods = CommandList.getCommands().get(cmdFamily);

            for (CamMethod command : camMethods) {
                if (Objects.equals(command.getName(), cmdName)) {
                    methodParams = command.getParams();
                    break;
                }
            }
        }
        return methodParams;
    }
}
