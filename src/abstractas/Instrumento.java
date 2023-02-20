package abstractas;

import java.util.ArrayList;

enum Notas {
    DO,RE,MI,FA,SOL,LA,SI;
}

abstract class Instrumento {
    ArrayList<Notas> notas = new ArrayList<Notas>();

    public void add(Notas nota){
        notas.add(nota);
    }

    abstract void interpretar();
}
