package socios;

import java.util.Arrays;

public class TestSocio {
    public static void main(String[] args) {
        Socio s1 = new Socio(3, "Manuel", "11-07-2002");
        Socio s2 = new Socio(1, "Noelia", "21-11-2001");
        ComparaEdades c = new ComparaEdades();
        Socio[] t = new Socio[]{
            new Socio(2, "Ana", "07-12-1995"),
            new Socio(5, "Tomás", "20-01-2002"),
            new Socio(1, "Antonio", "06-05-2004"),
        };

        System.out.println(Arrays.deepToString(t));
        Arrays.sort(t,c);
        System.out.println(Arrays.deepToString(t));
    }
}
