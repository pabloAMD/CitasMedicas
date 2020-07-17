package Dao;

import java.util.List;
import modelo.Secretaria;

public interface SecretariaDao extends GenericDao<Secretaria, String>{

	List<Secretaria> findbyUserId(String dato);

}
