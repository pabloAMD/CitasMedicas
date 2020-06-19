package modelo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class LibroDiarioEmpresa {
	
	private Date fecha;
	private double saldo;
	private List<PagoSuscripcion> pagSubscripcionesList;
	
	public LibroDiarioEmpresa() {

	}

	public LibroDiarioEmpresa(Date fecha, double saldo) {
		super();
		this.fecha = fecha;
		this.saldo = saldo;
		pagSubscripcionesList = new ArrayList<PagoSuscripcion>();
		
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public List<PagoSuscripcion> getPagSubscripcionesList() {
		return pagSubscripcionesList;
	}

	public void setPagSubscripcionesList(List<PagoSuscripcion> pagSubscripcionesList) {
		this.pagSubscripcionesList = pagSubscripcionesList;
	}
	
	
	public void guardarSuscripcion (PagoSuscripcion paso) {
		this.pagSubscripcionesList.add(paso);
	}
	
	//actualizar saldo ingresos
	public double saldoTotalIngresos(double saldo,double valFactura)
	
	{
		return saldo+valFactura;
	}
	//actualizar saldo egresos
	public double saldoTotalEgresos(double saldo,double pagos)
	
	{
		return saldo-pagos;
	}
	
	
	
	

}
