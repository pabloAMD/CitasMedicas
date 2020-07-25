package Jpa;

import java.util.List;

import Dao.PacienteDao;
import modelo.Paciente;





public  class JPAPacienteDao extends JPAGenericDao<Paciente, String>  implements PacienteDao {
	
	public JPAPacienteDao() {
		super(Paciente.class);
	}

	public List<Paciente> findbyUserId(String dato) {
		// TODO Auto-generated method stub
		return null;
	}

	public Paciente buscarPorId(String id) {
		Paciente paciente = null;   
        String jpql = "SELECT u FROM Paciente u WHERE u.id_Paciente = " + id ;
        paciente =  (Paciente) em.createQuery(jpql).getSingleResult();
        em.createQuery(jpql).getSingleResult();
    return paciente;

	}

	

	
	

	

}
