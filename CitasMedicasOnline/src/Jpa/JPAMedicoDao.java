package Jpa;

import java.util.List;

import Dao.OrdenMedicaDao;
import modelo.OrdenMedica;





public class JPAMedicoDao extends JPAGenericDao<OrdenMedica, Integer>  implements OrdenMedicaDao {
	
	public JPAMedicoDao() {
		super(OrdenMedica.class);
	}

	public List<OrdenMedica> findbyUserId(String dato) {
		// TODO Auto-generated method stub
		return null;
	}

}
