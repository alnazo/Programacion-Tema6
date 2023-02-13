package aeropuerto;

public class Azafato extends Personal {
    double sueldo;
    String[] idiomas;

    Azafato(String nombre, String apellidos, String dni, String mail, double sueldo, String[] idiomas){
        super(nombre, apellidos, dni, mail);
        this.sueldo = sueldo;
        this.idiomas = idiomas;
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

    public double getSueldo() {
        return this.sueldo;
    }

    public String[] getIdiomas() {
        return this.idiomas;
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

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }
    
    public void setIdiomas(String[] idiomas) {
        this.idiomas = idiomas;
    }

    public String idiomasToString(){
        String idiomas = "";
        for(int i = 0; i < this.idiomas.length; i++){
            idiomas+= this.idiomas[i] + " ";
        }
        return idiomas;
    }

    @Override
    public String toString() {
        return super.toString()+"\nSueldo: "+this.sueldo+"\nIdiomas: "+idiomasToString();
    }

}
