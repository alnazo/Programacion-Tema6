package hospital;

public class TestHospital {
    public static void main(String[] args) {
        // Trabajador trab = new Trabajador("Pedro", 21356, 1500);
        // Medico med = new Medico("Manuel", 558948, 3500.66, Especialidad.CARDIOLOGO, 15558756);
        // NoMedico nomed = new NoMedico("Rocio", 15558746, 3000, Area.ENFERMERO);

        // System.out.println(trab);
        // System.out.println("------------");
        // System.out.println(med);
        // System.out.println("------------");
        // med.pacienteAtendido();
        // System.out.println(med);
        // System.out.println("------------");
        // System.out.println(nomed);

        Cardiologo card = new Cardiologo("Manuel", 558948, 3500.66, Especialidad.CARDIOLOGO, 15558756);

        System.out.println(card);
        card.setPacientes(150);
        System.out.println(card.calcularSueldo());


    }
}