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
    }
}
