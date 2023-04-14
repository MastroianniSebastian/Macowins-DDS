package ar.edu.utn.frba.dds;

public class Liquidacion implements EstadoDePrenda {

  public Double calcularCosto(Double precio) {
    return precio * 0.5;
  }

}
