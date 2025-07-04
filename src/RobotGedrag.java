import java.util.List;
import java.util.Random;

public class RobotGedrag implements VriendjeGedrag {
    @Override
    public String positieveReactie() {
        return "Bliep bloep! Correcte actie!";
    }

    @Override
    public String willekeurigeReactie() {
        List<String> ReactieRobot = List.of(
                "Systeem opgestart. Klaar voor de volgende taak?",
                "Ingelogd en gereed. Wat is de eerste stap?",
                "Routine begonnen. Instructies graag.",
                "Status: beschikbaar. Wat moet er gebeuren?",
                "Actief. Wacht op input."
        );
        return ReactieRobot.get(new Random().nextInt(ReactieRobot.size()));
    }

    @Override

    public String bijGoedAntwoord() { return "Wat goed van je! Ik ben trots op je.";


    }
}
