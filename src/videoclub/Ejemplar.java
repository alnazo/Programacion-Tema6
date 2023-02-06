package videoclub;

public class Ejemplar {
    private int codigo;
    private String nombre;
    private double precio;

    void insertarEjemplar(){

    }

    void registrarEjemplar(String nombre, double precio){
        this.nombre = nombre;
        this.precio = precio;
    }

    void registrar(){

    }

    void modificarEjemplar(String nombre, double precio){
        if (precio != this.precio){
            this.precio = precio;
        }
        if (nombre != this.nombre){
            this.nombre = nombre;
        }
    }

    void modificar(){

    }

    void eliminarEjemplar(){

    }

    void eliminar(){

    }
}
