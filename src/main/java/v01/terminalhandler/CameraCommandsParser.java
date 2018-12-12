package v01.terminalhandler;

import v01.CamMethod;
import v01.CommandList;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CameraCommandsParser {

    private static final String SEPARATOR = " ";

    private final Map<String, List<CamMethod>> commandList = new HashMap<>();

    public CameraCommandsParser(){
        Map<String, List<CamMethod>> map = CommandList.getCommands();
        List<CamMethod> temp = null;

        for (String element: map.keySet()){
            temp = map.get(element);
            this.commandList.put(element.toLowerCase(), temp);
        }
    }

    public CommandContainer parseCommand(String commendText) {
        String[] command = commendText.toLowerCase().split(SEPARATOR);

        if (!validateCommandGroup(command[0])){
            System.out.println("Niepoprawna grupa komend!");
            return null;
        }
        if(command.length == 1){
            System.out.println("Nie podano komendy!");
            return null;
        }
        if (!validateCommandName(command[0], command[1])){
            System.out.println("Niepoprawna komenda lub komenda nie znajduje się w tej grupie!");
            return null;
        }
        if (!validateNumberOfParameters(command)){
            System.out.println("Niepoprawna liczba parametrów!");
            return null;
        }

        System.out.println("ok.");
        return new CommandContainer(command[0], command[1], getParameters(command));
    }


    private boolean validateCommandGroup(String commandGroup){
        return commandList.keySet().stream().anyMatch(e -> e.toLowerCase().equals(commandGroup));
    }

    private boolean validateCommandName(String commandGroup, String commandName){
        if(!commandList.containsKey(commandGroup)){
            return false;
        }
        return commandList.get(commandGroup).stream().anyMatch(e -> e.getName().toLowerCase().equals(commandName));
    }

    private boolean validateNumberOfParameters(String[] command){
        if(!commandList.get(command[0]).stream().anyMatch(e -> e.getName().toLowerCase().equals(command[1]))){
            return false;
        }
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
