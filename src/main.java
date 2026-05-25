import component.reporte;
import concrete_component.reporteBase;
import concrete_decorator.seccionEnvios;
import concrete_decorator.seccionGrafico;
import concrete_decorator.seccionTotales;
import model.venta;

import java.util.ArrayList;
import java.util.List;

public class main {

    public static void main(String[] args) {

        List<venta> ventas = new ArrayList<>();

        ventas.add(new venta("Laptop", 2500, "Lima"));
        ventas.add(new venta("Mouse", 80, "Trujillo"));
        ventas.add(new venta("Teclado", 150, "Chiclayo"));

        reporte r1 = new reporteBase(ventas);

        reporte r2 = new seccionTotales(new reporteBase(ventas));

        reporte r3 = new seccionGrafico(new seccionTotales(new reporteBase(ventas)));

        reporte r4 = new seccionEnvios(new seccionGrafico(new seccionTotales(new reporteBase(ventas))));

        System.out.println("\n" + r1.getDescripcion());
        r1.generar();

        System.out.println("\n" + r2.getDescripcion());
        r2.generar();

        System.out.println("\n" + r3.getDescripcion());
        r3.generar();

        System.out.println("\n" + r4.getDescripcion());
        r4.generar();
    }
}
