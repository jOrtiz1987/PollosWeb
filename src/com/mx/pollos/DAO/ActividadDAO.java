package com.mx.pollos.DAO;

import java.util.List;
import com.mx.pollos.model.Actividad;

public interface ActividadDAO {

	public boolean insertarModificar(Actividad actividad);
	
	public boolean eliminar(Actividad actividad);
	
	public Actividad buscar(Integer id);
	
	public List<Actividad> buscar(Actividad actividad);
	
	public List<Actividad> buscar(String consulta);
	
}
