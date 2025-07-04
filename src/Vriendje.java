import java.util.Scanner;

public class Vriendje {
    private String naam;
    private VriendjeGedrag gedrag;
    private Dagritueel dagritueel;

    public Vriendje(String naam, VriendjeGedrag gedrag, Dagritueel dagritueel) {
        this.naam = naam;
        this.gedrag = gedrag;
        this.dagritueel = dagritueel;
    }

    public String getNaam() {
        return naam;
    }
public void doeDagstart(){
        dagritueel.startDag();
}
    public String positieveReactie() {
        return "[" + naam + "] " + gedrag.positieveReactie();
    }

    public String willekeurigeReactie() {
        return "[" + naam + "] " + gedrag.willekeurigeReactie();
    }

    public static Vriendje maakVriendje(String type, String naam) {
        switch (type.toLowerCase()) {
            case "vosje":
                return new Vriendje(naam, new VosjeGedrag(), new DagritueelTypeA_vos());
            case "uil":
                return new Vriendje(naam, new UilGedrag(), new DagritueellTypeB_uil());
            case "robot":
                return new Vriendje(naam, new RobotGedrag(), new DagritueelTypeC_robot());
            default:
                System.out.println("Onbekend type, standaard kiezen we een Vosje.");
                return new Vriendje(naam, new VosjeGedrag(), new DagritueelTypeA_vos());
        }
    }


    public static Vriendje kiesVriendjeBijStart() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welkom! Kies je vriendje:");
        System.out.println("1. Vosje");
        System.out.println("2. Uil");
        System.out.println("3. Robot");
        System.out.print("Voer het nummer of de naam van het vriendje in: ");
        String keuze = scanner.nextLine().trim();

        String type;
        switch (keuze) {
            case "1": type = "vosje"; break;
            case "2": type = "uil"; break;
            case "3": type = "robot"; break;
            default: type = keuze.toLowerCase(); break; // probeer tekstuele invoer
        }

        System.out.print("Hoe wil je je vriendje noemen? ");
        String naam = scanner.nextLine().trim();

        Vriendje vriendje = maakVriendje(type, naam);
        System.out.println("Je hebt gekozen voor: " + type + " met de naam " + naam + "!");
        return vriendje;
    }

    private int praatTeller = 0;
    private Stemming stemming = Stemming.NEUTRAAL;

    public void updateStemming(boolean correcteActie, boolean foutGemaakt) {
        if (correcteActie) {
            if (stemming == Stemming.BEZORGD) {
                stemming = Stemming.NEUTRAAL;
            } else {
                stemming = Stemming.BLIJ;
            }
        } else if (foutGemaakt) {
            if (stemming == Stemming.BLIJ) {
                stemming = Stemming.NEUTRAAL;
            } else {
                stemming = Stemming.BEZORGD;
            }
        }
    }

    public void toonStemming() {
        switch (stemming) {
            case BLIJ -> System.out.println("[" + naam + "] Ik ben blij, je doet het goed.");
            case BEZORGD -> System.out.println("[" + naam + "] Ik maak me een beetje zorgen om je.");
            case NEUTRAAL -> System.out.println("[" + naam + "] Ik ben er voor je!");
        }
    }

    public void praatMetVriendje() {
        praatTeller++;
        if (praatTeller >= 5) {
            System.out.println("[" + naam + "] We praten echt vaak. Vind ik leuk.");
        } else {
            System.out.println(willekeurigeReactie());
        }
    }
}

