package tienda;

public class TestTienda {
    public static void main(String[] args) {
        Mueble estanteria = new Mueble("KALLAX", "Eficacia en el almacenamiento.", 49.99, Material.MADERA, "ESTANTERIA");
        ArticuloDeDecoracion flexo = new ArticuloDeDecoracion("FORSÄ", "Flexo convencional", 25.95, Material.METAL);

        Tienda tienda = new Tienda();

        tienda.agregarProducto(estanteria);
        tienda.agregarProducto(flexo);

        tienda.mostrarProductos();

    }
}
