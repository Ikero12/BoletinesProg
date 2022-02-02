package com.Ejemplo;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {

        int opcion = Integer.parseInt(JOptionPane.showInputDialog(  "1.Mostrar longitud de texto" +
                                                                    "\n2.Mostrar 'java' char por char" +
                                                                    "\n3. invertir 'Java desde 0'" +
                                                                    "\n4.Eliminar espacios de un texto"
                                                                    +""));
        switch (opcion){
            case 1:
                String thisisJava= "Este es Java!";
                JOptionPane.showMessageDialog(null,thisisJava.length());
                break;
            case 2:
                String java= "Java";
                char[]java2=java.toCharArray();
                for (int j=0;j<java.length();j++){
                    System.out.println(java2[j] + "  ");
                }
                break;
            case 3:
                String javafromzero= "Java desde 0";
                char[] javafromzero2 = javafromzero.toCharArray();
                for (int j = javafromzero2.length-1;j>=0;j--)
                    System.out.print(javafromzero2[j]);
                break;
            case 4:
                String jgcx = "James Gosling Created Xava";
                JOptionPane.showMessageDialog(null, "Quitamos espacios de: " + jgcx);
                JOptionPane.showMessageDialog(null, jgcx.replace(" ", ""));
            case 5:
                String javax3 = "java java java";
                String javax3sin = javax3.replace(" ", "");
                char [] try1 = javax3sin.toCharArray();
                char [] vocales ={'a','e','i','o','u'};
                int contadorvocales = 0;
                int contadorconsonantes =0;
                for (int j=0;j<12;j++){
                    for(int i=0;i< vocales.length;i++){
                        if (try1[j] == vocales[i]){
                                contadorvocales++;
                                break;
                        }

                    }

                }
                JOptionPane.showMessageDialog(null, "Hay: " + contadorvocales + " vocales y: "+ contadorconsonantes + " consonantes");
            case 6:
                String web = "www.javadesde0.com";

        }







    }
}
