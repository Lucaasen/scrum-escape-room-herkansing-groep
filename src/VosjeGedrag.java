import java.util.List;
import java.util.Random;

public class VosjeGedrag implements VriendjeGedrag {
    @Override
    public String positieveReactie() {
        return "Wat goed van je! Ik ben trots op je.";
    }

    @Override
    public String willekeurigeReactie() {
        List<String> ReactieVos = List.of(
                "Hoi, wat heb je nodig?",
                "Goedemorgen. Waar gaan we het over hebben?",
                "Hallo. Wat is het plan?",
                "He, zeg het maar.",
                "Dag. Wat kan ik voor je doen?"
        );
        return ReactieVos.get(new Random().nextInt(ReactieVos.size()));
    }

    @Override

    public String bijGoedAntwoord()
    { return "Wat goed van je! Ik ben trots op je.";


    }
}







