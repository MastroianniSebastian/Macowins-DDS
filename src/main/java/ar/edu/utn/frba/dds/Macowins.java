package ar.edu.utn.frba.dds;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Macowins {
  private List<Venta> ventasList = new ArrayList<>();

  public Double calcularVentasDelDia(LocalDate dia) {
    List<Venta> ventasDelDia = (List<Venta>) ventasList.stream()
        .filter(unaVenta -> unaVenta.getFechaDeVenta()
            .isEqual(dia));
    Double totalVentaDelDia = null;
    totalVentaDelDia = ventasDelDia
        .stream()
        .mapToDouble(unaVenta -> unaVenta.consultarTotalVenta())
        .sum();
    return totalVentaDelDia;
  }

  public Macowins() {
  }
}
