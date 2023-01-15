package proyectotercerparcial;

import java.util.Locale;

/**
 *
 * @author YAEL
 */
public class Cancion {

    private int Clave;
    private String NombreCancion;
    private String NombreCantante;
    private String Genero;
    private String Portada;
    private String Album;
    private String Archivo;
    private double Precio;

    public Cancion() {
        this(0, "", "", "", "", "", "", 0.0);
    }

    public Cancion(int Clave, String NombreCancion, String NombreCantante,
            String Genero, String Portada, String Album, String Archivo, double Precio) {
        this.Clave = Clave;
        this.NombreCancion = NombreCancion;
        this.NombreCantante = NombreCantante;
        this.Genero = Genero;
        this.Portada = Portada;
        this.Album = Album;
        this.Archivo = Archivo;
        this.Precio = Precio;
    }

    public void setClave(int Clave) {
        this.Clave = Clave;
    }

    public int getClave() {
        return this.Clave;
    }

    public void setNombreCancion(String NombreCancion) {
        this.NombreCancion = NombreCancion;
    }

    public String getNombreCancion() {
        return this.NombreCancion;
    }

    public void setNombreCantante(String NombreCantante) {
        this.NombreCantante = NombreCantante;
    }

    public String getNombreCantante() {
        return this.NombreCantante;
    }

    public void setGenero(String Genero) {
        this.Genero = Genero;
    }

    public String getGenero() {
        return this.Genero;
    }

    public void setPortada(String Portada) {
        this.Portada = Portada;
    }

    public String getPortada() {
        return this.Portada;
    }

    public void setAlbum(String Album) {
        this.Album = Album;
    }

    public String getAlbum() {
        return this.Album;
    }

    public void setArchivo(String Archivo) {
        this.Archivo = Archivo;
    }

    public String getArchivo() {
        return this.Archivo;
    }

    public void setPrecio(double Precio) {
        this.Precio = Precio;
    }

    public double getPrecio() {
        return this.Precio;
    }

    @Override
    public String toString() {
        return String.format("\tDatos de la cancion\n\nClave: %d \nNombreCancion: %s"
                + "\nNombreCantante: %s\nGenero: %s\nPortada: %s"
                + "\nAlbum: %s\nArchivo: %s\nPrecio: %.2f",
                this.Clave, this.NombreCancion, this.NombreCantante, this.Genero,
                this.Portada, this.Album, this.Archivo, this.Precio);
    }

}
