package tienda;

public class Mueble extends ProductoHogar{
    private String tipoMueble;

    Mueble(String nombre, String descripcion, double precio, Material tipoMaterial, String tipoMueble){
        super(nombre, descripcion, precio, tipoMaterial);
        this.tipoMueble = tipoMueble;
    }

    @Override
    public String toString() {
        return 
            super.toString()+"\nTipo Mueble: "+this.tipoMueble;
    }

}
