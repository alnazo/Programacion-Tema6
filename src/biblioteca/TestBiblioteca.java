package biblioteca;

public class TestBiblioteca {

    public static void main(String[] args) {
        Libro li1 = new Libro("La vida de Aaron", "Aaron Alon", 5);

        boolean prestamo = li1.prestamo();

        if (prestamo){
            System.out.println("Libro cedido");
        }

        System.out.println(li1.toString());

        boolean devolucion = li1.devolucion();

        if (devolucion){
            System.out.println("Libro devuelto");
        }
        
        System.out.println(li1.toString());

    }
    
}
