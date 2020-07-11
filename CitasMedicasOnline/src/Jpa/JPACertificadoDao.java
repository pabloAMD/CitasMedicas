package Jpa;

import java.util.List;

import Dao.CertificadoDao;
import modelo.Certificado;


public class JPACertificadoDao extends JPAGenericDao<Certificado, Integer>  implements CertificadoDao {
	
	public JPACertificadoDao() {
		super(Certificado.class);
	}

	public List<Certificado> findbyUserId(String dato) {
		// TODO Auto-generated method stub
		return null;
	}

	

}
