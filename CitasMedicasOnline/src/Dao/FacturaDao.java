package Dao;

import java.util.List;

import modelo.Factura;



public interface FacturaDao extends GenericDao<Factura, Integer>{

	List<Factura> findbyUserId(String dato);

}
