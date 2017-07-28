package com.mx.pollos.bean;
import java.io.Serializable;
import java.util.List;

import javax.faces.context.FacesContext;

import com.mx.pollos.model.Empleado;
import com.mx.pollos.service.EmpleadoService;

/**
 * @author Jorge Ortiz
 * @version 1.0
 * @created 27-ene-2017 12:33:45 p.m.
 */
public class EmpleadoBean implements Serializable{

	private static final long serialVersionUID = 1L;
	private Empleado empleado = new Empleado();
	private EmpleadoService empleadoService;
	private List<Empleado> empleados;

	public List<Empleado> getEmpleados() {
		llenarTabla();
		return empleados;
	}

	public void setEmpleados(List<Empleado> empleados) {
		this.empleados = empleados;
	}

	public Empleado getEmpleado() {
		return empleado;
	}

	public void setEmpleado(Empleado empleado) {
		this.empleado = empleado;
	}

	public void setEmpleadoService(EmpleadoService empleadoService) {
		this.empleadoService = empleadoService;
	}

	public EmpleadoBean(){
		empleado = new Empleado();
	}

	public void finalize() throws Throwable {

	}

	public String agregar(){
		try{
			empleadoService.altaEmpleado(empleado);
		}
		catch(Exception exception){
			exception.printStackTrace();
		}
		return llenarTabla();
	}

	public String buscar(){
		try{
			System.out.println(empleado.getIdEmpleado());
			empleados = empleadoService.buscarEmpleado(empleado);
		}
		catch(Exception exception){
			exception.printStackTrace();
		}
		return "";
	}

	public String imprimir(){
		return "";
	}

	public String llenarTabla(){
		try{
			empleado = new Empleado();
			empleados = empleadoService.buscarEmpleado(empleado);
		}
		catch(Exception exception){
			exception.printStackTrace();
		}
		return "empleados";
	}
	
	public String modificar(){
		FacesContext fc = FacesContext.getCurrentInstance();
		empleado = empleadoService.buscarId(Integer.parseInt(fc.getExternalContext().getRequestParameterMap().get("idEmpleadoM")));
		return inicioAgregar();
	}
	
	public String borrar(){
		FacesContext fc = FacesContext.getCurrentInstance();
		empleadoService.bajaEmpleado(empleadoService.buscarId(Integer.parseInt(fc.getExternalContext().getRequestParameterMap().get("idEmpleado"))));
		return llenarTabla();
	}
	
	public String inicioAgregar(){
		return "agregar";
	}

}