package seedu.address.logic.commands;

import static java.util.Objects.requireNonNull;

import seedu.address.logic.commands.exceptions.CommandException;
import seedu.address.model.Model;

public class AccessCacheCommand extends Command {

    public static final String COMMAND_WORD = "accesscache";

    public final String key;

    /**
     * @param key The key pressed.
     */
    public AccessCacheCommand(String key) {
        requireNonNull(key);
        this.key = key;
    }

    @Override
    public CommandResult execute(Model model) throws CommandException {
        if (key.equals("UP")) {
            return new CommandResult("", false, false, true, model.getBefore());
        } else if (key.equals("DOWN")) {
            return new CommandResult("", false, false, true, model.getAfter());
        } else {
            throw new CommandException("Unknown Error in AccessCacheCommand#Execute!");
        }
    }
}
