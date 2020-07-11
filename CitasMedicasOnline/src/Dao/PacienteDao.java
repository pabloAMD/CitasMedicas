package Dao;

import java.util.List;

import modelo.Paciente;


public interface PacienteDao extends GenericDao<Paciente, Integer>{

	List<Paciente> findbyUserId(String dato);

}
