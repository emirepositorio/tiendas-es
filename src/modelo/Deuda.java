package modelo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Deuda {
    private Cliente cliente;
    private double saldo;
    private Date fechaLimite;
    private List<Abono> abonos = new ArrayList<>();

    public Deuda(Cliente cliente, double saldo, Date fechaLimite) {
        this.cliente = cliente;
        this.saldo = saldo;
        this.fechaLimite = fechaLimite;
    }

    public Cliente getCliente() { return cliente; }
    public double getSaldo() { return saldo; }
    public Date getFechaLimite() { return fechaLimite; }
    public List<Abono> getAbonos() { return abonos; }

    public void registrarAbono(Abono abono) {
        if (abono.getMonto() <= 0 || abono.getMonto() > saldo) {
            throw new IllegalArgumentException("Abono inválido");
        }
        abonos.add(abono);
        saldo -= abono.getMonto();
    }
}
