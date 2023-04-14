package ar.edu.utn.frba.dds;

import java.util.List;

public interface ModoDePago{

  public Double calcularCosto(List<ItemVenta> itemsDeVenta);

}
