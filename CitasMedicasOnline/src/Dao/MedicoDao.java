package Dao;

import java.util.List;

import modelo.Medico;


public interface MedicoDao extends GenericDao<Medico, String>{

	List<Medico> findbyUserId(String dato);

}
