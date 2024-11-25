package com.mycompany.ejemplovectores;

import java.util.Scanner;

public class EjemploVectores {

    public static void main(String[] args) {
        int numeros[] = new int[8];
        
        //CARGAMOS EL VECTOR MANUALMENTE
//        numeros[0] = 15;
//        numeros[1] = 35;
//        numeros[2] = 22;
//        numeros[3] = 14;
//        numeros[4] = 64;
//        numeros[5] = 61;
//        numeros[6] = 91;
//        numeros[7] = 23;

        
        //Mostrar el elemento de la 5ta posicion
        //System.out.println("El elemento de la 5ta posición: " + numeros[4]);
        
//        for(int i = 0; i<numeros.length; i++){
//            System.out.println("Estoy en el indice: " + i + " y el valor es: " + numeros[i]);
//        }


        //CARGAMOS EL VECTOR DINÁMICAMENTE
        Scanner scanner = new Scanner(System.in);
        for(int i = 0; i<numeros.length; i++){
            System.out.println("Ingrese el valor para el indice: " + i);
            numeros[i] = scanner.nextInt();
        }
        
        System.out.println("Los valores ingresados fueron:");
        for(int i = 0; i<numeros.length; i++){
            System.out.println("Indice: " + i + " Valor: " + numeros[i]);
        }

    }
}
