public class Masajista extends SeleccionFutbol{

    private String titulación;
    private int añosExperiencia;

    public Masajista(int id, String nombre, String apellidos, int edad, String titulación, int añosExperiencia) {
        super(id, nombre, apellidos, edad);
        this.titulación = titulación;
        this.añosExperiencia = añosExperiencia;
    }

    public Masajista() {
    }

    public String getTitulación() {
        return titulación;
    }

    public void setTitulación(String titulación) {
        this.titulación = titulación;
    }

    public int getAñosExperiencia() {
        return añosExperiencia;
    }

    public void setAñosExperiencia(int añosExperiencia) {
        this.añosExperiencia = añosExperiencia;
    }

    @Override
    public String toString() {
        return super.toString() + " titulación= " + titulación + " añosExperiencia= " + añosExperiencia;
    }

    public void darMasaje(){
        System.out.println("El masajista da un masaje");
    }

    @Override
    public void concentrarse() {
        System.out.println("El masajista se concentra");
    }

    @Override
    public void viajar() {
        System.out.println("El masajista viaja");
    }

    @Override
    public void entrenar() {
        System.out.println("El masajista entrena");
    }

    @Override
    public void jugarPartido() {
        System.out.println("El masajista juega un partido");
    }
}
