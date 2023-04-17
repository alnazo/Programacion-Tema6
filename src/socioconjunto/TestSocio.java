package socioconjunto;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class TestSocio {
    public static void main(String[] args) {
        SocioDAO dao = new SocioDAO("extra/socios.dat");
        try {
            dao.leer();
        } catch (IOException | ClassNotFoundException e) {
            System.err.println("Error al leer el archivo: " + e.getMessage());
        }

        Scanner sc = new Scanner(System.in);
        int opcion;
        do {
            System.out.println("1. Alta");
            System.out.println("2. Baja");
            System.out.println("3. Modificación");
            System.out.println("4. Listado por DNI");
            System.out.println("5. Listado por antigüedad");
            System.out.println("6. Salir");
            System.out.print("Ingrese una opción: ");
            opcion = sc.nextInt();
            sc.nextLine();
            switch (opcion) {
                case 1: {
                    Socio s = leerSocio(sc);
                    dao.alta(s);
                    break;
                }
                case 2: {
                    Socio s = buscarSocio(sc, dao);
                    if (s != null) {
                        dao.baja(s);
                    }
                    break;
                }
                case 3: {
                    Socio s = buscarSocio(sc, dao);
                    if (s != null) {
                        Socio nuevoSocio = leerSocio(sc);
                        nuevoSocio.setDni(s.getDni());
                        dao.modificar(nuevoSocio);
                    }
                    break;
                }
                case 4: {
                    List<Socio> socios = dao.listarPorDni();
                    imprimirLista(socios);
                    break;
                }
                case 5: {
                    List<Socio> socios = dao.listarPorAntiguedad();
                    imprimirLista(socios);
                    break;
                }
                case 6: {
                    try {
                        dao.guardar();
                    } catch (IOException e) {
                        System.err.println("Error al guardar los datos: " + e.getMessage());
                    }
                    System.out.println("Fin del programa:");
                    break;
                }
                default: {
                    System.out.println("Opción inválida");
                    break;
                }
            }
            System.out.println();
        } while (opcion != 6);
    }

    
    private static Socio leerSocio(Scanner scanner) {
        System.out.print("Ingrese el DNI del socio: ");
        String dni = scanner.nextLine();
        System.out.print("Ingrese el nombre del socio: ");
        String nombre = scanner.nextLine();
        System.out.print("Ingrese la fecha de alta (formato dd/MM/yyyy): ");
        String fechaAltaString = scanner.nextLine();
        Date fechaAlta = null;
        try {
            fechaAlta = new SimpleDateFormat("dd/MM/yyyy").parse(fechaAltaString);
        } catch (ParseException e) {
            System.err.println("Error al leer la fecha: " + e.getMessage());
        }
        return new Socio(dni, nombre, fechaAlta);
    }
    
    private static Socio buscarSocio(Scanner scanner, SocioDAO dao) {
        System.out.print("Ingrese el DNI del socio: ");
        String dni = scanner.nextLine();
        List<Socio> socios = dao.listarPorDni();
        Socio s = new Socio(dni, "", null);
        int index = Collections.binarySearch(socios, s);
        if (index >= 0) {
            return socios.get(index);
        } else {
            System.out.println("No se encontró el socio con DNI " + dni);
            return null;
        }
    }
    
    private static void imprimirLista(List<Socio> socios) {
        System.out.println(" DNI \t\t| Nombre \t| Fecha de alta");
        for (Socio s : socios) {
            System.out.println(s.getDni() + "\t| " + s.getNombre() + salto(s.getNombre()) + s.getFechaAltaString());
        }
    }

    private static String salto(String s){
        String res;
        if(s.length()>5){
            res = "\t| ";
        } else {
            res = "\t\t| ";
        }
        return res;
    }


}
