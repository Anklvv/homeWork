package view.commands;
import view.ConsoleUI;

public class GetHumansInfo  extends Command {

    public GetHumansInfo(ConsoleUI consoleUI) {
        super(consoleUI);
        description = "Вывести людей ...";
    }
    @Override
//    public void execute(){getConsole().addHumanNew();}
    public void execute(){consoleUI.getHumansInfo();}
}