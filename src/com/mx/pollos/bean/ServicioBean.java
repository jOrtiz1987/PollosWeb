package com.mx.pollos.bean;
import java.io.Serializable;
import java.util.List;

import javax.faces.context.FacesContext;

import com.mx.pollos.model.Servicio;
import com.mx.pollos.service.IngresoService;

/**
 * @author Jorge Ortiz
 * @version 1.0
 * @created 27-ene-2017 12:33:45 p.m.
 */
public class ServicioBean implements Serializable{

	private static final long serialVersionUID = 1L;
	private Servicio servicio = new Servicio();
	private IngresoService ingresoService;
	private List<Servicio> servicios;

	public List<Servicio> getServicios() {
		llenarTabla();
		return servicios;
	}

	public void setServicios(List<Servicio> servicios) {
		this.servicios = servicios;
	}

	public Servicio getServicio() {
		return servicio;
	}

	public void setServicio(Servicio servicio) {
		this.servicio = servicio;
	}

	public void setIngresoService(IngresoService ingresoService) {
		this.ingresoService = ingresoService;
	}

	public ServicioBean(){
		servicio = new Servicio();
	}

	public void finalize() throws Throwable {

	}

	public String agregar(){
		try{
			ingresoService.altaServicio(servicio);
		}
		catch(Exception exception){
			exception.printStackTrace();
		}
		return llenarTabla();
	}

	public String buscar(){
		try{
			System.out.println(servicio.getIdServicio());
			servicios = ingresoService.buscarServicio(servicio);
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
			servicio = new Servicio();
			servicios = ingresoService.buscarServicio(servicio);
		}
		catch(Exception exception){
			exception.printStackTrace();
		}
		return "servicios";
	}
	
	public String modificar(){
		FacesContext fc = FacesContext.getCurrentInstance();
		servicio = ingresoService.buscarServicioId(Integer.parseInt(fc.getExternalContext().getRequestParameterMap().get("idEmpleadoM")));
		return inicioAgregar();
	}
	
	public String borrar(){
		FacesContext fc = FacesContext.getCurrentInstance();
		ingresoService.bajaServicio(ingresoService.buscarServicioId(Integer.parseInt(fc.getExternalContext().getRequestParameterMap().get("idServicio"))));
		return llenarTabla();
	}
	
	public String inicioAgregar(){
		return "agregar";
	}

}