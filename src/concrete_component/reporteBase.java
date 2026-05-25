package concrete_component;

import component.reporte;
import model.venta;

import java.util.ArrayList;
import java.util.List;

public class reporteBase implements reporte {
    private List<venta> ventas;

    public reporteBase(List<venta> ventas) {
        this.ventas = ventas;
    }

    public List<venta> getVentas() {
        return ventas;
    }

    @Override
    public void generar() {

        System.out.println("=== REPORTE BASE ===");

        for (venta v : ventas) {
            System.out.println("Producto: "+v.getProducto() +
                    " | Monto: S/" + v.getMonto()+
                    " | Destino: " + v.getDestino());
        }
    }

    @Override
    public String getDescripcion() {
        return "Reporte Base";
    }
}
