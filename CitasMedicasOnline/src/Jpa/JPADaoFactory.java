package Jpa;

import Dao.AgendaDao;
import Dao.DaoFactory;
import Dao.MedicoDao;
import Dao.PacienteDao;

import Dao.SuscripcionDao;

import Dao.SecretariaDao;

public class JPADaoFactory extends DaoFactory {

	@Override
	public AgendaDao getAgendaDao() {
		// TODO Auto-generated method stub
		return new JPAAgendaDao();
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
	@Override
	public SecretariaDao getSecretariaDao() {
		// TODO Auto-generated method stub
		return new JPASecretariaDao();
	}

	@Override
	public MedicoDao getMedicoDao() {
		// TODO Auto-generated method stub
		return new JPAMedicoDao();

	}

	

}
