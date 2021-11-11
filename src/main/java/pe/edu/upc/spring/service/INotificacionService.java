package pe.edu.upc.spring.service;

import java.util.List;
import java.util.Optional;

import pe.edu.upc.spring.model.Notificación;

public interface INotificacionService {
	
	public boolean grabar(Notificación notificacion);
	public void eliminar(int CNotificacion);
	public Optional<Notificación> listarId(int CNotificacion);
	public Optional<Notificación> buscarId(int CNotificacion);
	public List<Notificación> listar();
	

}

