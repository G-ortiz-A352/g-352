/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package v1trifiv;

/**
 *
 * @author arred
 */import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
public class V1TRIFIV {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        //Declacion de variables 
        int numero;
         int mult3;
          int mult5;
          BufferedReader bufEntrada = new BufferedReader (new InputStreamReader(System.in));
          //Entrada de datos 
          System.out.println("Dame el número");
        numero = Integer.parseInt(bufEntrada.readLine());
        //Procesamiento de datos 
        mult3 = numero % 3;
        mult5 = numero % 5;
        //salida de datos
        if (mult3 == 0){ System.out.println("tri");}
        if (mult5 == 0){System.out.println("fiv");}
        if (mult3 == 0 && mult5 == 0){System.out.println("trifi");}
        if (mult3 == 0 && mult5 == 0){System.out.println("TRIFIV");
        }else if (mult3 == 0){
            System.out.println("TRI");
        }else if (mult5 == 0){
            System.out.println("FIV");
        }
    }
    
}
