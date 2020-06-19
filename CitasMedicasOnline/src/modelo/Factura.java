package modelo;

public class Factura {
	
	private int codigo;
	private CitaMedica citaMedica;
	private double total;
	

	
	

	public Factura() {

		super();
		// TODO Auto-generated constructor stub
	}
	public Factura(int codigo, CitaMedica citaMedica, double total) {
		
		this.codigo = codigo;
		this.citaMedica = citaMedica;
		this.total = total;
	}
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public CitaMedica getCitaMedica() {
		return citaMedica;
	}
	public void setCitaMedica(CitaMedica citaMedica) {
		this.citaMedica = citaMedica;
	}
	public double getTotal() {
		return total;
	}
	public void setTotal(double total) {
		this.total = total;
	}
	
	// calcular total factura
	
	public static double TotalFact(double costoConsulta, int iva, double descuento) {
		double ivas=(costoConsulta*iva)/100;
		double des=(costoConsulta*descuento)/100;
		return ((costoConsulta+ivas)-des);
		
	}
	
	
	
	
	
}
