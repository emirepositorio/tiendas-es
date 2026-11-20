package modelo;

import java.util.Date;

public class Abono {
    private double monto;
    private Date fecha;

    public Abono(double monto) {
        this.monto = monto;
        this.fecha = new Date();
    }

    public double getMonto() { return monto; }
    public Date getFecha() { return fecha; }
}
