package Dao;

import java.util.List;

import modelo.Especialidad;

public interface EspecialidadDao extends GenericDao<Especialidad, Integer>{

	List<Especialidad> findbyUserId(String dato);

}
