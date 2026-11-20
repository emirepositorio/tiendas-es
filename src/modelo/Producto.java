package modelo;

public class Producto {
    private String codigo;
    private String nombre;
    private double precio;
    private int stock;
    private int stockMinimo;

    public Producto(String codigo, String nombre, double precio, int stock, int stockMinimo) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.precio = precio;
        this.stock = stock;
        this.stockMinimo = stockMinimo;
    }

    public String getCodigo() { return codigo; }
    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }
    public double getPrecio() { return precio; }
    public void setPrecio(double precio) { this.precio = precio; }
    public int getStock() { return stock; }
    public int getStockMinimo() { return stockMinimo; }
    public void setStockMinimo(int stockMinimo) { this.stockMinimo = stockMinimo; }

    public boolean hayStock(int cantidad) {
        return cantidad > 0 && cantidad <= stock;
    }

    public void descontar(int cantidad) {
        if (!hayStock(cantidad)) {
            throw new IllegalArgumentException("Stock insuficiente de " + nombre);
        }
        stock -= cantidad;
    }

    public boolean estaBajoMinimo() {
        return stock <= stockMinimo;
    }
}
