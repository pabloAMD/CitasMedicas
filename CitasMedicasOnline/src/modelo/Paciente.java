package modelo;

public class Paciente extends Persona {
	
	private int id_Paciente;
	private Suscripcion suscripcion;
	
	
	
	
	public Paciente(int id_Paciente, Suscripcion suscripcion) {
		super();
		this.id_Paciente = id_Paciente;
		this.suscripcion = suscripcion;
	}
	@Override
	public void validarCedula() {
		
		if (this.getCedula().length()<10) {
			System.out.println("cedula Correcta");
		}else {
			System.out.println("cedula Incorrecta");
		}
			
	}
	@Override
	public void validarCorreo() {
		// TODO Auto-generated method stub
		
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
	
	
	

}
