package ejerciciomercería;

import java.util.Scanner;

public class EjercicioMercería {

    public static void main(String[] args) {

        //Mercería mayorista --> vende al por mayor
        //Menos de 5 paquetes NO VENDE
        //Entre 5 y 15  sale 10 USD el envío
        //Más de 15 el envío es GRATIS
        int cantidadPaquetes;
        double montoTotal, diferencia, descuento, totalConDesc;
        Scanner scanner = new Scanner(System.in);

        //Preguntar cuantos paquetes son
        System.out.println("Ingrese la cantidad de paquetes");
        cantidadPaquetes = scanner.nextInt();

        //Evaluar los posibles casos
        if (cantidadPaquetes < 5) {
            if (cantidadPaquetes < 0) {
                System.out.println("No se permiten ventas con valores negativos");
            } else {
                System.out.println("No se permiten ventas minoristas (cantidad de paquetes menor a 5)");
            }
        } else {
            System.out.println("Ingrese el monto total de la compra");
            scanner = new Scanner(System.in); //CON ESTO REINICIAMOS EL SCANNER
            montoTotal = scanner.nextDouble();

            if (cantidadPaquetes >= 5 && cantidadPaquetes <= 15) {
                System.out.println("El costo del envío es de 10 dólares");
                montoTotal += 10;
            } else {
                System.out.println("El envío es GRATUITO");
            }

            if(montoTotal < 100) {
                diferencia = 100 - montoTotal;
                System.out.println("El monto es menor a 100 por lo que no tienes ningúna promoción, necesitas comprar " + diferencia
                + " USD para conseguir la promoción");
            }else{
                if(montoTotal >= 100 && montoTotal <=300){              
                descuento = montoTotal * 0.05;
                totalConDesc = montoTotal - descuento;
                System.out.println("Por su compra tiene un dscto del 5%, que equivale a " + descuento + ".El monto total con descuento es: " + totalConDesc);
                }else{
                    descuento = montoTotal * 0.10;
                totalConDesc = montoTotal - descuento;
                System.out.println("Por su compra tiene un dscto del 10%, que equivale a " + descuento + ".El monto total con descuento es: " + totalConDesc);
                }
            } 
        }
    }

}
