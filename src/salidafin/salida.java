package salidafin;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class salida {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        try {
            FileWriter file = new FileWriter("extra/salida.txt",true);
            String linea = "";

            while(!linea.equals("fin")){
                linea = sc.nextLine();
                if (!linea.equals("fin")){
                    file.write(linea + "\n");
                }
            }
            file.close();
            
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }

    }

}
