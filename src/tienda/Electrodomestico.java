package tienda;

enum Eficiencia{
    A,B,C,D,E,F;
}

public class Electrodomestico extends ProductoHogar {
    private Eficiencia eficienciaEnergetica;

    Electrodomestico(String nombre, String descripcion, double precio, Material tipoMaterial, Eficiencia eficiencia){
        super(nombre, descripcion, precio, tipoMaterial);
        this.eficienciaEnergetica = eficiencia;
    }

    @Override
    public String toString() {
        return
            super.toString()+"\nEficiencia Energetica: "+this.eficienciaEnergetica;
    }

}
