package Jpa;

import java.util.List;

import Dao.PacienteDao;
import modelo.Paciente;





public  class JPAPacienteDao extends JPAGenericDao<Paciente, Integer>  implements PacienteDao {
	
	public JPAPacienteDao() {
		super(Paciente.class);
	}

	public List<Paciente> findbyUserId(String dato) {
		// TODO Auto-generated method stub
		return null;
	}

	

	
	

	

}
