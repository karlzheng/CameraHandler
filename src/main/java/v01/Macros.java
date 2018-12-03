package v01;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Macros {

    private static List<CommandList.CamMethod> newMacroMethods = new LinkedList<>();
    private static List<Macro> macros = new LinkedList<>();

    public static void addMethod(CommandList.CamMethod method) {
        newMacroMethods.add(method);
    }

    public static List<CommandList.CamMethod> getNewMacroMethods() {
        return newMacroMethods;
    }

    public static void addMacro(String name) {
//        macros.add(new Macro(name, new ArrayList<>()));
//        newMacroMethods.clear();
    }

    public static List<Macro> getMacros() {
        return macros;
    }
}

class Macro {

    private String name;
    private List<CommandList.CamMethod> methods;

    public Macro(String name, List<CommandList.CamMethod> macroMethods) {
        this.name = name;
        methods = macroMethods;
    }

    public String getName() {
        return name;
    }

    public List<CommandList.CamMethod> getMethods() {
        return methods;
    }
}
