package ar.edu.utn.frba.dds;

public class ItemVenta{
  private Integer cantidad;
  private Prenda prenda;

  public Double calcularValorDeItem(){
    return this.prenda.calcularCosto() * this.cantidad;
  }

  public Integer getCantidad() {
    return cantidad;
  }

  public void setCantidad(Integer cantidad) {
    this.cantidad = cantidad;
  }

  public Prenda getPrenda() {
    return prenda;
  }

  public void setPrenda(Prenda prenda) {
    this.prenda = prenda;
  }
}