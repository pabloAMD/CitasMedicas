package Jpa;

import java.util.List;

import Dao.FacturaDao;
import modelo.Factura;


public class JPAFacturaDao extends JPAGenericDao<Factura, Integer>  implements FacturaDao {
	
	public JPAFacturaDao() {
		super(Factura.class);
	}

	public List<Factura> findbyUserId(String dato) {
		// TODO Auto-generated method stub
		return null;
	}

	

}
