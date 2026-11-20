package modelo;

public class Cliente extends Persona {
    private double limiteCredito;

    public Cliente(int id, String nombre, String telefono, double limiteCredito) {
        super(id, nombre, telefono);
        this.limiteCredito = limiteCredito;
    }

    public double getLimiteCredito() { return limiteCredito; }
    public void setLimiteCredito(double limiteCredito) { this.limiteCredito = limiteCredito; }

    public boolean puedeFiar(double monto) {
        return monto <= limiteCredito;
    }

    @Override
    public String mostrarResumen() {
        return getNombre() + " (límite de crédito: " + limiteCredito + ")";
    }
}
