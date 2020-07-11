package Dao;

import java.util.List;

import modelo.Certificado;



public interface CertificadoDao extends GenericDao<Certificado, Integer>{

	List<Certificado> findbyUserId(String dato);

}
