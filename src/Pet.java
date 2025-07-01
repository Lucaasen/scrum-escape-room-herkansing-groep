import java.util.Scanner;

public class Pet {
    Scanner scanner = new Scanner(System.in);

    public Pet(){

    }
    public void start(){
        System.out.print("Welk vriendje wil je?(Vos, Uil, Robot): ");
        String Keuze =  scanner.nextLine();
        System.out.println("Gekozen: " + Keuze);
        switch (Keuze.toLowerCase()) {
            case "Vos":

                break;
            case "Uil":

                break;
            case "Robot":

                break;
            default:
                System.out.println("Je moet een van de opties kiezen.");

        }
    }
}
