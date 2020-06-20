package modelo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class LibroDiarioEmpresa {
	
	private Date fecha;
	private double saldo;
	private List<PagoSuscripcion> pagSubscripcionesList;
	


	
	public static boolean guardarSuscripcionPagos(int id, Factura facturas) {
		PagoSuscripcion ps=new PagoSuscripcion();
		Paciente p=new Paciente();
		CitaMedica cm=new CitaMedica();
		Factura f=new Factura();
		Suscripcion s=new Suscripcion();
		
		s.setId(s.getId());
		s.setSaldo(s.getSaldo());
		
		ps.setId(id);
		f.setCodigo(f.getCodigo());
		f.setCitaMedica(cm);
		f.setTotal(f.getTotal());
		
		p.setId_Paciente(p.getId_Paciente());
		p.setNombre(p.getNombre());
		p.setApellido(p.getApellido());
		p.setDireccion(p.getDireccion());
		p.setTelefono(p.getTelefono());
		p.setCedula(p.getCedula());
		p.setEmail(p.getEmail());
		p.setSuscripcion(p.getSuscripcion());
		
		cm.setId(cm.getId());
		cm.setPaciente(cm.getPaciente());
		cm.setMotivo(cm.getMotivo());
		cm.setTurno(cm.getTurno());
		cm.setFecha(cm.getFecha());
		cm.setPrecio(cm.getPrecio());
		
	
		System.out.println("Pago Suscripcion Creado");
		
		return true;
	}
	
	

}
