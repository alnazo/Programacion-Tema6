package biblioteca;

public class Libro {
    private String titulo;
    private String autor;
    private int ejemplares;
    private int prestados;

    Libro() {  
    }

    Libro(String titulo, String autor, int ejemplares) {
        this.titulo = titulo;
        this.autor = autor;
        this.ejemplares = ejemplares;
        this.prestados = 0;
    }
    
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setEjemplares(int ejemplares) {
        this.ejemplares = ejemplares;
    }

    public void setPrestados(int prestados) {
        this.prestados = prestados;
    }

    public String getTitulo() {
        return titulo;
    }
    
    public String getAutor() {
        return autor;
    }

    public int getEjemplares() {
        return ejemplares;
    }

    public int getPrestados() {
        return prestados;
    }

    public String toString() {
        return "Titulo: " + this.titulo + " \nAutor: " + this.autor + " \nEjemplares: " + ejemplares + " \nPrestados: " + prestados;
    }

    public boolean prestamo(){
        boolean res = false;

        if (this.ejemplares > this.prestados){    
            this.prestados++;
            res = true;
        }
        
        return res;
    }

    public boolean devolucion(){
        boolean res = false;

        if (this.prestados > 0){
            this.prestados--;
            res = true;
        }

        return res;
    }




    
    
}
