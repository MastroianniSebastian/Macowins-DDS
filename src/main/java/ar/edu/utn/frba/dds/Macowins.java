package ar.edu.utn.frba.dds;

import java.time.LocalDate;
import java.util.List;
import java.util.stream.Stream;

public class Macowins{
  private List<Venta> ventasList;

  public Double calcularVentasDelDia(LocalDate dia){
    List<Venta> ventasDelDia = (List<Venta>) ventasList.stream().filter(unaVenta -> unaVenta.getFechaDeVenta().isEqual(dia));
    Double totalVentaDelDia = null;
    totalVentaDelDia = ventasDelDia.stream().mapToDouble(unaVenta -> unaVenta.consultarTotalVenta()).sum();
    return totalVentaDelDia;
  }



  public Double suma(Double a, Double b){
    return a+b;
  }

  public List<Venta> getVentasList() {
    return ventasList;
  }

  public void setVentasList(List<Venta> ventasList) {
    this.ventasList = ventasList;
  }
}
