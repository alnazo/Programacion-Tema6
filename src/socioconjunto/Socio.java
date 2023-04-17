package socioconjunto;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class Socio implements Serializable, Comparable<Socio> {
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

    public String getFechaAltaString(){
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
        return formatter.format(this.getFechaAlta());
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
        return this.getNombre() + " - " + this.getDni() + " - " + this.getFechaAlta();
    }

    @Override
    public int compareTo(Socio otro) {
        int resultado;

        if (this.dni.compareTo(otro.dni)<0){
            resultado = -1;
        } else if (this.dni.compareTo(otro.dni)>0){
            resultado = 1;
        } else {
            resultado = 0;
        }

        return resultado;
    }

    public int antiguedad() {
        long diff = new Date().getTime() - this.fechaAlta.getTime();
        return (int) TimeUnit.DAYS.convert(diff, TimeUnit.MILLISECONDS);
    }

}
