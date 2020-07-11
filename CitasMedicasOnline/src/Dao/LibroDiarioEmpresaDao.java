package Dao;

import java.util.List;

import modelo.LibroDiarioEmpresa;


public interface LibroDiarioEmpresaDao extends GenericDao<LibroDiarioEmpresa, Integer>{

	List<LibroDiarioEmpresa> findbyUserId(String dato);

}
