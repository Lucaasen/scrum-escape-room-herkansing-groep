public abstract class Dagritueel {

    public final void startDag() {
        begroet();
        zegIetsOverDeDag();
        stelStemmingIn();
    }

    protected abstract void begroet();
    protected abstract void zegIetsOverDeDag();
    protected abstract void stelStemmingIn();
}
