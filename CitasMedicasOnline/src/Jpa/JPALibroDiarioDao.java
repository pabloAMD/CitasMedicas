package Jpa;

import java.util.List;

import Dao.LibroDiarioDao;
import modelo.LibroDiario;



public class JPALibroDiarioDao extends JPAGenericDao<LibroDiario, Integer>  implements LibroDiarioDao {
	
	public JPALibroDiarioDao() {
		super(LibroDiario.class);
	}

	public List<LibroDiario> findbyUserId(String dato) {
		// TODO Auto-generated method stub
		return null;
	}

	

}
