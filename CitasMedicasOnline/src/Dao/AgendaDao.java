package Dao;

import java.util.List;

import modelo.Agenda;



public interface AgendaDao extends GenericDao<Agenda, Integer>{

	List<Agenda> findbyUserId(String dato);

}
