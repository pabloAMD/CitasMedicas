package Jpa;

import java.util.List;

import Dao.SueldoDao;
import modelo.Sueldo;



public class JPASueldoDao extends JPAGenericDao<Sueldo, Integer>  implements SueldoDao {
	
	public JPASueldoDao() {
		super(Sueldo.class);
	}

	public List<Sueldo> findbyUserId(String dato) {
		// TODO Auto-generated method stub
		return null;
	}

}
