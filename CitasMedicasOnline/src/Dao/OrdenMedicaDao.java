package Dao;

import java.util.List;
import modelo.OrdenMedica;

public interface OrdenMedicaDao extends GenericDao<OrdenMedica, String>{

	List<OrdenMedica> findbyUserId(String dato);

}
