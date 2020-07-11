package Dao;

import java.util.List;
import modelo.PagoSuscripcion;

public interface PagoSuscripcionDao extends GenericDao<PagoSuscripcion, Integer>{

	List<PagoSuscripcion> findbyUserId(String dato);

}
