public class Main {
    public static void main(String[] args) {


        Futbolista obj = new Futbolista(1,"Iker","Casillas",35,1,"Portero");
        obj.concentrarse();
        obj.entrenar();
        obj.jugarPartido();
        obj.viajar();
        System.out.println(obj.toString());

        Entrenador carletto = new Entrenador(2,"Carlo","Ancelotti",64,5);
        carletto.concentrarse();
        carletto.entrenar();
        carletto.jugarPartido();
        carletto.viajar();
        System.out.println(carletto.toString());

        Masajista lol=new Masajista(5,"Queco","Jones",55,"Profesional Jones",40);
        lol.concentrarse();
        lol.darMasaje();
        lol.entrenar();
        lol.jugarPartido();
        lol.viajar();
        System.out.println(lol.toString());

        Seleccionador bosque=new Seleccionador(3,"Vicente","Del Bosque",70);
        bosque.concentrarse();
        bosque.entrenar();
        bosque.jugarPartido();
        bosque.viajar();
        bosque.seleccionarJugador(obj);

    }
}