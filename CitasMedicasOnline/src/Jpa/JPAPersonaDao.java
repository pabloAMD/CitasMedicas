package Jpa;

import java.util.List;

import Dao.PersonaDao;
import modelo.Persona;







public abstract class JPAPersonaDao extends JPAGenericDao<Persona, Integer>  implements PersonaDao {
	
	public JPAPersonaDao() {
		super(Persona.class);
	}

	

	
	

	

}
