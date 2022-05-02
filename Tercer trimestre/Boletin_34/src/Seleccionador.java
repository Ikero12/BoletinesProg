public class Seleccionador extends SeleccionFutbol {

    public Seleccionador(int id, String nombre, String apellidos, int edad) {
        super(id, nombre, apellidos, edad);
    }

    public void seleccionarJugador(Futbolista nombre){
        System.out.println("El seleccionador selecciona a " + nombre.getApellidos());
    }



    @Override
    public void concentrarse() {
        System.out.println("El seleccionador se concentra.");
    }

    @Override
    public void viajar() {
        System.out.println("El seleccionador viaja.");
    }

    @Override
    public void entrenar() {
        System.out.println("El seleccionador entrena.");
    }

    @Override
    public void jugarPartido() {
        System.out.println("El seleccionador juega un partido.");
    }
}
