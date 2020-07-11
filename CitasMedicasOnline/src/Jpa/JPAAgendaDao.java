package Jpa;

import java.util.List;

import Dao.AgendaDao;
import modelo.Agenda;

public class JPAAgendaDao extends JPAGenericDao<Agenda, Integer>  implements AgendaDao {
	
	public JPAAgendaDao() {
		super(Agenda.class);
	}

	public List<Agenda> findbyUserId(String dato) {
		// TODO Auto-generated method stub
		return null;
	}

}
