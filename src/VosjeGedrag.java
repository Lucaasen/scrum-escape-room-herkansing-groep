public class VosjeGedrag implements VriendjeGedrag {
    @Override
    public String positieveReactie() {
        return "Wat goed van je! Ik ben trots op je.";
    }

    @Override
    public String willekeurigeReactie() {
        return "We zijn een topteam!";
    }
}
