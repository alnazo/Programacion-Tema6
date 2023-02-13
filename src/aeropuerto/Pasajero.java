package aeropuerto;

public class Pasajero extends Personal {
    String pasaporte;

    Pasajero(String nombre, String apellidos, String dni, String mail, String pasaporte){
        super(nombre, apellidos, dni, mail);
        this.pasaporte = pasaporte;
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

    public String getPasaporte() {
        return this.pasaporte;
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

    public void setPasaporte(String pasaporte) {
        this.pasaporte = pasaporte;
    }

    @Override
    public String toString() {
        return super.toString()+"\nPasaporte: "+this.pasaporte;
    }

}
