package Jpa;

import java.util.List;

import Dao.LibroDiarioEmpresaDao;
import modelo.LibroDiarioEmpresa;





public class JPALibroDiarioEmpresaDao extends JPAGenericDao<LibroDiarioEmpresa, Integer>  implements LibroDiarioEmpresaDao {
	
	public JPALibroDiarioEmpresaDao() {
		super(LibroDiarioEmpresa.class);
	}

	public List<LibroDiarioEmpresa> findbyUserId(String dato) {
		// TODO Auto-generated method stub
		return null;
	}

	

}
