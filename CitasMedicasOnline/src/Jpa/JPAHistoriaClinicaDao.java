package Jpa;

import java.util.List;

import Dao.HistoriaClinicaDao;
import modelo.HistoriaClinica;



public class JPAHistoriaClinicaDao extends JPAGenericDao<HistoriaClinica, Integer>  implements HistoriaClinicaDao {
	
	public JPAHistoriaClinicaDao() {
		super(HistoriaClinica.class);
	}

	public List<HistoriaClinica> findbyUserId(String dato) {
		// TODO Auto-generated method stub
		return null;
	}


}
