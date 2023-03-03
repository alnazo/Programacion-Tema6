package tienda;

public abstract class Producto {
    private String nombre;
    private String descripcion;
    private double precio;

    Producto(String nombre, String descripcion, double precio){
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.precio = precio;
    }

    @Override
    public String toString() {
        return
            "Nombre: "+this.nombre+
            "\nDescripcion: "+this.descripcion+
            "\nPrecio: "+this.precio+" €";
    }
}
