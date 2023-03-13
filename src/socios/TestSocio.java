package socios;

public class TestSocio {
    public static void main(String[] args) {
        Socio s1 = new Socio(3, "Manuel", "11-07-2002");
        Socio s2 = new Socio(1, "Noelia", "21-11-2001");

        int resultado = s1.compareTo(s2);
        System.out.println(resultado);
        int resultado2 = s2.compareTo(s1);
        System.out.println(resultado2);
    }
}
