package com.mycompany.ejemplomatrices;

import java.util.Scanner;

public class EjemploMatrices {

    public static void main(String[] args) {
        //Declaramos la matriz
        int matriz[][] = new int[3][4];
        Scanner scanner = new Scanner(System.in);

        //RECORRIDO Y CARGA DE MATRICES
        //f -> fila || c -> columna
        
        System.out.println("La matriz tiene " + matriz.length + " filas");
        System.out.println("La matriz tiene " + matriz[0].length + " columnas");
        
        for (int f = 0; f < matriz.length; f++) {
            for (int c = 0; c < matriz[0].length; c++) {
                System.out.println("Ingrese el valor para la fila: " + f + " columna: " + c);
                matriz[f][c] = scanner.nextInt();
            }

        }

        //RECORRIDO Y MUESTRA
        for (int f = 0; f < matriz.length; f++) {
            for (int c = 0; c < matriz[0].length; c++) {
                System.out.println("FILA:" + f + " COLUMNA:" + c + " VALOR: " + matriz[f][c]);
            }

        }

    }
}
