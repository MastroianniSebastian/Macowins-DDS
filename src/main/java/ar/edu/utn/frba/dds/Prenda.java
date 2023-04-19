package ar.edu.utn.frba.dds;

public class Prenda {
  private Double precio;
  private EstadoDePrenda estadoDePrenda;

  public Double calcularCosto() {
    return estadoDePrenda.calcularCosto(this.precio);
  }

  public Double getPrecio() {
    return precio;
  }


  public EstadoDePrenda getEstadoDePrenda() {
    return estadoDePrenda;
  }


  public Prenda(Double precio, EstadoDePrenda estadoDePrenda) {
    this.precio = precio;
    this.estadoDePrenda = estadoDePrenda;
  }
}
