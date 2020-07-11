package Dao;

import java.util.List;

import modelo.Persona;




public interface PersonaDao extends GenericDao<Persona, Integer>{

	List<Persona> findbyUserId(String dato);

}
