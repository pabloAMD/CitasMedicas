package modelo;

public class Paciente extends Persona {
	
	private int id_Paciente;
	public Suscripcion suscripcion;
	

	public Paciente() {
		super();
	}
	
	


	

	public int getId_Paciente() {
		return id_Paciente;
	}
	public void setId_Paciente(int id_Paciente) {
		this.id_Paciente = id_Paciente;
	}
	public Suscripcion getSuscripcion() {
		return suscripcion;
	}
	public void setSuscripcion(Suscripcion suscripcion) {
		this.suscripcion = suscripcion;
	}
	
	public static boolean actualizar(Paciente p) {
			p.setDireccion("Juan Pablo ||");
			return true;
	
	}
	/**
	 * @param nombre
	 * @param apellido
	 * @param direccion
	 * @param telefono
	 * @param cedula
	 * @param email
	 */
	public Paciente(int id_Paciente,String nombre, String apellido, String direccion, String telefono, String cedula, String email,Suscripcion suscripcion) {
		super(nombre, apellido, direccion, telefono, cedula, email);
		// TODO Auto-generated constructor stub
		this.id_Paciente = id_Paciente;
		this.suscripcion = suscripcion;
	}

	
	
}
