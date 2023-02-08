package bibliotecagranada;

public class Libro {
    String isbn;
    String titulo;
    Tematica tematica;
    double precio;
    Bibliotecario bibliotecario;

    public Libro(String isbn, String titulo, Tematica tematica, double precio, Bibliotecario bibliotecario){
        this.isbn = isbn;
        this.titulo = titulo;
        this.tematica = tematica;
        this.precio = precio;
        this.bibliotecario = bibliotecario;
    }

    public boolean esISBN0(){
        boolean res = false;

        if (this.isbn == "0000"){
            res = true;
        }

        return res;
    }
}
