package proyectotercerparcial;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Formatter;
import java.util.FormatterClosedException;
import java.util.NoSuchElementException;
import java.util.Scanner;

/**
 *
 * @author LAB01-PC24
 */
public class PaginaWeb {

    private Scanner input;
    private Formatter salida;
    private String nombreArchivo = "";
    private ArrayList<Cancion> listaCanciones = new ArrayList<>();

    public PaginaWeb(String nombreArchivo) {
        this.nombreArchivo = nombreArchivo;
    }

    private void escribirPaginaWeb() {
        salida.format("<!doctype html>\n");
        salida.format("<!doctype html>\n");
        salida.format("<html>\n");
        salida.format("<head>\n");
        salida.format("<meta charset='UTF-8'>\n");
        salida.format("<title>ROKU MUSIC</title>\n");
        salida.format("<link rel='stylesheet'\n");
        salida.format("href='css/bootstrap.min.css'\n");
        salida.format("media='screen'>\n");
        salida.format("<style>\n");
        salida.format("#cuerpo{\n");
        salida.format("margin: 100px;\n");
        salida.format("}\n");
        salida.format("</style>\n");
        salida.format("</head>\n");
        //salida.format("<body>\n");
        salida.format("<body background='BACKGROUND/1f58189811495ed16cd3857e8eeaf9b6.jpg'>\n");
        //salida.format("<table border='1'>\n");
        salida.format("<font color='black'>\n");
        salida.format("<div id='cuerpo'>\n");
        salida.format("<h1>Catalogos de canciones</h1>\n");
        salida.format("<table class='table table-striped'>\n");
        salida.format("<thead>\n");
        salida.format("<tr>\n");
        salida.format("<th>Clave</th>\n");
        salida.format("<th>Nombre de la cancion</th>\n");
        salida.format("<th>Nombre del cantante</th>\n");
        salida.format("<th>Genero</th>\n");
        salida.format("<th>Portada</th>\n");
        salida.format("<th>Album</th>\n");
        salida.format("<th>Archivo</th>\n");
        salida.format("<th>Precio</th>\n");
        salida.format("</tr>\n");
        salida.format("</thead>\n");
        salida.format("<tbody>\n");

        for (Cancion aux : listaCanciones) {
            salida.format("<tr>\n");
            salida.format("<td>%d</td>\n", aux.getClave());
            salida.format("<td>%s</td>\n", aux.getNombreCancion());
            salida.format("<td>%s</td>\n", aux.getNombreCantante());
            salida.format("<td>%s</td>\n", aux.getGenero());
            salida.format("<td><img src = 'img/" + aux.getPortada() + ".jpg' width = '65'height = '50' ></td>\n");
            salida.format("<td>%s</td>\n", aux.getAlbum());
            salida.format("<td><audio src=\'CancionesPrueba/" + aux.getArchivo() + ".mp3'\' controls>\n" + "</audio></td>\n");
            //salida.format("<td>%s</td>\n", aux.getArchivo());
            salida.format("<td>%.2f</td>\n", aux.getPrecio());
            salida.format("</tr>\n");
        }

        salida.format("</tbody>\n");
        salida.format("</table>\n");
        salida.format("</div>\n");
        salida.format("<script src='js/jquery.min.js'></script>\n");

        salida.format("<script src='js/bootstrap.min.js'></script>\n");
        //salida.format("</table>\n");
        salida.format("</body>\n");
        salida.format("</html>\n");
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
            escribirPaginaWeb();
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
}//fin de class PaginaWeb

