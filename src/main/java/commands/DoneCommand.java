package commands;

import tasks.Task;
import tasks.TaskList;

import handlers.Storage;
import handlers.Ui;

/**
 * Handles the command when the user completes the task.
 * For the execute method, it sets the task to 'Done'.
 */

public class DoneCommand extends Command {
    protected Task doneTask;
    protected int taskToBeDone;

    public DoneCommand(String command, int taskToBeDone) {
        this.command = command;
        this.taskToBeDone = taskToBeDone;
    }

    @Override
    public void execute(TaskList tasks, Ui ui, Storage storage) {
        //int num = Integer.parseInt(this.command);
        this.doneTask = tasks.get(taskToBeDone - 1);
        tasks.completedTask(doneTask);
        ui.clearResponse();
        ui.showDoneTask(doneTask);
    }

    @Override
    public boolean isExit() {
        return false;
    }
}
