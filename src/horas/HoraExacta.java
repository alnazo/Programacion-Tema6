package horas;

public class HoraExacta extends Hora{
    int segundos;

    HoraExacta(int hora, int min, int seg){
        super(hora, min);
        if (seg >= 0 && seg <= 59){
            this.segundos = seg;
        } else {
            this.segundos = 0;
        }
    }

    public boolean setSegundos(int seg){
        boolean res = false;
        if (seg >= 0 && seg <= 59){
            this.segundos = seg;
            res = true;
        }
        return res;
    }

    @Override
    public void inc(){
        this.segundos++;
        if(this.segundos >= 60){
            this.segundos = 0;
            super.inc();
        }
    }

    @Override
    public boolean equals(Object otro){
        boolean res = false;
        HoraExacta otraHora = (HoraExacta) otro;
        if (this.hora == otraHora.hora && this.minutos == otraHora.minutos && this.segundos == otraHora.segundos){
            res = true;
        }
        return res;
    }

    public boolean iguales(Object otraH){
        boolean res = false;
        HoraExacta otra = (HoraExacta) otraH;
        if (this.hora == otra.hora && this.minutos == otra.minutos && this.segundos == otra.segundos){
            res = true;
        }
        return res;
    }

}
