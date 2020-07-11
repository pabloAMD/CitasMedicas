package Jpa;

import java.util.List;

import Dao.CitaMedicaDao;
import modelo.CitaMedica;



public class JPACitaMedicaDao extends JPAGenericDao<CitaMedica, Integer>  implements CitaMedicaDao {
	
	public JPACitaMedicaDao() {
		super(CitaMedica.class);
	}

	public List<CitaMedica> findbyUserId(String dato) {
		// TODO Auto-generated method stub
		return null;
	}


}
