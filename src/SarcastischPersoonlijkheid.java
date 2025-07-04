public class SarcastischPersoonlijkheid implements Persoonlijkheidstype {
    @Override
    public String verwerkReactie(String origineleReactie) {
        return "Oh, echt? " + origineleReactie.toLowerCase() + " 🙄";
    }
}
