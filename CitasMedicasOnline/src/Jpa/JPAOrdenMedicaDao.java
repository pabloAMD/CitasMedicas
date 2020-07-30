package Jpa;

import java.util.List;


import Dao.OrdenMedicaDao;

import modelo.OrdenMedica;

public class JPAOrdenMedicaDao extends JPAGenericDao<OrdenMedica, String>  implements OrdenMedicaDao {
	
	public JPAOrdenMedicaDao() {
		super(OrdenMedica.class);
	}

	public List<OrdenMedica> findbyUserId(String dato) {
		// TODO Auto-generated method stub
		return null;
	}

	


}
