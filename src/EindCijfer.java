import java.util.ArrayList;
import java.util.List;
import java.util.Observer;

interface CijferObserver{
    void update(String cijferUpdate);
}

public class EindCijfer {
    public static void main(String[] args) {
        Cijfermanager manager = new Cijfermanager();
        manager.setExamObserversUpdate();

        // demo dit is:vv
        Speler speler = new Speler("Start");
        speler.vraagNaamIn();

        manager.setCijferUpdate("Speler "+ speler.getNaam() + " heeft het spel voltooid.");
        manager.geefRapport(speler);
    }
}

class Cijfermanager {
    // hier komt observer
    private List<CijferObserver> examObservers = new ArrayList<>();
    private String cijferUpdate;

    void setExamObserversUpdate(){
        examObservers.add(new KamerObserver());
        examObservers.add(new HintObserver());
        examObservers.add(new ActieObserver());
    }

    void setCijferUpdate(String cijferUpdate) {
        this.cijferUpdate = cijferUpdate;
        notifyAllObservers();
    }

    void notifyAllObservers(){
        for(CijferObserver o : examObservers){
            o.update(cijferUpdate);
        }
    }

    public void geefRapport(Speler speler) {

        int punten = 0;
        Double score;
        score = (punten / 50) * 9 + 1.0;
        Boolean voldoende = false;
        if (score >= 5.5) {
            voldoende = true;
            if (voldoende) {
                System.out.println("voldoende, een " + score + ", je hebt het gehaald.");
            } else {
                System.out.println("jammer, een onvoldoende: " + score + " heb je gekregen");
            }

            //reken dingen hier
            System.out.println("Eindresultaat: ");
            System.out.println("binnenkort beschikbaar.");
//        System.out.println("Hints gebruikt: " + HintObserver.getAantalHints());
//        System.out.println("Fouten gemaakt: " + KamerObserver.getAantalFouten());
//        System.out.println("Totaal acties gebruikt: " + ActieObserver.getAantalActies());
//        System.out.println("Correcte antwoorden: " + KamerObserver.getCorrecteAntwoorden());
        }
    }
}

class HintObserver implements CijferObserver {
    private static int aantalHints = 0;

    public static void registreerHintGebruik() {
        aantalHints++;
    }

    public static int getAantalHints() {
        return aantalHints;
    }

    @Override
    public void update(String update) {
        System.out.println("[HintObserver] Update: " + update);
    }
}

class KamerObserver implements CijferObserver {
    private static int fouten = 0;
    private static int correcteAntwoorden = 0;

    public static void registreerFout() {
        fouten++;
    }

    public static void registreerCorrect() {
        correcteAntwoorden++;
    }

    public static int getAantalFouten() {
        return fouten;
    }

    public static int getCorrecteAntwoorden() {
        return correcteAntwoorden;
    }

    @Override
    public void update(String update) {
        System.out.println("[KamerObserver] Update: " + update);
    }
}

class ActieObserver implements CijferObserver {
    private static int aantalActies = 0;

    public static void registreerActie() {
        aantalActies++;
    }

    public static int getAantalActies() {
        return aantalActies;
    }

    @Override
    public void update(String update) {
        System.out.println("[ActieObserver] Update: " + update);
    }
}