import java.util.List;
import java.util.Random;

public class UilGedrag implements VriendjeGedrag {
    @Override
    public String positieveReactie() {
        return "Je hebt het slim aangepakt!";
    }

    @Override
    public String willekeurigeReactie() {
        List<String> ReactieUil = List.of(
                "Goede dag. Mooie inzichten opgedaan vandaag?",
                "Welkom. Altijd fijn om jouw kijk op zaken te horen.",
                "Goed je te zien. Ik ben benieuwd naar je wijsheid.",
                "Groet. Wat houdt je geest vandaag bezig?",
                "Ah, daar ben je. Laten we iets waardevols uitwisselen."
        );
        return ReactieUil.get(new Random().nextInt(ReactieUil.size()));
    }

    @Override
    public String bijGoedAntwoord() { return "Wat goed van je! Ik ben trots op je.";


    }
}
