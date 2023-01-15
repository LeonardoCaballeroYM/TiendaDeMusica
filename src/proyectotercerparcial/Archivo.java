package proyectotercerparcial;

/**
 *
 * @author YAEL
 */
import java.util.*;
import java.io.*;

public class Archivo {

    private Scanner input;
    private Formatter salida;
    private String nombreArchivo = "";
    private ArrayList<Cancion> listaCanciones = new ArrayList<>();

    public Archivo(String nombreArchivo) {
        this.nombreArchivo = nombreArchivo;
    }

    private void escribir() {
        //ESCRIBIR CÓDIGO
        //todos los elementos que sean de tipo cadena(String) se le debe poner 
        //"quitar espacio" 
        for (Cancion aux : listaCanciones) {
            salida.format("%d %s %s %s %s %s %s %.2f\n",
                    aux.getClave(),
                    quitarEspacios(aux.getNombreCancion()),
                    quitarEspacios(aux.getNombreCantante()),
                    quitarEspacios(aux.getGenero()),
                    quitarEspacios(aux.getPortada()),
                    quitarEspacios(aux.getAlbum()),
                    quitarEspacios(aux.getArchivo()),
                    aux.getPrecio());
        }
    }

    private void leer() {
        while (input.hasNext()) {
            //ESCRIBIR CÓDIGO
            //recuperar datos crear isntancia y se agrega a la lista
            int clave = input.nextInt();
            String NombreCancion = ponerEspacios(input.next());
            String NombreCantante = ponerEspacios(input.next());
            String Genero = ponerEspacios(input.next());
            String Portada = ponerEspacios(input.next());
            String Album = ponerEspacios(input.next());
            String Archivo = ponerEspacios(input.next());
            double goles = input.nextDouble();
            Cancion registro = new Cancion(clave,
                    NombreCancion, NombreCantante, Genero,
                    Portada, Album, Archivo, goles);
            listaCanciones.add(registro);
        } // end while
    }

    public void EscribirArchivo(ArrayList<Cancion> lista) {
        listaCanciones = lista;
        try {
            salida = new Formatter(nombreArchivo);
        } // end try
        catch (SecurityException securityException) {
            System.err.println("No tienes permisos de escritura.");
            System.exit(1);
        } // end catch
        catch (FileNotFoundException filesNotFoundException) {
            System.err.println("Error al crear el archivo.");
            System.exit(1);
        } // end catch
        try {
            escribir();
        } // end try
        catch (FormatterClosedException formatterClosedException) {
            System.err.println("Error al escribir el archivo.");
            return;
        } // end catch
        catch (NoSuchElementException elementException) {
            System.err.println("Entrada no valida. Intente nuevamente.");
            input.nextLine();
        } // end catch
        if (salida != null) {
            salida.close();
        }
    }//EscribirArchivo

    // permite leer el archivo
    public ArrayList<Cancion> leerArchivo() {
        try {
            input = new Scanner(new File(nombreArchivo));
        } // end try
        catch (FileNotFoundException fileNotFoundException) {
            System.err.println("Error al abrir el archivo.");
            System.exit(1);
        }
        try // read records from file using Scanner object
        {
            leer();
        } // end try
        catch (NoSuchElementException elementException) {
            System.err.println("Formato de archivo incorrecto.");
            input.close();
            System.exit(1);
        } // end catch
        catch (IllegalStateException stateException) {
            System.err.println("Error al leer de archivo.");
            System.exit(1);
        } // end catch

        if (input != null) {
            input.close(); // cierra el archivo
        }
        return listaCanciones;
    }

    private String quitarEspacios(String cadena) {
        return cadena.replace(" ", "#");
    }

    private String ponerEspacios(String cadena) {
        return cadena.replace("#", " ");
    }
}//fin de clase

