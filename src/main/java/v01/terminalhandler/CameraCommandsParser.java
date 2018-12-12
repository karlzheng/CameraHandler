package v01.terminalhandler;

import v01.CamMethod;
import v01.CommandList;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class CameraCommandsParser {

    private static final String SEPARATOR = " ";

    private final Map<String, List<CamMethod>> commandList;

    public CameraCommandsParser(){
        this.commandList = CommandList.getCommands();
    }

    public CommandContainer parseCommand(String commendText){
        String[] command = commendText.toLowerCase().split(SEPARATOR);

        if (validateComandGroup(command[0])){
            throw new IllegalArgumentException("Niepoprawna grupa komend!");
        }
        if (validateComandName(command[0], command[1])){
            throw new IllegalArgumentException("Niepoprawna komenda lub komenda nie znajduje się w tej grupie!");
        }
        if (validateNumberOfParameters(command)){
            throw new IndexOutOfBoundsException("Niepoprawna liczba parametrów!");
        }

        return new CommandContainer(command[0], command[1], getParameters(command));
    }


    private boolean validateComandGroup(String commandGroup){
        return commandList.keySet().stream().anyMatch(e -> e.toLowerCase().equals(commandGroup));
    }

    private boolean validateComandName(String commandGroup, String commandName){
        return commandList.get(commandGroup).stream().anyMatch(e -> e.getName().toLowerCase().equals(commandName));
    }

    private boolean validateNumberOfParameters(String[] command){
        return command.length - 2 == commandList.get(command[0]).stream()
                .filter(e -> e.getName().toLowerCase().equals(command[1]))
                .findFirst()
                .get().getCountOfParams();
    }

    private List<String> getParameters(String[] command){
        List<String> params = new ArrayList<>();
        for (int i = 2; i < command.length; i++){
            params.add(command[i]);
        }
        return params;
    }
}
