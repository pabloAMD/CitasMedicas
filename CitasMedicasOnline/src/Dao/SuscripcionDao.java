package Dao;

import java.util.List;

import modelo.Suscripcion;

public interface SuscripcionDao extends GenericDao<Suscripcion, Integer>{

	List<Suscripcion> findbyUserId(String dato);

}
