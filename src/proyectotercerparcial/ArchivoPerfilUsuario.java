package proyectotercerparcial;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Formatter;
import java.util.FormatterClosedException;
import java.util.NoSuchElementException;
import java.util.Scanner;

/**
 *
 * @author YAEL
 */
public class ArchivoPerfilUsuario {

    private Scanner input;
    private Formatter salida;
    private String nombreArchivo = "";
    private ArrayList<RegistroPerfilUsuario> listaRegistroCuentas;

    public ArchivoPerfilUsuario(String nombreArchivo) {
        this.nombreArchivo = nombreArchivo;
        listaRegistroCuentas = new ArrayList<>();
    }

    private void escribir() {
        for (RegistroPerfilUsuario aux : listaRegistroCuentas) {
            salida.format("%d %s %s %.2f\n",
                    aux.getCuenta(),
                    quitarEspacios(aux.getNombre()),
                    quitarEspacios(aux.getApellido()),
                    aux.getDinero());
        }
    }

    private void leer() {
        while (input.hasNext()) {
            int cuenta = input.nextInt();
            String nombre = ponerEspacios(input.next());
            String apellido = ponerEspacios(input.next());
            double dinero = input.nextDouble();
            RegistroPerfilUsuario registro = new RegistroPerfilUsuario(cuenta, nombre,
                    apellido, dinero);
            listaRegistroCuentas.add(registro);
        } // end while
    }

    public void EscribirArchivo(ArrayList<RegistroPerfilUsuario> lista) {
        listaRegistroCuentas = lista;
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
    public ArrayList<RegistroPerfilUsuario> leerArchivo() {
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
        return listaRegistroCuentas;
    }

    private String quitarEspacios(String cadena) {
        return cadena.replace(" ", "#");
    }

    private String ponerEspacios(String cadena) {
        return cadena.replace("#", " ");
    }

}//fin de class Archivo
