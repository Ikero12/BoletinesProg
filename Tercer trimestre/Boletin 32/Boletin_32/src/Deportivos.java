public class Deportivos extends Barco {

    private int caballos;

    public Deportivos(float eslora, String matricula, int caballos) {
        super(eslora, matricula);
        this.caballos = caballos;
    }

    public Deportivos(float eslora, String matricula) {
        super(eslora, matricula);
    }

    public int getCaballos() {
        return caballos;
    }

    public void setCaballos(int caballos) {
        this.caballos = caballos;
    }

    @Override
    public int alquilerBarco() {

    }
}
