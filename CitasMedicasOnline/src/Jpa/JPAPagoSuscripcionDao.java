package Jpa;

import java.util.List;

import Dao.PagoSuscripcionDao;
import modelo.PagoSuscripcion;





public class JPAPagoSuscripcionDao extends JPAGenericDao<PagoSuscripcion, Integer>  implements PagoSuscripcionDao {
	
	public JPAPagoSuscripcionDao() {
		super(PagoSuscripcion.class);
	}

	public List<PagoSuscripcion> findbyUserId(String dato) {
		// TODO Auto-generated method stub
		return null;
	}

}
