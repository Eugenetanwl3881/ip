package duke.command;

import duke.Storage;
import duke.TaskList;
import duke.Ui;

/**
 * FindCommand is a command to find a keyword in the TaskList.
 *
 * @author Eugene Tan
 */
public class FindCommand extends Command {

    private String wordToFind;

    /**
     * Constructor of FindCommand.
     *
     * @param wordToFind The keyword to search for.
     */
    public FindCommand(String wordToFind) {
        this.wordToFind = wordToFind;
    }

    /**
     * Finds the keyword in the TaskList if it is there.
     *
     * @param tasks The Tasklist containing all tasks.
     * @param ui Ui handling the user interactions.
     * @param storage Storage storing the file.
     * @return Find word eventual message
     */
    public String run(TaskList tasks, Ui ui, Storage storage) {
        return ui.printAnyOtherMessage(tasks.findTasks(wordToFind));
    }
}