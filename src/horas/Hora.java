package horas;

public class Hora{
    int hora;
    int minutos;

    Hora(int hora, int min){
        if (hora >= 0 && hora <= 23){
            this.hora = hora;
        } else {
            this.hora = 0;
        }
        if(min >= 0 && min <= 59){
            this.minutos = min;
        } else {
            this.minutos = 0;
        }
    }

    public void inc(){
        this.minutos++;
        if (this.minutos >= 60){
            this.minutos = 0;
            this.hora++;
            if (this.hora >= 24){
                this.hora = 0;
            }
        }
    }

    public boolean setMinutos(int min){
        boolean res = false;
        if(min >= 0 && min <= 59){
            this.minutos = min;
            res = true;
        }
        return res;
    }

    public boolean setHora(int hora){
        boolean res = false;
        if (hora >= 0 && hora <= 23){
            this.hora = hora;
            res = true;
        }
        return res;
    }

    @Override
    public String toString(){
        return this.hora+":"+this.minutos;
    }


}