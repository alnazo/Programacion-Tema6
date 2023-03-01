package figuras;

public class TestFiguras {
    public static void main(String[] args) {
        Cuadrado cuadrado = new Cuadrado(20.0);
        TrianguloEquilatero triangulo = new TrianguloEquilatero(10.5, 20.8);

        System.out.println(cuadrado.calculaArea(20));
        System.out.println(triangulo.calculaArea(10));


    }
}
