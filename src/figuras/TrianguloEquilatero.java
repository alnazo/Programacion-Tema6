package figuras;

public class TrianguloEquilatero implements Area{
    private double alto;
    private double base;
    
    public TrianguloEquilatero(double base, double alto){
        this.alto = alto;
        this.base = base;
    }

    public double calculaArea(int lado){
        return (this.alto*this.base)/2;
    }

}
