package com.mycompany.ejercicioestacionamiento;

import java.util.Scanner;

public class EjercicioEstacionamiento {

    public static void main(String[] args) {

        /*Varios clientes:
        El programa debe solicitar por teclado dos datos:
        La patente del vehículo
        El tipo de estacionamiento
         */
        String patente="";
        int tipoServicio, cantHoras, cont1=0, cont2=0, cont3=0;
        double total, totalDia=0;
        Scanner scanner = new Scanner(System.in);
        
        
        /*El programa debe calcular el monto a pagar por cada cliente en función
        del tipo de estacionamiento seleccionado.La carga de datos debe continuar
        hasta que el usuario ingrese la palabra "FIN" en lugar de patente
        */
        
        //Debemos inicializar la variable patente
        while(!patente.equalsIgnoreCase("fin")){
            System.out.println("Ingrese la patente de su vehículo");
            patente = scanner.nextLine();
            if(!patente.equalsIgnoreCase("fin")){
            
            System.out.println("Ingrese el tipo de servicio");
            System.out.println("1 - Hora");
            System.out.println("2 - Media Jornada(5 horas)");
            System.out.println("3 - Jornada completa(Hasta 10 horas)");
            scanner = new Scanner(System.in);
            tipoServicio = scanner.nextInt();
            
            if(tipoServicio > 3 || tipoServicio <= 0 ){
                System.out.println("No ingresó un tipo de servicio correcto");
            }else{
                
                /*
                Los tipos de estacionamiento disponibles son 3:
                Por hora (cuyo valor es de $3 USD por hora)
                Media jornada (cuyo valor total es de $15 USD y posee 5% de descuento)
                Jornada completa (cuyo valor fijo es de $30 USD y posee 10% de descuento)
                */
                
                if(tipoServicio == 1){
                    System.out.println("Ingrese la cantidad de horas que desea estacionar ");
                    //No tengo que resetear porque el último scanner tmb era int, sino fuera int,
                    //si sería necesario reiniciar el scanner
                    cantHoras = scanner.nextInt();
                    total = cantHoras * 3;
                    System.out.println("El total de su estacionamiento es de: " + total);
                    cont1++;
                    totalDia += total;
                }else{
                    if(tipoServicio == 2){
                        System.out.println("El servicio de media jornada corresponde a 5 hs y tiene un dscto del 5%");
                        total = 15 - (15 * 0.05);
                        System.out.println("El total de su estacionamiento es de: " + total);
                        cont2++;
                        totalDia += total;
                    }else{
                         System.out.println("El servicio de jornada completa corresponde a 10 hs y tiene un dscto del 10%");
                        total = 30 - (30 * 0.10);
                        System.out.println("El total de su estacionamiento es de: " + total);
                        cont3++;
                        totalDia += total;
                    }
                }   
        System.out.println("******¡MUCHAS GRACIAS POR SU COMPRA!*******\n");
            }
        scanner = new Scanner(System.in);
            }
        }
        
        
        System.out.println("==============================================================================");    
        System.out.println("Totales Monetarios del día");
        System.out.println("Cantidad de Servicios por Hora: " + cont1);
        System.out.println("Cantidad de Servicios por Media Jornada: " + cont2);
        System.out.println("Cantidad de Servicios por Jornada Completa: " + cont3);
        System.out.println("El monto total recaudado del día es: $" + totalDia + " USD");
    }
}
