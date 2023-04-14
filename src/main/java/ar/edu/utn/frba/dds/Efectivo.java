package ar.edu.utn.frba.dds;

import java.util.List;

public class Efectivo implements ModoDePago{


  public Double calcularCosto(List<ItemVenta> itemsDeVenta) {
    Double montoAPagar = Double.valueOf(0);
    montoAPagar = itemsDeVenta.stream().mapToDouble(unItemDeVenta-> unItemDeVenta.getPrenda().getPrecio()).sum();
    return montoAPagar;
  }
}