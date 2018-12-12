package v01;

import v01.commands.Command;
import v01.commands.KeyLockCommand;

import java.util.*;
import java.util.function.Supplier;

import static java.util.stream.Collectors.toList;

public class CommandList {

    private static Map<String, List<CamMethod>> commands;

    static {
        commands = new HashMap<>();

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

        List<CamMethod> delayList = Collections.singletonList(
                new CamMethod("delay", delay));
        List<CamMethod> onOff3List = Arrays.asList(
                new CamMethod("on", empty),
                new CamMethod("off", empty),
                new CamMethod("onOff", empty));
        List<CamMethod> onOff2List = Arrays.asList(
                new CamMethod("on", empty),
                new CamMethod("off", empty));
        List<CamMethod> atmdStartStopList = Collections.singletonList(
                new CamMethod("startStop", empty));
        List<CamMethod> brightList = Arrays.asList(
                new CamMethod("reset", empty),
                new CamMethod("up", empty),
                new CamMethod("down", empty));
        List<CamMethod> focusList = Arrays.asList(
                new CamMethod("stop", empty),
                new CamMethod("far", empty),
                new CamMethod("near", empty),
                new CamMethod("autoFocusOn", empty),
                new CamMethod("manualFocusOn", empty),
                new CamMethod("mixedFocus", empty),
                new CamMethod("direct", focusData));
        List<CamMethod> memoryList = Arrays.asList(
                new CamMethod("reset", posNum),
                new CamMethod("set", posNum),
                new CamMethod("recall", posNum));
        List<CamMethod> miscList = Arrays.asList(
                new CamMethod("addressSet", empty),
                new CamMethod("IFClear", empty),
                new CamMethod("commandCancel", sockNum));
        List<CamMethod> panTiltList = Arrays.asList(
                new CamMethod("up", panSpdTilSpd),
                new CamMethod("down", panSpdTilSpd),
                new CamMethod("left", panSpdTilSpd),
                new CamMethod("right", panSpdTilSpd),
                new CamMethod("upLeft", panSpdTilSpd),
                new CamMethod("upRight", panSpdTilSpd),
                new CamMethod("downLeft", panSpdTilSpd),
                new CamMethod("downRight", panSpdTilSpd),
                new CamMethod("stop", panSpdTilSpd),
                new CamMethod("absolutePosition", panTilSpdPos),
                new CamMethod("relativePosition", panTilSpdPos),
                new CamMethod("home", empty),
                new CamMethod("reset", empty));
        List<CamMethod> panTiltLimitSetList = Arrays.asList(
                new CamMethod("limitSet", cornerPanTilPos),
                new CamMethod("limitClear", corner));
        List<CamMethod> zoomList = Arrays.asList(
                new CamMethod("stop", empty),
                new CamMethod("tele", empty),
                new CamMethod("wide", empty),
                new CamMethod("teleWithSpeed", zoomSpeed),
                new CamMethod("wideWithSpeed", zoomSpeed),
                new CamMethod("direct", zoomData));

        commands.put("Delay", delayList);
        commands.put("ATAE", onOff3List);
        commands.put("ATAutoZoom", onOff3List);
        commands.put("ATMDFrameDisplay", onOff3List);
        commands.put("ATMDStartStop", atmdStartStopList);
        commands.put("ATMode", onOff3List);
        commands.put("ATOffset", onOff3List);
        commands.put("Backlight", onOff2List);
        commands.put("Bright", brightList);
        commands.put("Datascreen", onOff3List);
        commands.put("Focus", focusList);
        commands.put("IRReceive", onOff3List);
        commands.put("IRReceiveReturn", onOff2List);
        commands.put("KeyLock", onOff2List);
        commands.put("Memory", memoryList);
        commands.put("Misc", miscList);
        commands.put("PanTilt", panTiltList);
        commands.put("PanTiltLimitSet", panTiltLimitSetList);
        commands.put("Power", onOff2List);
        commands.put("Zoom", zoomList);
    }

    public static Map<String, List<CamMethod>> getCommands() {
        return commands;
    }

    public static class CamMethod {
        private String name;
        private Param[] params;
        private Supplier supplier;

        public CamMethod(CamMethod camMethod) {
            this.name = camMethod.name;
            this.params = new Param[camMethod.params.length];
            for (int i = 0; i < camMethod.params.length; i++)
                this.params[i] = new Param(camMethod.params[i]);
        }

        public CamMethod(String name, Param[] params) {
            this.name = name;
            this.params = params;
        }

        public String getName() {
            return name;
        }

        public Param[] getParams() {
            return params;
        }

        public int getCountOfParams(){
            return params.length;
        }

        public void setParams(String args) {
            if (args.isEmpty())
                return;

            List<Integer> arguments = Arrays.stream(args.split("_")).map(Integer::new).collect(toList());

            for (int i = 0; i < arguments.size(); i++)
                params[i].setVal(arguments.get(i));
        }

        public String getParamsString() {
            if (params.length == 0)
                return "none";

            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < params.length; i++) {
                sb.append(params[i].getName());
                sb.append(": ");
                sb.append(params[i].getVal());

                if (i + 1 < params.length)
                    sb.append(", ");
            }

            return sb.toString();
        }
    }

    public static Param[] getParams(String cmdFamily, String cmdName) {
        Param[] methodParams = new Param[]{};
        if (cmdFamily != null && cmdName != null) {
            List<CommandList.CamMethod> camMethods = CommandList.getCommands().get(cmdFamily);

            for (CommandList.CamMethod command : camMethods) {
                if (Objects.equals(command.getName(), cmdName)) {
                    methodParams = command.getParams();
                    break;
                }
            }
        }
        return methodParams;
    }

    public static class Param {
        private String name;
        private int minVal;
        private int maxVal;
        private int val;

        public Param(String name, int minVal, int maxVal) {
            this.name = name;
            this.minVal = minVal;
            this.maxVal = maxVal;
        }

        public Param(Param param) {
            this.name = param.name;
            this.minVal = param.minVal;
            this.maxVal = param.maxVal;
            this.val = param.val;
        }

        public String getName() {
            return name;
        }

        public int getMinVal() {
            return minVal;
        }

        public int getMaxVal() {
            return maxVal;
        }

        public void setVal(int val) {
            this.val = val;
        }

        public int getVal() {
            return val;
        }
    }
}
