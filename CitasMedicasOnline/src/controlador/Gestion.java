package controlador;

import java.util.List;

import modelo.HistoriaClinica;
import modelo.LibroDiario;
import modelo.LibroDiarioEmpresa;
import modelo.Medico;
import modelo.Paciente;
import modelo.Sueldo;
import modelo.Suscripcion;

public class Gestion {
	
	private HistoriaClinica historiaClinica;
	private Suscripcion suscripcion;
	private List<Paciente> pacienetslist;
	private List<Medico> medicosList;
	private LibroDiarioEmpresa libroDiarioEmpresa;
	private Sueldo asignarSueldo;
	
	
	public Gestion() {
		
	}
	
	
	
	public static int suma(int numero) {
		numero = numero * 2;
		return numero*2;
		
		
	}
	
	public static int resta(int numero) {
		numero = numero - 2;
		return numero*2;
		
		
	}
	
	public int calcular(int numero) {
		numero = numero +5;
		return numero;
	}
	
	
	

}
