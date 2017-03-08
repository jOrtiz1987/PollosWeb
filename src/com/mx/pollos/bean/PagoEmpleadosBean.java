package com.mx.pollos.bean;
import java.io.Serializable;
import java.util.List;

import javax.faces.context.FacesContext;

import com.mx.pollos.model.Actividad;
import com.mx.pollos.model.Empleado;
import com.mx.pollos.model.EmpleadoActividad;
import com.mx.pollos.model.PagoEmpleados;
import com.mx.pollos.model.Semana;
import com.mx.pollos.service.EmpleadoService;

/**
 * @author Jorge Ortiz
 * @version 1.0
 * @created 27-ene-2017 12:33:45 p.m.
 */
public class PagoEmpleadosBean implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Empleado empleado;
	private List<Empleado> empleados;
	private Semana semana;
	private List<Semana> semanas;
	private List<Actividad> actividades;
	private EmpleadoActividad empleadoActividad;
	private EmpleadoService empleadoService;
	private List<PagoEmpleados> pagos;
	
	
	
	public List<Empleado> getEmpleados() {
		return empleados;
	}

	public void setEmpleados(List<Empleado> empleados) {
		this.empleados = empleados;
	}

	public List<Semana> getSemanas() {
		return semanas;
	}

	public void setSemanas(List<Semana> semanas) {
		this.semanas = semanas;
	}

	public List<Actividad> getActividades() {
		return actividades;
	}

	public void setActividades(List<Actividad> actividades) {
		this.actividades = actividades;
	}

	public EmpleadoActividad getEmpleadoActividad() {
		return empleadoActividad;
	}

	public void setEmpleadoActividad(EmpleadoActividad empleadoActividad) {
		this.empleadoActividad = empleadoActividad;
	}

	public Empleado getEmpleado() {
		return empleado;
	}

	public void setEmpleado(Empleado empleado) {
		this.empleado = empleado;
	}

	public Semana getSemana() {
		return semana;
	}

	public void setSemana(Semana semana) {
		this.semana = semana;
	}

	public List<PagoEmpleados> getPagos() {
		return pagos;
	}

	public void setPagos(List<PagoEmpleados> pagos) {
		this.pagos = pagos;
	}

	public void setEmpleadoService(EmpleadoService empleadoService) {
		this.empleadoService = empleadoService;
	}

	public PagoEmpleadosBean(){
		empleado = new Empleado();
		semana = new Semana();
		empleadoActividad = new EmpleadoActividad();
	}

	public void finalize() throws Throwable {

	}

	public String agregar(){
		try{
			
		}
		catch(Exception exception){
			exception.printStackTrace();
		}
		return llenarTabla();
	}

	public String buscar(){
		try{
			
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
		//actividad = empleadoService.buscarActividadId(Integer.parseInt(fc.getExternalContext().getRequestParameterMap().get("idActividadM")));
		return inicioAgregar();
	}
	

	public String llenarTabla(){
		try{
			empleado = new Empleado();
			semana = new Semana();
			empleadoActividad = new EmpleadoActividad();
			//pagos = new 
		}
		catch(Exception exception){
			exception.printStackTrace();
		}
		return "pagoempleados";
	}
	
	public String borrar(){
		FacesContext fc = FacesContext.getCurrentInstance();
		//empleadoService.bajaActividad(empleadoService.buscarActividadId(Integer.parseInt(fc.getExternalContext().getRequestParameterMap().get("idActividad"))));
		return llenarTabla();
	}
	
	public String inicioAgregar(){
		actividades = empleadoService.buscarActividad(new Actividad());
		empleados = empleadoService.buscarEmpleado(new Empleado());
		semanas = empleadoService.buscarSemana(new Semana());
		return "agregar";
	}

}