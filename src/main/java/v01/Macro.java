package v01;

import java.util.List;

public class Macro {

    private String name;
    private List<CamMethod> methods;

    public Macro(String name, List<CamMethod> macroMethods) {
        this.name = name;
        methods = macroMethods;
    }

    public String getName() {
        return name;
    }

    public List<CamMethod> getMethods() {
        return methods;
    }
}
