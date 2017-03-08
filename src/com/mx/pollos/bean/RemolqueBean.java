package com.mx.pollos.bean;
import java.io.Serializable;
import java.util.List;

import javax.faces.context.FacesContext;

import com.mx.pollos.model.Remolque;
import com.mx.pollos.service.VentaService;

/**
 * @author Jorge Ortiz
 * @version 1.0
 * @created 26-ene-2017 07:33:07 p.m.
 */
public class RemolqueBean implements Serializable{

	private static final long serialVersionUID = 1L;
	private Remolque remolque = new Remolque();
	private VentaService ventaService;
	private List<Remolque> remolques;

	public List<Remolque> getRemolques() {
		llenarTabla();
		return remolques;
	}

	public void setRemolques(List<Remolque> remolques) {
		this.remolques = remolques;
	}

	public Remolque getRemolque() {
		return remolque;
	}

	public void setRemolque(Remolque remolque) {
		this.remolque = remolque;
	}

	public void setVentaService(VentaService ventaService) {
		this.ventaService = ventaService;
	}

	public RemolqueBean(){
		remolque = new Remolque();
	}

	public void finalize() throws Throwable {

	}

	public String agregar(){
		try{
			ventaService.altaRemolque(remolque);
		}
		catch(Exception exception){
			exception.printStackTrace();
		}
		return llenarTabla();
	}

	public String buscar(){
		try{
			System.out.println(remolque.getIdRemolque());
			remolques = ventaService.buscarRemolque(remolque);
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
			remolque = new Remolque();
			remolques = ventaService.buscarRemolque(remolque);
		}
		catch(Exception exception){
			exception.printStackTrace();
		}
		return "remolques";
	}
	
	public String modificar(){
		FacesContext fc = FacesContext.getCurrentInstance();
		remolque = ventaService.buscarRemolque(Integer.parseInt(fc.getExternalContext().getRequestParameterMap().get("idEmpleadoM")));
		return inicioAgregar();
	}
	
	public String borrar(){
		FacesContext fc = FacesContext.getCurrentInstance();
		ventaService.bajaRemolque(ventaService.buscarRemolque(Integer.parseInt(fc.getExternalContext().getRequestParameterMap().get("idRemolque"))));
		return llenarTabla();
	}
	
	public String inicioAgregar(){
		return "agregar";
	}

}