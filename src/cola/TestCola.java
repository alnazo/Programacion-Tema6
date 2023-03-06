package cola;

public class TestCola {
    public static void main(String[] args) {
        Lista li = new Lista();
        Lista pi = new Lista();

        li.encolarSeguidos();
        System.out.println("--------");
        li.mostrar();
        System.out.println("--------");
        li.vaciarCola();
        System.out.println("--------");
        li.mostrar();
    }
}
