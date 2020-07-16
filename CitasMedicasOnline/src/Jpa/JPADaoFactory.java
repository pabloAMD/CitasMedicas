package Jpa;

import Dao.AgendaDao;
import Dao.DaoFactory;
import Dao.PacienteDao;

public class JPADaoFactory extends DaoFactory {

	@Override
	public AgendaDao getAgendaDao() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public PacienteDao getPacienteDao() {
		// TODO Auto-generated method stub
		return new JPAPacienteDao();
	}

	

}
