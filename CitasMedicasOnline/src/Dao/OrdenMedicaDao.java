package Dao;

import java.util.List;
import modelo.OrdenMedica;

public interface OrdenMedicaDao extends GenericDao<OrdenMedica, Integer>{

	List<OrdenMedica> findbyUserId(String dato);

}
