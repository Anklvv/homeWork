package view.commands;
import view.ConsoleUI;

public class SaveHumansToFile  extends Command {

    public SaveHumansToFile(ConsoleUI consoleUI) {
        super(consoleUI);
        description = "Сохранить в файл ...";
    }
    @Override
    public void execute() {consoleUI.SaveHumansToFile();}
}