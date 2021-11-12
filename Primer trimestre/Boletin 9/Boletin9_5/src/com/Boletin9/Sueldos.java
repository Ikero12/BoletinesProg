package com.Boletin9;

import javax.swing.*;

public class Sueldos {

    private float sueldostotal;
    private float sueldosmil;
    private float sueldosentre;

    public void buclesueldos(){

    }













    public float porcentaje(){
        float porcentaje = sueldosmil * 100/sueldostotal;
        return porcentaje;
    }





    public float readSueldo(){
        float sueldo = Float.parseFloat(JOptionPane.showInputDialog("Introduce el sueldo del trabajador en euros: "));
        return sueldo;
    }
}
