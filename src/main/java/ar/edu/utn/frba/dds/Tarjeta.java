package ar.edu.utn.frba.dds;

import java.util.List;

public class Tarjeta implements ModoDePago {
  private Double coeficienteFijo = Double.valueOf(1);
  private Integer cantidadCuotasa = 1;

  public Double calcularCosto(List<ItemVenta> itemsDeVenta) {
    Double pago = Double.valueOf(0);
    pago = itemsDeVenta.stream()
        .mapToDouble(unItemDeVenta -> unItemDeVenta.getPrenda().getPrecio() * 0.01)
        .sum();
    pago = this.cantidadCuotasa * this.coeficienteFijo + pago;
    return pago;
  }

  public Tarjeta() {
  }

  public Tarjeta(Double coeficienteFijo, Integer cantidadCuotasa) {
    this.coeficienteFijo = coeficienteFijo;
    this.cantidadCuotasa = cantidadCuotasa;
  }
}
