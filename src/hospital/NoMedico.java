package hospital;

enum Area {
    ENFERMERO, RECEPCIONISTA, LIMPIADOR, BEDEL
}

public class NoMedico extends Trabajador {
    Area puesto;
    
    NoMedico(String nombre, int identificador, double sueldo, Area puesto){
        super(nombre, identificador, sueldo);
        this.puesto = puesto;
    }

    @Override
    public String getNombre() {
        return nombre;
    }
    
    @Override
    public int getIdentificador() {
        return identificador;
    }

    @Override
    public double getSueldo() {
        return sueldo;
    }

    public Area getPuesto() {
        return puesto;
    }

    @Override
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public void setIdentificador(int identificador) {
        this.identificador = identificador;
    }

    @Override
    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    public void setPuesto(Area puesto) {
        this.puesto = puesto;
    }

    @Override
    public String toString() {
        return super.toString()+
            "\nPuesto de trabajo: "+this.getPuesto();
    }

}
