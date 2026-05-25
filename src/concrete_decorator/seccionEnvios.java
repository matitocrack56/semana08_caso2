package concrete_decorator;

import component.reporte;
import concrete_component.reporteBase;
import model.venta;

public class seccionEnvios extends reporteDecorator{
    public seccionEnvios(reporte r) {
        super(r);
    }

    @Override
    public void generar() {

        r.generar();

        System.out.println("\n=== DETALLE DE ENVIOS ===");

        if (r instanceof reporteBase) {

            reporteBase rb = (reporteBase) r;

            for (venta v : rb.getVentas()) {

                System.out.println(
                        v.getProducto() +
                                " -> Destino: " +
                                v.getDestino()
                );
            }
        }
    }

    @Override
    public String getDescripcion() {
        return r.getDescripcion() + " + Envios";
    }
}
