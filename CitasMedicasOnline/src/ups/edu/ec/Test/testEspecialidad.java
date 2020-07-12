package ups.edu.ec.Test;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;

import modelo.Especialidad;

public class testEspecialidad {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EntityManager em = Persistence.createEntityManagerFactory("Citasmedicas").createEntityManager();
		
		Especialidad esp = new Especialidad("Odontologo");
		
		em.getTransaction().begin();
		em.persist(esp);
		em.persist(new Especialidad("Pediatra"));
		em.getTransaction().commit();
	}

}
