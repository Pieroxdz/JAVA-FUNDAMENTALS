

package com.mycompany.ejerciciosarrays;

import java.util.Scanner;


public class EjerciciosArrays {

    public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
      
     
      /*
      String nombres[] = new String[8];
      
      for(int i=0; i<nombres.length; i++){
          System.out.println("Ingrese el nombre que quiera guardar");
          nombres[i] = scanner.nextLine();                  
      }
      
      for(int i=0; i<nombres.length; i++){
          System.out.println("En la posicion " + i + " el valor es: " + nombres[i]);
      }
       */
      
      
      
      
      
      
      
      
      
      
      /*
      int numeros[] = new int[10];
      
      //Carga del vectors
      for(int i=0; i<numeros.length; i++){
          System.out.println("Ingrese el número que quiere cargar en la posición: " + i);
          numeros[i] = scanner.nextInt();
      }
      
      //Busqueda del mayor
      int mayor = Integer.MIN_VALUE;
      for(int i=0; i<10;i++){
          if(numeros[i] > mayor){
              mayor = numeros[i];
          }
      }
      
       //Busqueda del menor
      int menor = Integer.MAX_VALUE;
      for(int i=0; i<10;i++){
          if(numeros[i] < menor){
              menor = numeros[i];
          }
      }
      
        System.out.println("El mayor número es " + mayor);
        System.out.println("El menor número es " + menor);
      
      */
      
      
      
      
      
      
      
      
      
      /*
      int vector [] = new int[15];
      //Contar cuántos números 3 hay
      int cont3 = 0;
      for(int i=0; i<vector.length; i++){
          System.out.println("Ingrese el número para el indice: " + i);
          vector[i] = scanner.nextInt();
      }
      
      for(int i=0; i<vector.length;i++){
          if(vector[i] == 3){
              cont3++;   
          }
      }
      
      
        System.out.println("La cantidad de números 3 es: " + cont3);
      */
      
      
      
      
      
      
      
      
      
      /*
      double sueldos [] = new double[12];
      double sueldoTotal = 0;
      double promedio;
      
      for(int i=0;i<sueldos.length;i++){
          System.out.println("Ingrese el sueldo del mes " + (i+1));
          sueldos[i] = scanner.nextDouble();
          sueldoTotal = sueldoTotal + sueldos[i];
      }
      
      promedio = sueldoTotal/sueldos.length;
      
        System.out.println("Tú sueldo anual es de: " + sueldoTotal);
        System.out.println("El promedio de sueldos es de: " + promedio);
        */
    }
}
