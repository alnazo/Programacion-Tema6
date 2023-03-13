package socios;

import java.util.Comparator;

public class ComparaEdades implements Comparator {
    @Override
    public int compare(Object obj1, Object obj2){
        return ((Socio)obj1).edad()-((Socio)obj2).edad();
    }
}
