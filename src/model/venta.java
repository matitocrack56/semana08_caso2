package model;

public class venta {
    private String producto;
    private double monto;
    private String destino;

    public venta(String producto, double monto, String destino) {

        this.producto = producto;
        this.monto = monto;
        this.destino = destino;
    }

    public String getProducto() {
        return producto;
    }

    public double getMonto() {
        return monto;
    }

    public String getDestino() {
        return destino;
    }
}
