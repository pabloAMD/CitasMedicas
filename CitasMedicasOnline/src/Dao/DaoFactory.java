package Dao;

import Jpa.JPADaoFactory;

public abstract class DaoFactory {
	protected static DaoFactory factory= new JPADaoFactory();
	
	public static DaoFactory getFactory() {
		return factory;
	}
	
	public abstract AgendaDao getAgendaDao();

	public abstract PacienteDao getPacienteDao();
	
	public abstract SuscripcionDao getSuscripcionDao();
	
}
