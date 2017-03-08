package com.mx.pollos.service;

import java.util.Date;
import java.util.List;

import com.mx.pollos.model.Actividad;
import com.mx.pollos.model.Empleado;
import com.mx.pollos.model.Semana;

public interface EmpleadoService {
	
	public Empleado buscarId(Integer id);
	
	public Actividad buscarActividadId(Integer id);
	
	public List<Actividad> buscarActividad(Actividad actividad);
	
	public Actividad buscarActividadOrInsert(Actividad actividad);
	
	public Empleado buscarEmpleadoOrInsert(String nombre);
	
	public List<Empleado> buscarEmpleado(Empleado empleado);
	
	public List<Semana> buscarSemana(Semana semana);

	public Boolean altaActividad(Actividad actividad);
	
	public Boolean bajaActividad(Actividad actividad);
	
	public Boolean altaEmpleado(Empleado empleado);
	
	public Boolean bajaEmpleado(Empleado empleado);
	
	public Boolean asignarActividadEmpleado(Actividad actividad, Empleado empleado, Date fecha);
	
	public Boolean desasignarActividadEmpleado(Actividad actividad, Empleado empleado, Date fecha);
}
