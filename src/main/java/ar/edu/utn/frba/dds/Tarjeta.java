package ar.edu.utn.frba.dds;

import java.util.List;

public class Tarjeta implements ModoDePago{
  private Double coeficienteFijo;
  private Integer caantidadCuotasa;

  public Double calcularCosto(List<ItemVenta> itemsDeVenta) {
    Double montoAPagar = Double.valueOf(0);
    montoAPagar = itemsDeVenta.stream().mapToDouble(unItemDeVenta -> unItemDeVenta.getPrenda().getPrecio() * 0.01).sum();
    montoAPagar = this.caantidadCuotasa * this.coeficienteFijo + montoAPagar;
    return montoAPagar;
  }
}
