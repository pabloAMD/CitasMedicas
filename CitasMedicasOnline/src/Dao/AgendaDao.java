package Dao;

import java.util.List;

import modelo.Agenda;



public interface AgendaDao extends GenericDao<Agenda, String>{

	List<Agenda> findbyUserId(String dato);

}
