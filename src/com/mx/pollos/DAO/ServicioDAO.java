package com.mx.pollos.DAO;

import java.util.List;

import com.mx.pollos.model.Servicio;

public interface ServicioDAO {

	public boolean insertarModificar(Servicio servicio);
	
	public boolean eliminar(Servicio servicio);
	
	public Servicio buscar(Integer id);
	
	public List<Servicio> buscar(String consulta);

	public List<Servicio> buscar(Servicio servicio);
	
}
