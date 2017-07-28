package com.mx.pollos.service;

import java.util.Date;
import java.util.List;

import com.mx.pollos.model.Actividad;
import com.mx.pollos.model.Empleado;
import com.mx.pollos.model.EmpleadoActividad;
import com.mx.pollos.model.Semana;

public interface EmpleadoService {
	
	public Empleado buscarId(Integer id);
	
	public Actividad buscarActividadId(Integer id);
	
	public Semana buscarSemanaId(Integer id);
	
	public List<Actividad> buscarActividad(Actividad actividad);
	
	public List<EmpleadoActividad> buscarEmpleadoActividad(EmpleadoActividad empleadoActividad);
	
	public Actividad buscarActividadOrInsert(Actividad actividad);
	
	public Empleado buscarEmpleadoOrInsert(String nombre);
	
	public List<Empleado> buscarEmpleado(Empleado empleado);
	
	public List<Semana> buscarSemana(Semana semana);

	public Boolean altaActividad(Actividad actividad);
	
	public Boolean bajaActividad(Actividad actividad);
	
	public Boolean altaEmpleado(Empleado empleado);
	
	public Boolean bajaEmpleado(Empleado empleado);
	
	public Boolean asignarActividadEmpleado(Actividad actividad, Empleado empleado, Date fecha);
	
	public Boolean asignarActividadEmpleado(Actividad actividad, Empleado empleado, Semana semana);
	
	public Boolean desasignarActividadEmpleado(Actividad actividad, Empleado empleado, Date fecha);
	
	public Boolean desasignarActividadEmpleado(Actividad actividad, Empleado empleado, Semana semana);
}
