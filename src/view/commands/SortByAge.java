package view.commands;
import view.ConsoleUI;
public class SortByAge  extends Command {
    public SortByAge(ConsoleUI consoleUI) {
        super(consoleUI);
        description = "Сортировка по дате рождения...";
    }
    @Override
    public void execute(){
        consoleUI.sortByAge();
    }
}