package concrete_decorator;

import component.reporte;

public class seccionGrafico extends reporteDecorator{

    public seccionGrafico(reporte r) {
        super(r);
    }

    @Override
    public void generar() {

        r.generar();

        System.out.println("\n=== GRAFICO ===");
        System.out.println("Se incluye un gráfico de barras.");
    }

    @Override
    public String getDescripcion() {
        return r.getDescripcion() + " + Grafico";
    }
}
