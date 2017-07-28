package com.mx.pollos.bean;
import java.io.Serializable;
import java.util.List;

import javax.faces.context.FacesContext;

import com.mx.pollos.model.Actividad;
import com.mx.pollos.service.EmpleadoService;

/**
 * @author Jorge Ortiz
 * @version 1.0
 * @created 27-ene-2017 12:33:45 p.m.
 */
public class ActividadBean implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Actividad actividad;
	private EmpleadoService empleadoService;
	private List<Actividad> actividades;
	

	public List<Actividad> getActividades() {
		llenarTabla();
		return actividades;
	}

	public void setActividades(List<Actividad> actividades) {
		this.actividades = actividades;
	}

	public Actividad getActividad() {
		System.out.println("Voy a regresar la actividad " + actividad);
		//System.out.println(actividad.getIdActividad());
		return actividad;
	}

	public void setActividad(Actividad actividad) {
		System.out.println("Voy a asignar la actividad " + actividad);
		this.actividad = actividad;
	}

	public void setEmpleadoService(EmpleadoService empleadoService) {
		this.empleadoService = empleadoService;
	}

	public ActividadBean(){
		actividad = new Actividad();
		System.out.println("En el contructor la actividad es " + actividad);
	}

	public void finalize() throws Throwable {

	}

	public String agregar(){
		try{
			actividad.setValides(true);
			empleadoService.altaActividad(actividad);
		}
		catch(Exception exception){
			exception.printStackTrace();
		}
		return llenarTabla();
	}

	public String buscar(){
		try{
			System.out.println(actividad.getIdActividad());
			actividades = empleadoService.buscarActividad(actividad);
		}
		catch(Exception exception){
			exception.printStackTrace();
		}
		return "";
	}

	public String imprimir(){
		return "";
	}
	
	public String modificar(){
		FacesContext fc = FacesContext.getCurrentInstance();
		actividad = empleadoService.buscarActividadId(Integer.parseInt(fc.getExternalContext().getRequestParameterMap().get("idActividadM")));
		return inicioAgregar();
	}
	

	public String llenarTabla(){
		try{
			actividad = new Actividad();
			actividades = empleadoService.buscarActividad(actividad);
		}
		catch(Exception exception){
			exception.printStackTrace();
		}
		return "actividades";
	}
	
	public String borrar(){
		FacesContext fc = FacesContext.getCurrentInstance();
		empleadoService.bajaActividad(empleadoService.buscarActividadId(Integer.parseInt(fc.getExternalContext().getRequestParameterMap().get("idActividad"))));
		return llenarTabla();
	}
	
	public String inicioAgregar(){
		return "agregar";
	}

}