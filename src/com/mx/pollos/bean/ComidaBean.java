package com.mx.pollos.bean;
import java.io.Serializable;
import java.util.List;

import javax.faces.context.FacesContext;

import com.mx.pollos.model.Comida;
import com.mx.pollos.service.VentaService;

/**
 * @author Jorge Ortiz
 * @version 1.0
 * @created 27-ene-2017 12:33:45 p.m.
 */
public class ComidaBean implements Serializable{

	private static final long serialVersionUID = 1L;
	private Comida comida = new Comida();
	private VentaService ventaService;
	private List<Comida> comidas;

	public List<Comida> getComidas() {
		llenarTabla();
		return comidas;
	}

	public void setComidas(List<Comida> comidas) {
		this.comidas = comidas;
	}

	public Comida getComida() {
		return comida;
	}

	public void setComida(Comida comida) {
		this.comida = comida;
	}

	public void setVentaService(VentaService ventaService) {
		this.ventaService = ventaService;
	}

	public ComidaBean(){
		comida = new Comida();
	}

	public void finalize() throws Throwable {

	}

	public String agregar(){
		try{
			System.out.println("Bean " + comida.getPollo() + " " + comida.getPapas());
			ventaService.altaComida(comida.getPollo(), comida.getPapas());
		}
		catch(Exception exception){
			exception.printStackTrace();
		}
		return llenarTabla();
	}

	public String buscar(){
		try{
			System.out.println(comida.getIdComida());
			comidas = ventaService.buscarComida(comida);
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
		comida = ventaService.buscarComida(Integer.parseInt(fc.getExternalContext().getRequestParameterMap().get("idComidaM")));
		return inicioAgregar();
	}

	public String llenarTabla(){
		try{
			comida = new Comida();
			comidas = ventaService.buscarComida(comida);
		}
		catch(Exception exception){
			exception.printStackTrace();
		}
		return "comidas";
	}
	
	public String borrar(){
		FacesContext fc = FacesContext.getCurrentInstance();
		ventaService.bajaComida(ventaService.buscarComida(Integer.parseInt(fc.getExternalContext().getRequestParameterMap().get("idActividad"))));
		return llenarTabla();
	}

	public String inicioAgregar(){
		return "agregar";
	}
	
}