
package condicionales;

import java.util.Scanner;


public class Condicionales {

    public static void main(String[] args) {
       int edad;
        System.out.println("Ingresa tú edad: ");
        Scanner scanner = new Scanner(System.in);
        edad = scanner.nextInt();
        
        if(edad > 18){
            System.out.println("Eres mayor de 18 años, felicidades!!");
            
            if(edad > 40){
                System.out.println("Eres de la generacion x");
            } else {
                System.out.println("Eres de la generación milenal");
            }
        }else{
            if(edad == 18){
            System.out.println("Bienvenido a la mayoría de edad, tienes exactamente 18 años");
            } else{
                System.out.println("Todavía eres menor de edad");
            }
        }
        
        System.out.println("Llegaste al final del programa !!!");
        
    }   
}
