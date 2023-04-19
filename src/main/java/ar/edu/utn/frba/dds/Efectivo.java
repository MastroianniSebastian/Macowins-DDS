package ar.edu.utn.frba.dds;

import java.util.List;

public class Efectivo implements ModoDePago {


  public Double calcularCosto(List<ItemVenta> itemsDeVenta) {
    Double pago = Double.valueOf(0);
    pago = itemsDeVenta.stream()
        .mapToDouble(unItemDeVenta -> unItemDeVenta.getPrenda().getPrecio())
        .sum();
    return pago;
  }

  public Efectivo() {
  }
}