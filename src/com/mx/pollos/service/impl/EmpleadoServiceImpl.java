package com.mx.pollos.service.impl;

import java.util.Date;
import java.util.List;

import com.mx.pollos.DAO.ActividadDAO;
import com.mx.pollos.DAO.EmpleadoActividadDAO;
import com.mx.pollos.DAO.EmpleadoDAO;
import com.mx.pollos.model.Actividad;
import com.mx.pollos.model.Empleado;
import com.mx.pollos.model.EmpleadoActividad;
import com.mx.pollos.model.Semana;
import com.mx.pollos.service.EmpleadoService;
import com.mx.pollos.service.SemanaService;

public class EmpleadoServiceImpl implements EmpleadoService {

	private ActividadDAO actividadDAO;
	private EmpleadoDAO empleadoDAO;
	private EmpleadoActividadDAO empleadoActividadDAO;
	private SemanaService semanaService;


	@Override
	public Empleado buscarId(Integer id) {
		return empleadoDAO.buscar(id);
	}

	@Override
	public Actividad buscarActividadOrInsert(Actividad actividad) {
		if(actividadDAO.buscar(actividad) == null){
			actividadDAO.insertarModificar(actividad);
			return actividadDAO.buscar(actividad).get(0);
		}else{
			return actividadDAO.buscar(actividad).get(0);
		}
	}
	
	@Override
	public Boolean altaActividad(Actividad actividad) {
		return actividadDAO.insertarModificar(actividad);
	}

	@Override
	public Boolean altaEmpleado(Empleado empleado) {
		return empleadoDAO.insertarModificar(empleado);
	}

	@Override
	public Actividad buscarActividadId(Integer id) {
		return actividadDAO.buscar(id);
	}

	@Override
	public Empleado buscarEmpleadoOrInsert(String nombre) {
		Empleado empleado = new Empleado();
		empleado.setNombre(nombre);
		if (empleadoDAO.buscar(empleado).get(0) == null){
			empleadoDAO.insertarModificar(empleado);
			return empleadoDAO.buscar(empleado).get(0);
		}else{
			return empleadoDAO.buscar(empleado).get(0);
		}
	}

	@Override
	public Boolean asignarActividadEmpleado(Actividad actividad,
			Empleado empleado, Date fecha) {
		EmpleadoActividad empleadoActividad = new EmpleadoActividad();
		empleadoActividad.setActividad(actividad);
		empleadoActividad.setEmpleado(empleado);
		Semana semana = semanaService.obtenerSemana(fecha);
		empleadoActividad.setSemana(semana);
		return empleadoActividadDAO.insertarModificar(empleadoActividad);
	}

	@Override
	public Boolean bajaActividad(Actividad actividad) {
		actividad.setValides(false);
		return actividadDAO.insertarModificar(actividad);
	}

	@Override
	public Boolean desasignarActividadEmpleado(Actividad actividad,
			Empleado empleado, Date fecha) {
		EmpleadoActividad empleadoActividad = new EmpleadoActividad();
		empleadoActividad.setActividad(actividad);
		empleadoActividad.setEmpleado(empleado);
		Semana semana = semanaService.obtenerSemana(fecha);
		empleadoActividad.setSemana(semana);
		EmpleadoActividad empleadoActividadEliminar = empleadoActividadDAO.buscar(empleadoActividad).get(0);
		return empleadoActividadDAO.eliminar(empleadoActividadEliminar);
	}

	public void setActividadDAO(ActividadDAO actividadDAO) {
		this.actividadDAO = actividadDAO;
	}

	public void setEmpleadoDAO(EmpleadoDAO empleadoDAO) {
		this.empleadoDAO = empleadoDAO;
	}

	public void setEmpleadoActividadDAO(EmpleadoActividadDAO empleadoActividadDAO) {
		this.empleadoActividadDAO = empleadoActividadDAO;
	}

	public void setSemanaService(SemanaService semanaService) {
		this.semanaService = semanaService;
	}

	@Override
	public List<Actividad> buscarActividad(Actividad actividad) {
		return actividadDAO.buscar(actividad);
	}
	
	@Override
	public List<Empleado> buscarEmpleado(Empleado empleado) {
		return empleadoDAO.buscar(empleado);
	}

	@Override
	public Boolean bajaEmpleado(Empleado empleado) {
		return empleadoDAO.eliminar(empleado);
	}

	@Override
	public List<Semana> buscarSemana(Semana semana) {
		return semanaService.buscarSemana(semana);
	}
	
}
