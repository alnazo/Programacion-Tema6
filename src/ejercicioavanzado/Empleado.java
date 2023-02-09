package ejercicioavanzado;

public class Empleado extends Persona {
    double salario;

    @Override
    public String mostrarinformacion(){
        return "Nombre: " + this.nombre + " \nApellidos: " + this.apellido + " \nEdad:" + this.edad + " \nSalario: " + this.salario;
    }

}
