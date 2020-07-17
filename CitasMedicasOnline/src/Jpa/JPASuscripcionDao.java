package Jpa;

import java.util.List;

import Dao.SuscripcionDao;
import modelo.Suscripcion;



public class JPASuscripcionDao extends JPAGenericDao<Suscripcion, String>  implements SuscripcionDao {
	
	public JPASuscripcionDao() {
		super(Suscripcion.class);
	}

	public List<Suscripcion> findbyUserId(String dato) {
		// TODO Auto-generated method stub
		return null;
	}

}
