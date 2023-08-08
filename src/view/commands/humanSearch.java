package view.commands;
import view.ConsoleUI;
public class humanSearch  extends Command  {

    public humanSearch(ConsoleUI consoleUI) {
        super(consoleUI);
        description = "Найти человека ...";
    }
    @Override
    public void execute(){
        consoleUI.humanSearch();
    }
}