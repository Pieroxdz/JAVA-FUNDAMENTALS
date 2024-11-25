package academiaingles;

import java.util.Scanner;

public class AcademiaIngles {

    public static void main(String[] args) {

        //Declaración de variables
        int edad;
        Scanner scanner = new Scanner(System.in);
        System.out.println("***BIENVENIDO A ENGLISH SCHOOL***");
        System.out.println("Ingrese la edad del alumno: ");
        edad = scanner.nextInt();

        //EN JAVA NO PUEDO PONER DE ESTA FORMA COMO EN JS -> 
        if (edad >= 4 && edad <= 6) {
            System.out.println("El horario para el grupo de KINDER es, Lunes y Miércoles de  16 a 17hr");
        } else {
            if (edad >= 7 && edad <= 8) {
                System.out.println("El horario para el grupo de FIRST YEAR es, Martes y Jueves de  16:30 a 17:30hr");
            } else {
                if (edad >= 9 && edad <= 10) {
                    System.out.println("El horario para el grupo de SECOND YEAR es, Martes y Jueves de  17:30 a 19hr");
                } else {
                    if (edad >= 11 && edad <= 13) {
                        System.out.println("El horario para el grupo de THIRD YEAR es, Lunes y Miércoles de  17 a 18:30hr");
                    } else {
                        System.out.println("Ingresó una edad que no corresponde");
                    }
                }
            }
        }

        //if (edad >= 4 && edad <= 6) {
        //    System.out.println("El horario para el grupo de KINDER es, Lunes y Miércoles de 16 a 17hr");
        //} else if (edad >= 7 && edad <= 8) {
        //    System.out.println("El horario para el grupo de FIRST YEAR es, Martes y Jueves de 16:30 a 17:30hr");
        //} else if (edad >= 9 && edad <= 10) {
        //    System.out.println("El horario para el grupo de SECOND YEAR es, Martes y Jueves de 17:30 a 19hr");
        //} else if (edad >= 11 && edad <= 13) {
        //    System.out.println("El horario para el grupo de THIRD YEAR es, Lunes y Miércoles de 17 a 18:30hr");
        //} else {
        //    System.out.println("Ingresó una edad que no corresponde");
        //}

    }

}
