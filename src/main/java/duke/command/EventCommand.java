package duke.command;

import duke.Storage;
import duke.TaskList;
import duke.Ui;

public class EventCommand extends Command{
    String description;
    String at;

    public EventCommand(String description, String at) {
        super();
        this.description = description;
        this.at = at;
    }

    @Override
    public void run(TaskList tasks, Ui ui, Storage storage) {
        String task = tasks.addEvent(this.description, this.at);
        ui.printAdd(task, tasks.getSize());
        storage.save(tasks.getTaskList());
    }
}
