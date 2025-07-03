import java.util.ArrayList;
import java.util.List;

public class VosjeGedrag implements VriendjeGedrag {
    @Override
    public String positieveReactie() {
        return "Wat goed van je! Ik ben trots op je.";
    }

    @Override
    public String willekeurigeReactie() {
        return "We zijn een topteam!";
    }

    @Override

    public String bijGoedAntwoord()
    { return "Wat goed van je! Ik ben trots op je.";


    }
    List<String> Reactie = new ArrayList<>();

}







