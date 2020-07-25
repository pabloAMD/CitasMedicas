package Jpa;

import java.util.List;

import Dao.MedicoDao;
import modelo.Medico;
import modelo.OrdenMedica;
import modelo.Paciente;





public class JPAMedicoDao extends JPAGenericDao<Medico, String>  implements MedicoDao {
	
	public JPAMedicoDao() {
		super(Medico.class);
	}

	

	public List<Medico> findbyUserId(String dato) {
		// TODO Auto-generated method stub
		return null;
	}



	public List<Medico> buscarMedicos() {
		Medico medico = null;   
        String jpql = "SELECT u FROM Medico u " ;
        List<Medico> medicos =   em.createQuery(jpql).getResultList();
        
    return medicos;
	}



	public Medico buscarMedico(String id) {
		Medico medico = null;  
        String jpql = "SELECT m FROM Medico m WHERE m.id_medico = " + id ;
        medico =  (Medico) em.createQuery(jpql).getSingleResult();
        em.createQuery(jpql).getSingleResult();
    return medico;
	}

	

}
