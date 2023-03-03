package tienda;

public class ArticuloDeDecoracion extends ProductoHogar{
    ArticuloDeDecoracion(String nombre, String descripcion, double precio, Material tipoMaterial){
        super(nombre, descripcion, precio, tipoMaterial);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
