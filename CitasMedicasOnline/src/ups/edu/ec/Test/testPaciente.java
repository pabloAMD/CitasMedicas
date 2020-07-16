package ups.edu.ec.Test;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;

import modelo.Paciente;

public class testPaciente {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EntityManager em = Persistence.createEntityManagerFactory("Citasmedicas").createEntityManager();
		
		Paciente p = new Paciente("Marcelo","Durazno","Presidente Cordova","4031738","0105296312","marcelo_1993@hotmail.es");

		em.getTransaction().begin();
		em.persist(p);
		em.persist(new Paciente("Henry","Guaman","San Cristoba","4031738","0105296312","marcelo_1993@hotmail.es"));
		em.getTransaction().commit();
	}

}
