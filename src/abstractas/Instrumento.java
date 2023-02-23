package abstractas;

import java.util.ArrayList;

enum Nota {
    DO,RE,MI,FA,SOL,LA,SI;
}

abstract class Instrumento {
    ArrayList<Nota> notas = new ArrayList<Nota>();

    public void add(Nota nota){
        notas.add(nota);
    }

    abstract void interpretar();
}
