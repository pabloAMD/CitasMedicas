package modelo;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Suscripcion implements Serializable{
	
	@Id
	private int id;
	private double saldo;
	
	@OneToOne(cascade = CascadeType.ALL, mappedBy = "suscripcion")
	private Paciente paciente;
	private List<LibroDiario> libroDiarioList;
	
	
	
	public Suscripcion() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Suscripcion(int id, double saldo) {
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

	public static double agregarSaldo(double valor) {
		double saldoActual=130.50;
		System.out.println(saldoActual+valor);
		return saldoActual+valor;			
	}
	
	public static double actualizarSaldo(double gasto){
		double saldoActual=181.00;
		return saldoActual-gasto;	
	}
	
	public static boolean agregarLibroDiario(Date fecha, Factura factura) {
		SimpleDateFormat objSDF = new SimpleDateFormat("dd-MM-yyyy");
		System.out.println(objSDF.format(fecha));
		List<LibroDiario> libroDiarioL = new ArrayList<LibroDiario>();
		LibroDiario lDiario= new LibroDiario(fecha, factura);
		libroDiarioL.add(lDiario);
		return true;
	}
	
	
	
	
	
}
