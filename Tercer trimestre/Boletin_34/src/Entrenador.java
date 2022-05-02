public class Entrenador extends SeleccionFutbol{

    private int idFederación;

    public Entrenador(int id, String nombre, String apellidos, int edad, int idFederación) {
        super(id, nombre, apellidos, edad);
        this.idFederación = idFederación;
    }

    public Entrenador() {
    }

    public int getIdFederación() {
        return idFederación;
    }

    public void setIdFederación(int idFederación) {
        this.idFederación = idFederación;
    }

    public void planificarEntrenamiento(){
        System.out.println("El entrenador planifica un entrenamiento");
    }

    @Override
    public String toString() {
        return super.toString()+" idFederación= " + idFederación;
    }

    @Override
    public void concentrarse() {
        System.out.println("El entrenador se concentra");
    }

    @Override
    public void viajar() {
        System.out.println("El entrenador viaja");
    }

    @Override
    public void entrenar() {
        System.out.println("El entrenador entrena valga la redundancia");
    }

    @Override
    public void jugarPartido() {
        System.out.println("El entrenador juega un partido");
    }
}
