//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Es.1:
        System.out.println("Scrivi una parola:");
        String stringaPariDispari = scanner.nextLine();


        if (pariDispari(stringaPariDispari)) {
            System.out.println("La parola ha un numero pari di caratteri.");
        } else {
            System.out.println("La parola ha un numero dispari di caratteri.");
        }

        // Es.2:
        System.out.println("Inserisci un anno:");
        int annoBisestile = scanner.nextInt();


        if (isBisestile(annoBisestile)) {
            System.out.println(annoBisestile + "è un anno bisestile.");
        } else {
            System.out.println(annoBisestile + " non è un anno bisestile.");
        }
    }


    public static boolean pariDispari(String stringaPariDispari) {

        return stringaPariDispari.length() % 2 == 0;
    }


    public static boolean isBisestile(int anno) {

        if (anno % 4 == 0) {

            if (anno % 100 == 0) {
                return anno % 400 == 0;
            } else {
                return true;
            }
        }

        return false;
    }

    public static String numberToLetter(int numero) {
        switch (numero) {
            case 0 -> { return "ZERO"; }
            case 1 -> { return "UNO"; }
            case 2 -> { return "DUE"; }
            case 3 -> { return "TRE"; }
            default -> { return "Numero non valido"; }
        }
    }

}
