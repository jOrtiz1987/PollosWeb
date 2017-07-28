package com.mx.pollos.DAO;

import java.util.List;

import com.mx.pollos.model.Empleado;

public interface EmpleadoDAO {

	public boolean insertarModificar(Empleado empleado);
	
	public boolean eliminar(Empleado empleado);
	
	public Empleado buscar(Integer id);
	
	public List<Empleado> buscar(String consulta);

	public List<Empleado> buscar(Empleado empleado);
	
}
