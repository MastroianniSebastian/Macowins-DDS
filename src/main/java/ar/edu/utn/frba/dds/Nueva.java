package ar.edu.utn.frba.dds;

public class Nueva implements EstadoDePrenda {

  @Override
  public Double calcularCosto(Double precio) {
    return precio;
  }
}
