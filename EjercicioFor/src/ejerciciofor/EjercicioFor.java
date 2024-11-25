
package ejerciciofor;


public class EjercicioFor {
    
    public static void main(String[] args) {
        
        int suma = 0;
        
        for(int contador = 0; contador < 10; contador++){
            System.out.println("    Estoy en la vuelta N° " + contador);
             suma = 5 + contador;
             
             if(suma>= 7){
                 contador = 11;
             }
        }
    }
    
}
