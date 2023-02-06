package videoclub;

public class Cliente {
    private int codigo;
    private String nombre;
    private Bono bono;

    void registrarCliente(String nombre, Bono bono){
        this.nombre = nombre;
        this.bono = bono;
    }

    void registrar(){

    }

    void modificarCliente(String nombre, Bono bono){
        if (nombre != this.nombre){
            this.nombre = nombre;
        }
        if (bono != this.bono){
            this.bono = bono;
        }
    }

    void modificar(){

    }

    void eliminarCliente(){
        
    }

    void eliminar(){

    }

    void insertarCliente(){

    }

}
