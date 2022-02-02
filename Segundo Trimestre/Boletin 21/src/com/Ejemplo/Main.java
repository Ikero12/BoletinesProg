package com.Ejemplo;

import java.util.Arrays;
import java.util.Random;

public class Main {

    public static void main(String[] args) {

        int numeros[];
        numeros = new int[6];
        int numerosreves[];
        numerosreves = new int[6];

        Random r = new Random();
        int j = 5;
      for(int i=0; i<6;i++){
          int valor = r.nextInt(50) + 1;
            numeros[i] = valor;
            numerosreves[j] = numeros[i];
            j--;
      }
        System.out.println(Arrays.toString(numerosreves));
        System.out.println(Arrays.toString(numeros));


    }
}
