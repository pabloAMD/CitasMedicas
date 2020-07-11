package Dao;

import java.util.List;
import modelo.Sueldo;

public interface SueldoDao extends GenericDao<Sueldo, Integer>{

	List<Sueldo> findbyUserId(String dato);

}
