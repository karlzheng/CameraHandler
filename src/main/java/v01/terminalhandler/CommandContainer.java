package v01.terminalhandler;

import java.util.ArrayList;
import java.util.List;

public class CommandContainer {

    private String groupName;

    private String commandName;

    private List<Integer> params;

    public CommandContainer(String groupName, String commandName, List<Integer> params){
        this.groupName = groupName;
        this.commandName = commandName;
        this.params = params;
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public String getCommandName() {
        return commandName;
    }

    public void setCommandName(String commandName) {
        this.commandName = commandName;
    }

    public List<Integer> getParams() {
        return params;
    }

    public void setParams(List<Integer> params) {
        this.params = params;
    }
}
