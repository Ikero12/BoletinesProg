public class Futbolista extends SeleccionFutbol{
    private int dorsal;
    private String demarcación;

    public Futbolista(int id, String nombre, String apellidos, int edad, int dorsal, String demarcación) {
        super(id, nombre, apellidos, edad);
        this.dorsal = dorsal;
        this.demarcación = demarcación;
    }

    public Futbolista() {
    }

    public Futbolista(int dorsal, String demarcación) {
        this.dorsal = dorsal;
        this.demarcación = demarcación;
    }

    public int getDorsal() {
        return dorsal;
    }



    public void setDorsal(int dorsal) {
        this.dorsal = dorsal;
    }

    public String getDemarcación() {
        return demarcación;
    }

    public void setDemarcación(String demarcación) {
        this.demarcación = demarcación;
    }

    public void entrevista(){
        System.out.println("el futbolista da una entrevista.");
    }

    @Override
    public String toString() {
        return super.toString() + " dorsal= " + dorsal + " demarcación= " + demarcación;
    }

    @Override
    public void concentrarse() {
        System.out.println(this.getApellidos()+" se concentra");
    }

    @Override
    public void viajar() {
        System.out.println(this.getApellidos()+" viaja");
    }

    @Override
    public void entrenar() {
        System.out.println(this.getApellidos()+" entrena");
    }

    @Override
    public void jugarPartido() {
        System.out.println(this.getApellidos()+" juega un partido");
    }


}
