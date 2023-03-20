package enteros;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Enteros{
    
    
    static Integer leerEntero(){
        Integer resultado;

        while(true){
            try{
                System.out.println("Introducir entero");
                resultado = new Scanner(System.in).nextInt();
                break;
            } catch (InputMismatchException ex){
                System.out.println("Tipo erróneo");
            }
        }

        return resultado;
    }
}