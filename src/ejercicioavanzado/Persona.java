package ejercicioavanzado;

public class Persona {
    String nombre;
    String apellido;
    int edad;

    public String mostrarinformacion(){
        return "Nombre: " + this.nombre + " \nApellidos: " + this.apellido + " \nEdad:" + this.edad;
    }

}
