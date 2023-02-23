package abstractas;

public class Piano extends Instrumento {

    void interpretar(){
        for(int i = 0; i<notas.size();i++){
            if (notas.get(i) == Nota.DO){
                System.out.println("DOONNN");
            } else if (notas.get(i) == Nota.RE){
                System.out.println("DOON");
            } else if (notas.get(i) == Nota.MI){
                System.out.println("DON");
            } else if (notas.get(i) == Nota.FA){
                System.out.println("DONN");
            } else if (notas.get(i) == Nota.SOL){
                System.out.println("DONNN");
            } else if (notas.get(i) == Nota.LA){
                System.out.println("DOOONNNN");
            } else if (notas.get(i) == Nota.SI){
                System.out.println("DOOOONNNNNNN");
            }

        }
    }

}
