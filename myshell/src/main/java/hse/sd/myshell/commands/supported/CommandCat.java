package hse.sd.myshell.commands.supported;

import hse.sd.myshell.commands.AbstractCommand;
import hse.sd.myshell.commands.CommandOutput;

import java.util.ArrayList;
import java.util.Arrays;

public class CommandCat implements AbstractCommand {
    @Override
    public CommandOutput execute(ArrayList<String> params) {
        return new CommandOutput(0, new ArrayList<>(params));
    }
}
