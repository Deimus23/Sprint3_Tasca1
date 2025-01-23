import java.util.Stack;

public class Undo {
    private static Undo instance;
    private Stack<String> commands;


    private Undo() {
        commands = new Stack<>();
    }


    public static synchronized Undo getInstance() {
        if (instance == null) {
            instance = new Undo();
        }
        return instance;
    }


    public void addCommand(String command) {
        commands.push(command);
    }


    public void removeLastCommand() {
        if (!commands.isEmpty()) {
            commands.pop();
        }
    }


    public void listCommands() {
        if (commands.isEmpty()) {
            System.out.println("No hi ha comandes.");
        } else {
            System.out.println("Historial de comandes:");
            for (String command : commands) {
                System.out.println(command);
            }
        }
    }
}
