package Dao;

import java.util.List;

import modelo.Paciente;


public interface PacienteDao extends GenericDao<Paciente, String>{

	List<Paciente> findbyUserId(String dato);
	public abstract Paciente buscarPorId(String id);

}
