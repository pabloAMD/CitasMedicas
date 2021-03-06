package Dao;

import java.util.List;

import modelo.Paciente;


public interface GenericDao  <T,ID> {
	public void create(T entity);
	public T read(ID id);
	public void update(T entity);
	public void delete (T entity);
	public void deleteById(ID id);
	public List<T> find();
	public List<Paciente>  findbyPaciente(String cedula);
	public List<T>find(String []attributes,String[]values);
	public List<T>find(String []attributes,String[]values,String order,int index,int size);
	
}
