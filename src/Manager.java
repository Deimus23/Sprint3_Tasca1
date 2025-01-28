import java.util.Scanner;

public class Manager {

    public Manager() {
    }

    public static void run() {
            Undo undo = Undo.getInstance();
            Scanner scanner = new Scanner(System.in);

            String option;

            while (true) {
                System.out.println("Tria una opció: (1) Afegir comanda, (2) Eliminar última comanda, (3) Llistar comandes, (4) Sortir");
                option = scanner.nextLine();

                switch (option) {
                    case "1":
                        System.out.print("Introdueix la comanda: ");
                        String command = scanner.nextLine();
                        undo.addCommand(command);
                        break;
                    case "2":
                        undo.removeLastCommand();
                        break;
                    case "3":
                        undo.listCommands();
                        break;
                    case "4":
                        System.out.println("Sortint...");
                        scanner.close();
                        return;
                    default:
                        System.out.println("Opció invàlida. Torna a intentar-ho.");
                }
            }
        }
}
