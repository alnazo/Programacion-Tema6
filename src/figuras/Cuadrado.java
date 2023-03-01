package figuras;

public class Cuadrado implements Area{
    private double lado;

    public Cuadrado(double lado){
        this.lado = lado;
    }

    public double calculaArea(int lado){
        return Math.pow(this.lado, (double) 2);
    }

}
