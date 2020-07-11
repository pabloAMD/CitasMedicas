package modelo;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

@Entity
public class CitaMedica implements Serializable{
	
	@Id
	private int id;
	
	@ManyToOne
	@JoinColumn
	private Paciente paciente;
	
	@OneToOne
	@JoinColumn
	private Factura factura;
	
	
	private Medico medico;
	
	
	private String motivo;
	private int turno;
	private Date fecha;
	private double precio;
	
	
	public static boolean crearCita (int id, Paciente paciente, String motivo, int turno,  double precio) {
		
		
		return true;
	}
	
	
	public Factura getFactura() {
		return factura;
	}


	public void setFactura(Factura factura) {
		this.factura = factura;
	}


	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Paciente getPaciente() {
		return paciente;
	}
	public void setPaciente(Paciente paciente) {
		this.paciente = paciente;
	}
	public String getMotivo() {
		return motivo;
	}
	public void setMotivo(String motivo) {
		this.motivo = motivo;
	}
	public int getTurno() {
		return turno;
	}
	public void setTurno(int turno) {
		this.turno = turno;
	}
	public Date getFecha() {
		return fecha;
	}
	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}



	public CitaMedica(int id, Paciente paciente, String motivo, int turno, Date fecha, double precio) {
		super();
		this.id = id;
		this.paciente = paciente;
		this.motivo = motivo;
		this.turno = turno;
		this.fecha = fecha;
		this.precio = precio;
	}


	/**
	 * 
	 */
	public CitaMedica() {
		super();
	}


	
	
	
	
	
}

