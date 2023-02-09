package ejercicioavanzado;

public class Cliente extends Persona{
    Tipo tipo;

    @Override
    public String mostrarinformacion(){
        return "Nombre: " + this.nombre + " \nApellidos: " + this.apellido + " \nEdad:" + this.edad + " \nSalario: " + this.tipo;
    }
}
