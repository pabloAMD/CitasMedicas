package modelo;

import java.util.ArrayList;
import java.util.List;

public class Suscripcion {
	private int id;
	private double saldo;
	private List<LibroDiario> libroDiarioList;
	
	
	public Suscripcion(int id, double saldo) {
		super();
		this.id = id;
		this.saldo = saldo;
		this.libroDiarioList = new ArrayList<LibroDiario>();
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


	public List<LibroDiario> getLibroDiarioList() {
		return libroDiarioList;
	}


	public void setLibroDiarioList(List<LibroDiario> libroDiarioList) {
		this.libroDiarioList = libroDiarioList;
	}
	
	
	
	
}
