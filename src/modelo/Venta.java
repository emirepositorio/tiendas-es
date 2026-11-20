package modelo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Venta {
    private Date fecha;
    private String tipoPago; // "CONTADO" o "CREDITO"
    private Cliente cliente; // solo en ventas a crédito
    private List<DetalleVenta> detalles = new ArrayList<>();

    public Venta(String tipoPago, Cliente cliente) {
        this.fecha = new Date();
        this.tipoPago = tipoPago;
        this.cliente = cliente;
    }

    public Date getFecha() { return fecha; }
    public String getTipoPago() { return tipoPago; }
    public Cliente getCliente() { return cliente; }
    public List<DetalleVenta> getDetalles() { return detalles; }

    public void agregarDetalle(DetalleVenta detalle) {
        detalles.add(detalle);
    }

    public double calcularTotal() {
        double total = 0;
        for (DetalleVenta d : detalles) {
            total += d.calcularSubtotal();
        }
        return total;
    }
}
