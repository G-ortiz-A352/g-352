
package pkg4.v3trifriv;
import java.util.Scanner;

public class V3trifriv {

    public static void main(String[] args) {
        //declaracion de variables
        Scanner entrada = new Scanner(System.in);
        int numero;
        //entrada de datos
        System.out.println("Dame el numero: ");
        numero = entrada.nextInt();
        //salida de datos 
        System.out.println(retornaMultiplo(numero));
        
    }
        
      public static String retornaMultiplo( int num ){
          // declaracion de variables
          int mult3;
          int mult5;
          //proceso de datos
          mult3 = num % 3;
          mult5 = num % 5;
          // salida de datos 
          if ( mult3 == 0 && mult5 ==0){
              return "TriFiv";
          } else if (mult3 == 0){
              return "Tri";
          } else if ( mult5 == 0){
              return "Fiv";
          }
         return "Ningun caso";
    }
       
} 

      