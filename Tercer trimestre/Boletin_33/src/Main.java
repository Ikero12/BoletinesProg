

public class Main {
    public static void main(String[] args) {
        Number[]lista = {5.3,6.7,7.9};
        Operaciones<Number>operacionesxd = new Operaciones<Number>();
        //System.out.println(operacionesxd.getDato());
        System.out.println(operacionesxd.calcularMinimo(lista));
        System.out.println(operacionesxd.calcularMaximo(lista));
        System.out.println(operacionesxd.searchPos(lista));
        Number[]lista2;
        lista2 = operacionesxd.deletePos(lista);
        System.out.println(lista2.toString());


    }
}