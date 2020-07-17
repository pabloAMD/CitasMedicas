package Jpa;

import Dao.AgendaDao;
import Dao.DaoFactory;
import Dao.PacienteDao;
import Dao.SuscripcionDao;

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

	@Override
	public SuscripcionDao getSuscripcionDao() {
		// TODO Auto-generated method stub
		return new JPASuscripcionDao();
	}

	

}
