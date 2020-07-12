package modelo;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Suscripcion implements Serializable{
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private double saldo;
	
	@OneToOne
	@JoinColumn
	private Paciente pacient;
	
	
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "suscripcion")
	private List<LibroDiario> libroDiarioList;
	
	
	
	public Suscripcion() {
		
	}



	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}



	public double getSaldo() {
		return saldo;
	}



	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}



	public Paciente getPacient() {
		return pacient;
	}



	public void setPacient(Paciente pacient) {
		this.pacient = pacient;
	}



	public List<LibroDiario> getLibroDiarioList() {
		return libroDiarioList;
	}



	public void setLibroDiarioList(List<LibroDiario> libroDiarioList) {
		this.libroDiarioList = libroDiarioList;
	}



	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		return result;
	}



	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Suscripcion other = (Suscripcion) obj;
		if (id != other.id)
			return false;
		return true;
	}

	

	
	
}
