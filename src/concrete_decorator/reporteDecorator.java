package concrete_decorator;

import component.reporte;

public abstract class reporteDecorator implements reporte {
    protected final reporte r;

    public reporteDecorator(reporte r) {
        this.r = r;
    }

    @Override
    public String getDescripcion() {
        return "";
    }

    @Override
    public void generar() {
    }
}
