import java.util.Scanner;

public class vriendjeChoice {
    Scanner scanner = new Scanner(System.in);

    public void start(){
        System.out.print("Welk vriendje wil je?(Vos, Uil, Robot): ");
        String Keuze =  scanner.nextLine();
        System.out.println("Gekozen: " + Keuze);
        String naam;
        switch (Keuze.toLowerCase()) {
            case "vos":

                System.out.print("Welke naam wil je geven aan je vos? ");
                naam = scanner.nextLine();
                System.out.println("Je vos heet nu: " + naam);

                break;
            case "uil":

                System.out.print("Welke naam wil je geven aan je uil? ");
                naam = scanner.nextLine();
                System.out.println("Je uil heet nu: " + naam);

                break;
            case "robot":

                System.out.print("Welke naam wil je geven aan je robot? ");
                naam = scanner.nextLine();
                System.out.println("Je robot heet nu: " + naam);

                break;
            default:
                System.out.println("Je moet een van de opties kiezen.");

        }
    }
}
