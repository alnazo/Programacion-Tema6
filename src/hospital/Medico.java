package hospital;

enum Especialidad {
    CARDIOLOGO, PEDIATRA, CIRUJANO, NEUROLOGO
}

public class Medico extends Trabajador{
    Especialidad especialidad;
    int colegiado;
    int pacientes;

    Medico(String nombre, int identificador, double sueldo, Especialidad especialidad, int colegiado){
        super(nombre, identificador, sueldo);
        this.especialidad = especialidad;
        this.colegiado = colegiado;
        this.pacientes = 0;
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

    public Especialidad getEspecialidad() {
        return especialidad;
    }

    public int getColegiado() {
        return colegiado;
    }

    public int getPacientes() {
        return pacientes;
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

    public void setEspecialidad(Especialidad especialidad) {
        this.especialidad = especialidad;
    }

    public void setColegiado(int colegiado) {
        this.colegiado = colegiado;
    }

    public void setPacientes(int pacientes) {
        this.pacientes = pacientes;
    }

    public void pacienteAtendido(){
        this.pacientes++;
    }

    @Override
    public String toString() {
        return super.toString()+
            "\nEspecialidad: "+this.getEspecialidad()+
            "\nNúmero de Colegiado: "+this.getColegiado()+
            "\nPacientes atendidos: "+this.getPacientes();
    }


}
