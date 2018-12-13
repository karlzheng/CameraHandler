package v01;

import jssc.SerialPortException;
import v01.commands.Command;
import v01.commands.GeneralCommand;

import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

public class CamMethod {
    private final Class<? extends GeneralCommand> the_class;
    private final String name;
    private Param[] params;

    public CamMethod(CamMethod camMethod) {
        this.name = camMethod.name;
        this.params = new Param[camMethod.params.length];
        for (int i = 0; i < camMethod.params.length; i++)
            this.params[i] = new Param(camMethod.params[i]);
        this.the_class = camMethod.the_class;
    }

    public CamMethod(String name, Param[] params, Class<? extends GeneralCommand> the_class) {
        this.name = name;
        this.params = params;
        this.the_class = the_class;
    }

    public void execute() {
        try {
            Class<?> args_classes[] = new Class[params.length];
            for (int i = 0; i < params.length; i++)
                args_classes[i] = int.class;

            Object[] args = Stream.of(params).map(Param::getVal).toArray();
            Command command = (Command)the_class.getDeclaredMethod(name, args_classes)
                    .invoke(the_class.newInstance(), args);
            command.execute();

            Thread.sleep(1000);
        } catch (NoSuchMethodException | IllegalAccessException | InstantiationException |
                InvocationTargetException | InterruptedException | SerialPortException e) {
            e.printStackTrace();
        }
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
