package aeropuerto;

public class Vuelo {
    String origen;
    String destino;
    Piloto piloto;
    Pasajero[] pasajeros;
    double duracion;

    Vuelo(String origen, String destino, Piloto piloto, Pasajero[] pasajeros, double duracion){
        this.origen = origen;
        this.destino = destino;
        this.piloto = piloto;
        this.pasajeros = pasajeros;
        this.duracion = duracion;
    }

    public String getOrigen() {
        return this.origen;
    }

    public String getDestino() {
        return this.destino;
    }

    public Piloto getPiloto() {
        return this.piloto;
    }

    public Pasajero[] getPasajeros() {
        return this.pasajeros;
    }

    public double getDuracion() {
        return this.duracion;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public void setPiloto(Piloto piloto) {
        this.piloto = piloto;
    }

    public void setPasajeros(Pasajero[] pasajeros) {
        this.pasajeros = pasajeros;
    }

    public void setDuracion(double duracion) {
        this.duracion = duracion;
    }

    public void listaPasajeros(){
        for(int i = 0; i < this.pasajeros.length; i++){
            System.out.println("--------Pasajero: "+i+"--------");
            System.out.println(this.pasajeros[i].toString());
            if(this.pasajeros.length == i+1){
                System.out.println("---------------------------");
            }
        }
    }

}
