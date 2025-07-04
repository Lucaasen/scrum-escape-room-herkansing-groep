public class VrolijkPersoonlijkheid implements Persoonlijkheidstype {
    @Override
    public String verwerkReactie(String origineleReactie) {
        return origineleReactie + " 😊";
    }
}
