package Jpa;

import java.util.List;

import Dao.ConsultaDao;
import modelo.Consulta;



public class JPAConsultaDao extends JPAGenericDao<Consulta, Integer>  implements ConsultaDao {
	
	public JPAConsultaDao() {
		super(Consulta.class);
	}

	public List<Consulta> findbyUserId(String dato) {
		// TODO Auto-generated method stub
		return null;
	}

	
}
