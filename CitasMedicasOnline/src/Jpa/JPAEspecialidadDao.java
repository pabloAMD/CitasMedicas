package Jpa;

import java.util.List;

import Dao.EspecialidadDao;
import modelo.Especialidad;



public class JPAEspecialidadDao extends JPAGenericDao<Especialidad, Integer>  implements EspecialidadDao {
	
	public JPAEspecialidadDao() {
		super(Especialidad.class);
	}

	public List<Especialidad> findbyUserId(String dato) {
		// TODO Auto-generated method stub
		return null;
	}

	

}
