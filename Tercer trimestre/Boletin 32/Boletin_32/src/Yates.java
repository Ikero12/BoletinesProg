

public class Yates extends Barco{

    private int caballosYate;

    public Yates(float eslora, String matricula, int caballosYate) {
        super(eslora, matricula);
        this.caballosYate = caballosYate;
    }

    public Yates(float eslora, String matricula) {
        super(eslora, matricula);
    }

    public int getCaballosYate() {
        return caballosYate;
    }

    public void setCaballosYate(int caballosYate) {
        this.caballosYate = caballosYate;
    }

    @Override
    public int alquilerBarco() {
        return 0;
    }
}
