import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        //validación de entrada con do-while
        int userInput;

        do {
            System.out.print("Ingresa un número entre 1 y 10: ");
            userInput = scanner.nextInt();
        } while (userInput < 1 || userInput > 10);

        System.out.println("Número válido: " + userInput);

        //adivinanza de número secreto
        Random random = new Random();
        int secretNumber = random.nextInt(1,11);
        int userGuess;
        do {
            System.out.print("Adivina el número secreto del 1 al 10: ");
            userGuess = scanner.nextInt();
            if (userGuess < secretNumber) {
                System.out.println("Demasiado bajo.");
            } else if (userGuess > secretNumber) {
                System.out.println("Demasiado alto.");
            } else {
                System.out.println("¡Correcto! El número era " + secretNumber);
            }
        } while (userGuess != secretNumber);

        //menu interactivo con do-while
        int choice;
        System.out.println("---Bienvenido al menú de opciones---");
        do {
            System.out.println("1. Opción 1");
            System.out.println("2. Opción 2");
            System.out.println("3. Salir");
            System.out.print("Selecciona una opción: ");
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Elegiste la Opción 1.");
                    break;
                case 2:
                    System.out.println("Elegiste la Opción 2.");
                    break;
                case 3:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opción no válida.");
            }
        } while (choice != 3);
    }
}