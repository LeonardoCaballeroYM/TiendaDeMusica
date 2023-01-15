package proyectotercerparcial;

/**
 *
 * @author YAEL
 */
public class Saldo {

    private double saldoTotal;

    public void agregarSaldo(double credito) {
        saldoTotal = saldoTotal + credito;
    }

    public void restarSaldo(double gasto) {
        saldoTotal = saldoTotal - gasto;
    }

    public double obtenerSaldo() {
        return saldoTotal;
    }

    public void establecerSaldo(double saldo) {
        this.saldoTotal = saldo;
    }
}
