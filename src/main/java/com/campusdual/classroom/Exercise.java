package com.campusdual.classroom;

import com.campusdual.Utils;

public class Exercise {

    public static int[] createAndInitializeArray(int num) {
        int[] array = new int[num];  //creo array co numero de datos que da o parametro
        for (int i = 0; i < array.length; i++) {
            array[i] = i +1; // o i+1 si quieres empezar en 1
        }
        return array;
    }
    public static void showInlineArray(int[] array){
        for (int i = 0; i < array.length; i++) {  // vai dando desde a posicion 0 ata o final de un en un en lista
            System.out.print(array[i]);
            if (i < array.length - 1) {
                System.out.print(" ");
            }
        }
        }



        public static void main(String[] args) {
            int num = Utils.integer("Introduce el tamaño del array:");
            int[] array = createAndInitializeArray(num); // creo con array sobre o que comprobar os metodos co creador que crei.
            showInlineArray(array);

    }
}
