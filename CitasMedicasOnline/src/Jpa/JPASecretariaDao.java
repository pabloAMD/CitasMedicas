package Jpa;

import java.util.List;

import Dao.SecretariaDao;
import modelo.Secretaria;




public class JPASecretariaDao extends JPAGenericDao<Secretaria, String>  implements SecretariaDao {
	
	public JPASecretariaDao() {
		super(Secretaria.class);
	}

	public List<Secretaria> findbyUserId(String dato) {
		// TODO Auto-generated method stub
		return null;
	}

	

	
	

	

}
