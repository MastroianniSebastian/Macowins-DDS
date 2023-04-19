package ar.edu.utn.frba.dds;

public class Promocion implements EstadoDePrenda {
  private Double valorFijo = Double.valueOf(0);


  @Override
  public Double calcularCosto(Double precio) {
    return precio - this.valorFijo;
  }

  public Promocion() {
  }
}
