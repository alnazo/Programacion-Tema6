package cola;

public class TestCola {
    public static void main(String[] args) {
        Lista li = new Lista();
        Lista pi = new Lista();

        li.encolar(20);
        li.encolar(30);
        li.encolar(5);
        li.encolar(0);
        li.encolar(-6);
        li.mostrar();
        li.desencolar();
        li.mostrar();

        pi.apilar(20);
        pi.apilar(500);
        pi.apilar(7);
        pi.apilar(2);
        pi.mostrar();
        pi.desapilar();
        pi.mostrar();

    }
}
