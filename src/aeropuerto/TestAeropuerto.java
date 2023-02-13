package aeropuerto;

public class TestAeropuerto {
    public static void main(String[] args) {
        //Los DNI y los Email estan inventados
        Piloto piloto = new Piloto("Manuel", "Perez", "20665984Z", "manuel@sqvsevilla.org", Rango.AGUILA, 10000, true);
        String[] idiomas = {"ES", "ENG", "DE"};
        Azafato azafato = new Azafato("Andrea", "Rodriguez", "15484878T", "arodri@sqvsevilla.org", 5000, idiomas);
        Trabajador trabajador = new Trabajador("Rocio", "Lopez", "36547895Q", "roper@sqvsevilla.org", 3200);
        Pasajero pa1 = new Pasajero("Antonio", "De Llamas", "123123123Y", "antollamas@gmail.com", "548998320");

        Pasajero[] pasajeros = {pa1};

        Vuelo vuelo = new Vuelo("Kiev", "SVQ Sevilla", piloto, pasajeros, 5.3);

        vuelo.listaPasajeros();

        System.out.println(azafato.toString());
        System.out.println("---------------------------");
        System.out.println(trabajador.toString());
    }
}
