public class RobotGedrag implements VriendjeGedrag {
    @Override
    public String positieveReactie() {
        return "Bliep bloep! Correcte actie!";
    }

    @Override
    public String willekeurigeReactie() {
        return "Teamwork: 100%.";
    }
}
