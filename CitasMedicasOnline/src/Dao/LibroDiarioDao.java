package Dao;

import java.util.List;

import modelo.LibroDiario;

public interface LibroDiarioDao extends GenericDao<LibroDiario, Integer>{

	List<LibroDiario> findbyUserId(String dato);

}
