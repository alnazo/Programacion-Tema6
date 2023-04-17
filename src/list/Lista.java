package list;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Lista {
    public static void main(String[] args) {
        List<Integer> lista = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int num;
        do {
            System.out.println("Introduzca un numero: ");
            num = sc.nextInt();
            if (num >= 0){
                lista.add(num);
            }
        } while (num >= 0);
        
        
        for(int i = 0; i < lista.size(); i++){
            if(lista.get(i) % 2 == 0){
                System.out.println(lista.indexOf(lista.get(i))*100);
            }
        }


    }

}
