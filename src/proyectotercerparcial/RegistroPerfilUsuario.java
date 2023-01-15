package proyectotercerparcial;

/**
 *
 * @author YAEL
 */
public class RegistroPerfilUsuario {

    private int cuenta;
    private String nombre;
    private String apellido;
    private double dinero;

    public RegistroPerfilUsuario(int cuenta, String nombre, String apellido,
            double dinero) {
        this.cuenta = cuenta;
        this.nombre = nombre;
        this.apellido = apellido;
        this.dinero = dinero;
    }

    public int getCuenta() {
        return cuenta;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setCuenta(int cuenta) {
        this.cuenta = cuenta;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setDinero(double dinero) {
        this.dinero = dinero;
    }

    public double getDinero() {
        return dinero;
    }
}
