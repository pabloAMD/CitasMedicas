package Dao;

import java.util.List;

import modelo.HistoriaClinica;
public interface HistoriaClinicaDao extends GenericDao<HistoriaClinica, Integer>{

	List<HistoriaClinica> findbyUserId(String dato);

}
