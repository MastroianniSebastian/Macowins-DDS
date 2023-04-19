package ar.edu.utn.frba.dds;

public class ItemVenta {
  private Integer cantidad;
  private Prenda prenda;

  public Double calcularValorDeItem() {
    return prenda.calcularCosto() * cantidad;
  }

  public Integer getCantidad() {
    return cantidad;
  }

  public Prenda getPrenda() {
    return this.prenda;
  }

  public ItemVenta(Integer cantidad, Prenda prenda) {
    this.cantidad = cantidad;
    this.prenda = prenda;
  }
}