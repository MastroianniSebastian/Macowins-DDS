package ar.edu.utn.frba.dds;

public class Prenda{
  private Double precio;
  private EstadoDePrenda estadoDePrenda;

  public Double calcularCosto(){
    return estadoDePrenda.calcularCosto(this.precio);
  }

  public Double getPrecio() {
    return precio;
  }

  public void setPrecio(Double precio) {
    this.precio = precio;
  }

  public EstadoDePrenda getEstadoDePrenda() {
    return estadoDePrenda;
  }

  public void setEstadoDePrenda(EstadoDePrenda estadoDePrenda) {
    this.estadoDePrenda = estadoDePrenda;
  }
}
