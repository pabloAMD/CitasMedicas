package Dao;

import java.util.List;

import modelo.Consulta;



public interface ConsultaDao extends GenericDao<Consulta, Integer>{

	List<Consulta> findbyUserId(String dato);

}
