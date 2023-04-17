package socioconjunto;

import java.util.Date;

public class Socio implements Comparable {
    private String dni;
    private String nombre;
    private Date fechaAlta;

    public Socio(){};
    public Socio(String dni, String nombre, Date fechaAlta){
        this.dni = dni;
        this.nombre = nombre;
        this.fechaAlta = fechaAlta;
    }

    public String getDni() {
        return dni;
    }
    
    public String getNombre() {
        return nombre;
    }

    public Date getFechaAlta() {
        return fechaAlta;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setFechaAlta(Date fechaAlta) {
        this.fechaAlta = fechaAlta;
    }

    @Override
    public boolean equals(Object obj) {
        boolean res = false;

        Socio otroSocio = (Socio) obj;
        if (this.dni.equals(otroSocio.dni)){
            res = true;
        }

        return res;
    }

    @Override
    public String toString() {
        return this.getNombre() + " " + this.getDni() + " " + this.getFechaAlta();
    }

    @Override
    public int compareTo(Object otro) {
        int resultado;

        Socio otroSocio = (Socio) otro;
        if (this.dni.compareTo(otroSocio.dni)<0){
            resultado = -1;
        } else if (this.dni.compareTo(otroSocio.dni)>0){
            resultado = 1;
        } else {
            resultado = 0;
        }

        return resultado;
    }

    public int antiguedad(){
        int res = 0;

        Date today = new Date();
        long diff = today.getTime() - today.getTime();
        res = (int) (diff / 1000 * 60 * 60 * 24);

        return res;
    }

    public static void main(String[] args) {
        
    }

}
