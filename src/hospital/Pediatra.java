package hospital;

public class Pediatra extends Medico{
    Pediatra(String nombre, int identificador, double sueldo, Especialidad especialidad, int colegiado){
        super(nombre, identificador, sueldo, especialidad, colegiado);
    }
    
    @Override
    public double calcularSueldo() {
        double especialidad = 0.0;

        if (this.especialidad == Especialidad.CARDIOLOGO){
            especialidad = 500.0;
        } else if (this.especialidad == Especialidad.PEDIATRA){
            especialidad = 250.5;
        } else if (this.especialidad == Especialidad.CIRUJANO){
            especialidad = 400.0;
        } else if (this.especialidad == Especialidad.NEUROLOGO){
            especialidad = 350.75;
        }

        return super.calcularSueldo()+especialidad;
    }
}
