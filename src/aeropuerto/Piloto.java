package aeropuerto;

enum Rango {
    ALPHA, TANGO, AGUILA;
}

public class Piloto extends Personal {
    Rango rango;
    double sueldo;
    boolean internacional;

    Piloto(String nombre, String apellidos, String dni, String mail, Rango rango, double sueldo, boolean inter){
        super(nombre, apellidos, dni, mail);
        this.rango = rango;
        this.sueldo = sueldo;
        this.internacional = inter;
    }

    @Override
    public String getNombre() {
        return super.getNombre();
    }
    
    @Override
    public String getApellidos() {
        return super.getApellidos();
    }

    @Override
    public String getDni() {
        return super.getDni();
    }

    @Override
    public String getMail() {
        return super.getMail();
    }

    public Rango getRango() {
        return this.rango;
    }

    public double getSueldo() {
        return this.sueldo;
    }

    public boolean getInternacional() {
        return this.internacional;
    }

    @Override
    public void setNombre(String nombre) {
        super.setNombre(nombre);
    }

    @Override
    public void setApellidos(String apellidos) {
        super.setApellidos(apellidos);
    }

    @Override
    public void setDni(String dni) {
        super.setDni(dni);
    }

    @Override
    public void setMail(String mail) {
        super.setMail(mail);
    }

    public void setRango(Rango rango) {
        this.rango = rango;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }
    
    public void setInternacional(boolean internacional) {
        this.internacional = internacional;
    }

    @Override
    public String toString() {
        return super.toString()+"\nSueldo: "+this.sueldo+"\nInternacional: "+this.internacional;
    }

}
