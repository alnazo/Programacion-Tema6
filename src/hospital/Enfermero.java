package hospital;

public class Enfermero extends NoMedico {
    Enfermero(String nombre, int identificador, double sueldo, Area puesto){
        super(nombre, identificador, sueldo, puesto);
    }

    @Override
    public double calcularSueldo() {
        double area = 0.0;
        
        if (this.puesto == Area.ENFERMERO){
            area = 100.25;
        } else if (this.puesto == Area.LIMPIADOR){
            area = 75.25;
        } else if (this.puesto == Area.BEDEL){
            area = 50.0;
        } else if (this.puesto == Area.RECEPCIONISTA){
            area = 45.75;
        }

        return super.calcularSueldo()+area;
    }
}
