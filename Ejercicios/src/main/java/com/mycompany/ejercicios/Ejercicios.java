package com.mycompany.ejercicios;

import java.util.Scanner;

public class Ejercicios {

    public static void main(String[] args) {

        // Realizar un programa que muestre en pantalla los números del 1 al 35 (uno abajo del otro).
        //Utilizar para esto alguna estructura repetitiva. 
        //for(int i = 1; i <=35; i++){
        //  System.out.println("El número es: " + i);
        //}
        
        
        //Realizar un programa que dado por teclado un límite numérico (por ejemplo 100)
        //muestre en pantalla todos los números hasta ese límite (empezando por 1).
        //int numLimite;
        //Scanner scanner = new Scanner(System.in);
        //System.out.println("Ingresa el número limite");
        //numLimite = scanner.nextInt();
        //for(int i = 1; i <= numLimite; i++){
        //    System.out.println("El número es: " + i);
        //}
        
        
        // Realizar un programa que muestre por pantalla los números del 200 al 250 saltando de 2 en dos.
        //La secuencia debería ser: 200...202...204...etc. 
        //for(int i = 200; i<= 250; i+= 2){
        //    System.out.println("El número es: " + i);
        //}
        

        //Realizar un programa que lleve a cabo la cuenta regresiva para el año nuevo.
        //La cuenta debe comenzar en 10 y terminar en 1
        //System.out.println("Vamos a empezar la cuenta regresiva para el 2025");
        //int contador = 10;
        //while(contador >= 1){
        //    System.out.println(contador);
        //    --contador;
        //}
        //System.out.println("Que tengas un bonito 2025");
        
        
        //Realizar un programa que muestre en pantalla palabras que sean ingresadas 
        //por teclado hasta que se ingrese la palabra "Salir".
        
       String palabra;
       Scanner scanner = new Scanner(System.in);
       System.out.println("Ingresa una palabra");
        palabra = scanner.nextLine();
      
       
       while(!palabra.equalsIgnoreCase("salir")){
           System.out.println("La palabra es: " + palabra);
           
           System.out.println("Ingresa una palabra");
            palabra = scanner.nextLine(); 
       }
       
       //Next le palabra por palabra de la cadena de forma separado
       //es solo ideal para una sola palabra, NextLine ideal para una línea
       
        System.out.println("Gracias por usar nuestro programa");
        
    }
}
