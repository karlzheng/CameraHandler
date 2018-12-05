package v01.terminalhandler;

import java.util.ArrayList;
import java.util.List;

public class CommandContainer {

    private String groupName;

    private String commandName;

    private List<String> params;

    public CommandContainer(String groupName, String commandName, List<String> params){
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

    public List<String> getParams() {
        return params;
    }

    public void setParams(List<String> params) {
        this.params = params;
    }
}
