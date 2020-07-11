package Dao;

import java.util.List;

import modelo.CitaMedica;


public interface CitaMedicaDao extends GenericDao<CitaMedica, Integer>{

	List<CitaMedica> findbyUserId(String dato);

}
