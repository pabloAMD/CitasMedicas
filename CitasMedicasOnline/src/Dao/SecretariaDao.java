package Dao;

import java.util.List;
import modelo.Secretaria;

public interface SecretariaDao extends GenericDao<Secretaria, Integer>{

	List<Secretaria> findbyUserId(String dato);

}
