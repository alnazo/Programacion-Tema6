package aeropuerto;

public class Personal {
    String nombre;
    String apellidos;
    String dni;
    String mail;

    Personal(String nombre, String apellidos, String dni, String mail){
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.dni = dni;
        this.mail = mail;
    }

    public String getNombre() {
        return this.nombre;
    }

    public String getApellidos() {
        return this.apellidos;
    }

    public String getDni() {
        return this.dni;
    }

    public String getMail() {
        return this.mail;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    @Override
    public String toString() {
        return "Nombre: "+this.nombre+
                "\nApellidos: "+this.apellidos+
                "\nDNI: "+this.dni+
                "\nEmail: "+this.mail;
    }

    @Override
    public boolean equals(Object otro){
        Personal otroPersonal = (Personal) otro;
        boolean res = false;
        if(this.dni.equals(otroPersonal.dni)){
            res=true;
        }
        return res;
    }
}
