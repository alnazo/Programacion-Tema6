package cola;

public class TestCola {
    public static void main(String[] args) {
        Lista li = new Lista();

        li.encolar(20);
        li.encolar(30);
        li.encolar(5);
        li.encolar(0);
        li.encolar(-6);
        li.mostrar();
        li.desencolar();
        li.mostrar();

    }
}
