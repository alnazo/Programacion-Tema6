package tienda;

public class Tienda {
    private Producto[] productos;

    Tienda(){
        this.productos = new Producto[0];
    }

    public void agregarProducto(Producto producto){
        Producto[] pro = new Producto[this.productos.length+1];
        //TODO
        for(int i = 0; i<this.productos.length;i++){
            if(productos.length == i-1){
                pro[pro.length] = producto;
            } else {
                pro[i] = productos[i];
            }
        }
        this.productos = pro;
    }

    public void mostrarProductos(){
        for(int i = 0; i<this.productos.length;i++){
            System.out.println("--------Producto: "+i+"--------");
            System.out.println(productos[i]);
            if(this.productos.length == i+1){
                System.out.println("---------------------------");
            }
        }
    } 

}
