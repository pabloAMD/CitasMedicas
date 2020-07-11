package Dao;

import java.util.List;

import modelo.Medico;


public interface MedicoDao extends GenericDao<Medico, Integer>{

	List<Medico> findbyUserId(String dato);

}
