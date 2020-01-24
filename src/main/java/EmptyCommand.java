public class EmptyCommand extends Command {
    public EmptyCommand() {}

    @Override
    public void execute(TaskList tasks, Ui ui, Storage storage) {}

    @Override
    public boolean isExit() {
        return false;
    }
}
