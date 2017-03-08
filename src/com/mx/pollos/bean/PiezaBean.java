package com.mx.pollos.bean;
import java.io.Serializable;
import java.util.List;

import javax.faces.context.FacesContext;

import com.mx.pollos.model.Pieza;
import com.mx.pollos.service.VentaService;

/**
 * @author Jorge Ortiz
 * @version 1.0
 * @created 27-ene-2017 12:33:45 p.m.
 */
public class PiezaBean implements Serializable{

	private static final long serialVersionUID = 1L;
	private Pieza pieza = new Pieza();
	private VentaService ventaService;
	private List<Pieza> piezas;

	public List<Pieza> getPiezas() {
		llenarTabla();
		return piezas;
	}

	public void setPiezas(List<Pieza> piezas) {
		this.piezas = piezas;
	}

	public Pieza getPieza() {
		return pieza;
	}

	public void setPieza(Pieza pieza) {
		this.pieza = pieza;
	}

	public void setVentaService(VentaService ventaService) {
		this.ventaService = ventaService;
	}

	public PiezaBean(){
		pieza = new Pieza();
	}

	public void finalize() throws Throwable {

	}

	public String agregar(){
		try{
			pieza.setValides(true);
			ventaService.altaPieza(pieza);
		}
		catch(Exception exception){
			exception.printStackTrace();
		}
		return llenarTabla();
	}

	public String buscar(){
		try{
			System.out.println(pieza.getIdPieza());
			piezas = ventaService.buscarPieza(pieza);
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
			pieza = new Pieza();
			piezas = ventaService.buscarPieza(pieza);
		}
		catch(Exception exception){
			exception.printStackTrace();
		}
		return "piezas";
	}
	
	public String modificar(){
		FacesContext fc = FacesContext.getCurrentInstance();
		pieza = ventaService.buscarPieza(Integer.parseInt(fc.getExternalContext().getRequestParameterMap().get("idEmpleadoM")));
		return inicioAgregar();
	}
	
	public String borrar(){
		FacesContext fc = FacesContext.getCurrentInstance();
		ventaService.bajaPieza(ventaService.buscarPieza(Integer.parseInt(fc.getExternalContext().getRequestParameterMap().get("idPieza"))));
		return llenarTabla();
	}
	
	public String inicioAgregar(){
		return "agregar";
	}

}