package ar.edu.utn.frba.dds;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Venta {
  private LocalDate fechaDeVenta;
  private ModoDePago modoDePago;
  private List<ItemVenta> itemsDeVenta = new ArrayList<>();
  private Integer cantidadCuotas;

  public Double consultarTotalVenta() {

    return this.getModoDePago().calcularCosto(this.itemsDeVenta);

  }

  public LocalDate getFechaDeVenta() {
    return fechaDeVenta;
  }

  public void setFechaDeVenta(LocalDate fechaDeVenta) {
    this.fechaDeVenta = fechaDeVenta;
  }

  public ModoDePago getModoDePago() {
    return modoDePago;
  }

  public void setModoDePago(ModoDePago modoDePago) {
    this.modoDePago = modoDePago;
  }


  public Integer getCantidadCuotas() {
    return cantidadCuotas;
  }

  public void setCantidadCuotas(Integer cantidadCuotas) {
    this.cantidadCuotas = cantidadCuotas;
  }

  public Venta() {
  }
}
