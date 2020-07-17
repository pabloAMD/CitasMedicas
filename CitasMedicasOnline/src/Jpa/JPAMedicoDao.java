package Jpa;

import java.util.List;

import Dao.MedicoDao;
import modelo.Medico;
import modelo.OrdenMedica;





public class JPAMedicoDao extends JPAGenericDao<Medico, String>  implements MedicoDao {
	
	public JPAMedicoDao() {
		super(Medico.class);
	}

	

	public List<Medico> findbyUserId(String dato) {
		// TODO Auto-generated method stub
		return null;
	}

	

}
