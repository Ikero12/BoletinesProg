package org.iker.entidades;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Empleado {
    private String dni;
    private String nombre;
    private String apellidos;
    private Date fechaingreso;

    public void fecha(){
        System.out.println("El día de hoy es: " + Calendar.getInstance().getTime());
        fechaingreso = GregorianCalendar.getInstance().getTime();
        System.out.println(fechaingreso);

    }

    GregorianCalendar calenaderio = new GregorianCalendar();

}
