package compara;

import java.time.Instant;
import java.util.Date;

public class Llamada {
    private int telefono;
    private int interlocutor;
    private boolean output;
    private Date fecha;
    private Instant inicio;
    private Instant fin;
    private String[] zona = {"CATALUNA", "CANTABRIA", "ANDALUCIA", "CANARIAS", "MEDITERRANEO"};
    private double[] precio = {0.25, 0.55, 0.18, 0.72, 0.31};

    Llamada(){}
    Llamada(int telefono, int interlocutor, boolean output, Date fecha, Instant inicio, Instant fin){
        this.telefono = telefono;
        this.interlocutor = interlocutor;
        this.output = output;
        this.fecha = fecha;
        this.inicio = inicio;
        this.fin = fin;
    }

    public int getTelefono() {
        return this.telefono;
    }

    public int getInterlocutor() {
        return this.interlocutor;
    }

    public boolean getOutput(){
        return this.output;
    }

    public Date getFecha() {
        return this.fecha;
    }

    public Instant getInicio() {
        return this.inicio;
    }

    public Instant getFin() {
        return this.fin;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public void setInterlocutor(int interlocutor) {
        this.interlocutor = interlocutor;
    }

    public void setOutput(boolean output) {
        this.output = output;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public void setInicio(Instant inicio) {
        this.inicio = inicio;
    }

    public void setFin(Instant fin) {
        this.fin = fin;
    }

    //TODO


}
