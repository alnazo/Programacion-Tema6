package aeropuerto;

public class TestAeropuerto {
    public static void main(String[] args) {
        //Los DNI y los Email estan inventados
        Piloto piloto = new Piloto("Manuel", "Perez", "20665984Z", "manuel@sqvsevilla.org", Rango.AGUILA, 10000, true);
        String[] idiomas = {"ES", "ENG", "DE"};
        Azafato azafato = new Azafato("Andrea", "Rodriguez", "15484878T", "arodri@sqvsevilla.org", 5000, idiomas);
        Trabajador trabajador = new Trabajador("Rocio", "Lopez", "36547895Q", "roper@sqvsevilla.org", 3200);
        Pasajero pa1 = new Pasajero("Antonio", "De Llamas", "123123123Y", "antollamas@gmail.com", "548998320");
        Pasajero pa2 = new Pasajero("Ana", "Gomez", "58894756H", "ananago@gmail.com", "123487862");
        Pasajero pa3 = new Pasajero("Teresa", "Carmona", "158842138R", "tcarmo@gmail.com", "157899631");

        Pasajero[] pasajeros = {pa1 , pa2, pa3};

        Vuelo vuelo = new Vuelo("Kiev", "SVQ Sevilla", piloto, pasajeros, 5.3);

        vuelo.listaPasajeros();
        System.out.println("---------------------------");
        System.out.println("---------------------------");

        System.out.println(azafato);
        System.out.println("---------------------------");
        System.out.println(trabajador);
    }
}
