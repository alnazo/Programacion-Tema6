package socioconjunto;

import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.io.IOException;
import java.io.Serializable;
import java.util.Date;
import java.util.Scanner;

public class Socio implements Serializable, Comparable {
    private String dni;
    private String nombre;
    private Date fechaAlta;

    public Socio(){};
    public Socio(String dni, String nombre, Date fechaAlta){
        this.dni = dni;
        this.nombre = nombre;
        this.fechaAlta = fechaAlta;
    }

    public String getDni() {
        return dni;
    }
    
    public String getNombre() {
        return nombre;
    }

    public Date getFechaAlta() {
        return fechaAlta;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setFechaAlta(Date fechaAlta) {
        this.fechaAlta = fechaAlta;
    }

    @Override
    public boolean equals(Object obj) {
        boolean res = false;

        Socio otroSocio = (Socio) obj;
        if (this.dni.equals(otroSocio.dni)){
            res = true;
        }

        return res;
    }

    @Override
    public String toString() {
        return this.getNombre() + " - " + this.getDni() + " - " + this.getFechaAlta();
    }

    @Override
    public int compareTo(Object otro) {
        int resultado;

        Socio otroSocio = (Socio) otro;
        if (this.dni.compareTo(otroSocio.dni)<0){
            resultado = -1;
        } else if (this.dni.compareTo(otroSocio.dni)>0){
            resultado = 1;
        } else {
            resultado = 0;
        }

        return resultado;
    }

    public int antiguedad(){
        int res = 0;

        Date today = new Date();
        long diff = today.getTime() - today.getTime();
        res = (int) (diff / 1000 * 60 * 60 * 24);

        return res;
    }

    public static void main(String[] args) {
        
        try{
            ObjectInputStream input = new ObjectInputStream(new FileInputStream("extra/socios.dat"));
            Scanner sc = new Scanner(System.in);
            int opcion;
            //TODO --> da error EOFException
            do {
                System.out.println("Menú de opciones:");
                System.out.println("1. Alta");
                System.out.println("2. Baja");
                System.out.println("3. Modificación");
                System.out.println("4. Listado por DNI");
                System.out.println("5. Listado por antigüedad");
                System.out.println("6. Salir");
                System.out.print("Seleccione una opción: ");

                opcion = sc.nextInt();
                switch (opcion) {
                    case 1:
                        //Alta socio
                        
                        break;

                    case 2:
                        //Baja socio
                        
                        break;

                    case 3:
                        //Modificacion socio
                        
                        break;

                    case 4:
                        //Listado por DNI
                        
                        break;

                    case 5:
                        //Listado por antigüedad

                        break;
                    case 6:
                        System.out.println("Saliendo del programa...");
                        break;
                    default:
                        System.out.println("Opcion invalida, por favor seleccione una accion.");
                }
            } while(opcion != 6);

        } catch (IOException e) {
            System.out.println("Hubo un error al leer el archivo");
            System.out.println(e);
        }

    }

}
