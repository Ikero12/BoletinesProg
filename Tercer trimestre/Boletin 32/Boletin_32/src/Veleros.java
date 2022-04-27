public class Veleros extends Barco{

    private int mastil;

    public Veleros(float eslora, String matricula, int mastil) {
        super(eslora, matricula);
        this.mastil = mastil;
    }

    public Veleros(float eslora, String matricula) {
        super(eslora, matricula);
    }



    public int getMastil() {
        return mastil;
    }

    public void setMastil(int mastil) {
        this.mastil = mastil;
    }

    @Override
    public int alquilerBarco() {
        int precio = 0;
        precio = this.getMastil()*8 + super.getEslora()*10;
        return precio;
    }

}
