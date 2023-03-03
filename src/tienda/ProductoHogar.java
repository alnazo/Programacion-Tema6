package tienda;

enum Material{
    MADERA,METAL,PLASTICO;
}

public abstract class ProductoHogar extends Producto {
    private Material tipoDeMaterial;

    ProductoHogar(String nombre, String descripcion, double precio, Material tipoMaterial){
        super(nombre, descripcion, precio);
        this.tipoDeMaterial = tipoMaterial;
    }

    @Override
    public String toString() {
        return
            super.toString()+"\nMaterial: "+this.tipoDeMaterial;
    }

}
