package Jpa;

import Dao.AgendaDao;
import Dao.DaoFactory;
import Dao.MedicoDao;
import Dao.PacienteDao;

<<<<<<< HEAD
import Dao.SecretariaDao;

=======
>>>>>>> branch 'master' of https://github.com/pabloAMD/CitasMedicas.git
import Dao.SuscripcionDao;

<<<<<<< HEAD
=======
import Dao.SecretariaDao;
>>>>>>> branch 'master' of https://github.com/pabloAMD/CitasMedicas.git

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

<<<<<<< HEAD
=======
	public SuscripcionDao getSuscripcionDao() {
		// TODO Auto-generated method stub
		return new JPASuscripcionDao();
	}	
	@Override
>>>>>>> branch 'master' of https://github.com/pabloAMD/CitasMedicas.git
	public SecretariaDao getSecretariaDao() {
		// TODO Auto-generated method stub
		return new JPASecretariaDao();
	}

	@Override
	public MedicoDao getMedicoDao() {
		// TODO Auto-generated method stub
		return new JPAMedicoDao();
<<<<<<< HEAD
		
	@Override	
	public SuscripcionDao getSuscripcionDao() {
		// TODO Auto-generated method stub
		return new JPASuscripcionDao();
=======

>>>>>>> branch 'master' of https://github.com/pabloAMD/CitasMedicas.git
	}

	

}
