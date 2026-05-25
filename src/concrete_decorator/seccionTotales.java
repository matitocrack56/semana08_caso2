package concrete_decorator;

import component.reporte;
import concrete_component.reporteBase;
import model.venta;

public class seccionTotales extends reporteDecorator{
    public seccionTotales(reporte r) {
        super(r);
    }

    @Override
    public void generar() {

        r.generar();

        double total = 0;

        if (r instanceof reporteBase) {

            reporteBase rb = (reporteBase) r;

            for (venta v : rb.getVentas()) {

                total += v.getMonto();
            }
        }

        System.out.println("\n=== TOTALES ===");
        System.out.println("Total de ventas: S/" + total);
    }

    @Override
    public String getDescripcion() {
        return r.getDescripcion() + " + Totales";
    }
}
