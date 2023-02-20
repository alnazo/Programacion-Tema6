package horas;

public class TestHora {
    public static void main(String[] args) {
        Hora hora = new Hora(5, 35);

        System.out.println(hora);
        hora.inc();
        System.out.println(hora);
        boolean seth = hora.setHora(33);
        System.out.println(seth);
        boolean setm = hora.setMinutos(59);
        System.out.println(hora);
        hora.inc();
        System.out.println(hora);


        HoraExacta h1 = new HoraExacta(12, 31, 50);
        HoraExacta h2 = new HoraExacta(12, 31, 50);
        HoraExacta h3 = new HoraExacta(17, 59, 59);

        System.out.println(h1);
        System.out.println(h1.iguales(h2));
        h3.inc();
        System.out.println(h3);
        System.out.println(h1.equals(h3));


    }
}
