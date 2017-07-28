package com.mx.pollos.DAO;

import java.util.List;

import com.mx.pollos.model.EmpleadoActividad;

public interface EmpleadoActividadDAO {

	public boolean insertarModificar(EmpleadoActividad empleadoActividad);
	
	public boolean eliminar(EmpleadoActividad empleadoActividad);
	
	public EmpleadoActividad buscar(Integer id);
	
	public List<EmpleadoActividad> buscarEmpleadoActividadValidos(String nombre);
	
	public List<EmpleadoActividad> buscar(String consulta);

	public List<EmpleadoActividad> buscar(EmpleadoActividad empleadoActividad);
	
}
