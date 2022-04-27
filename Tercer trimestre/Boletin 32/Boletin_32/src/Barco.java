public abstract class Barco {

    private float eslora;
    private String matricula;

    public Barco(float eslora, String matricula) {
        this.eslora = eslora;
        this.matricula = matricula;
    }

    public float getEslora() {
        return eslora;
    }

    public void setEslora(float eslora) {
        this.eslora = eslora;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public abstract int alquilerBarco();


}
