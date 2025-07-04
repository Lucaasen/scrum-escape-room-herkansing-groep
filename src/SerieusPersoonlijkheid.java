public class SerieusPersoonlijkheid implements Persoonlijkheidstype {
    @Override
    public String verwerkReactie(String origineleReactie) {
        return "[serieus] " + origineleReactie + ".";
    }
}
