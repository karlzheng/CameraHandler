package v01.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import v01.CamMethod;
import v01.CommandList;
import v01.Macro;
import v01.Macros;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

@Controller
public class MacrosController {

    @RequestMapping(value = "/addMacro")
    public String addMacro(@RequestParam String macroName) {
        if(!Macros.isNameBusy(macroName)){
            Macros.addMacro(macroName);
        } else {
            return "redirect:/?alert=nameisbusy";
        }
        return "redirect:/";
    }

    @RequestMapping(value = "/chooseCommand")
    public String chooseCommand(@RequestParam String command) {
        String[] cmd = command.split("_");
        return "redirect:/?cmdFam=" + cmd[0] + "&cmd=" + cmd[1];
    }

    @RequestMapping(value = "/addCommand")
    public String addCommand(@RequestParam String commandFamily, @RequestParam String commandName,
                             @RequestParam String args) {

        if (commandFamily != null && commandName != null) {
            List<CamMethod> camMethods = CommandList.getCommands().get(commandFamily);

            for (CamMethod command : camMethods) {
                if (Objects.equals(command.getName(), commandName)) {
                    CamMethod newMethod = new CamMethod(command);
                    newMethod.setParams(args);
                    Macros.addMethod(newMethod);
                    break;
                }
            }
        }
        return "redirect:/";
    }

    @RequestMapping(value = "/executeMacro")
    public String runMacros(@RequestParam String macroName) {
        Macros.getMacros()
                .stream()
                .filter(element -> element.getName().toLowerCase().equals(macroName.toLowerCase()))
                .findAny()
                .ifPresent(macro -> macro.getMethods().forEach(CamMethod::execute));

        return "redirect:/";
    }
}
