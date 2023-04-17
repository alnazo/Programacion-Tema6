package socioconjunto;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SocioDAO {
    private List<Socio> socios;
    private String filename;

    public SocioDAO(String filename) {
        this.socios = new ArrayList<>();
        this.filename = filename;
    }

    public void alta(Socio s) {
        socios.add(s);
    }

    public void baja(Socio s) {
        socios.remove(s);
    }

    public void modificar(Socio s) {
        int index = socios.indexOf(s);
        if (index != -1) {
            socios.set(index, s);
        }
    }

    public List<Socio> listarPorDni() {
        List<Socio> resultado = new ArrayList<>(socios);
        Collections.sort(resultado);
        return resultado;
    }

    public List<Socio> listarPorAntiguedad() {
        List<Socio> resultado = new ArrayList<>(socios);
        Collections.sort(resultado, new Comparator<Socio>() {
            @Override
            public int compare(Socio s1, Socio s2) {
                return s2.antiguedad() - s1.antiguedad();
            }
        });
        return resultado;
    }

    public void guardar() throws IOException {
        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(filename))) {
            out.writeObject(socios);
        }
    }

    @SuppressWarnings("unchecked")
    public void leer() throws IOException, ClassNotFoundException {
        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream(filename))) {
            socios = (List<Socio>) in.readObject();
        }
    }
}
