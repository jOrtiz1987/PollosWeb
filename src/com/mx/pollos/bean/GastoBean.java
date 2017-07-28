package com.mx.pollos.bean;
import java.io.Serializable;
import java.util.List;

import javax.faces.context.FacesContext;

import com.mx.pollos.model.Gasto;
import com.mx.pollos.service.GastosService;

/**
 * @author Jorge Ortiz
 * @version 1.0
 * @created 27-ene-2017 12:33:45 p.m.
 */
public class GastoBean implements Serializable{

	private static final long serialVersionUID = 1L;
	private Gasto gasto = new Gasto();
	private GastosService gastosService;
	private List<Gasto> gastos;

	public List<Gasto> getGastos() {
		llenarTabla();
		return gastos;
	}

	public void setGastos(List<Gasto> gastos) {
		this.gastos = gastos;
	}

	public Gasto getGasto() {
		return gasto;
	}

	public void setGasto(Gasto gasto) {
		this.gasto = gasto;
	}

	public void setGastosService(GastosService gastosService) {
		this.gastosService = gastosService;
	}

	public GastoBean(){
		gasto = new Gasto();
	}

	public void finalize() throws Throwable {

	}

	public String agregar(){
		try{
			gastosService.altaGasto(gasto);
		}
		catch(Exception exception){
			exception.printStackTrace();
		}
		return llenarTabla();
	}

	public String buscar(){
		try{
			System.out.println(gasto.getIdGasto());
			gastos = gastosService.buscarGasto(gasto);
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
			gasto = new Gasto();
			gastos = gastosService.buscarGasto(gasto);
		}
		catch(Exception exception){
			exception.printStackTrace();
		}
		return "gastos";
	}
	
	public String modificar(){
		FacesContext fc = FacesContext.getCurrentInstance();
		gasto = gastosService.buscarGastoId(Integer.parseInt(fc.getExternalContext().getRequestParameterMap().get("idGastoM")));
		return inicioAgregar();
	}
	
	public String borrar(){
		FacesContext fc = FacesContext.getCurrentInstance();
		gastosService.bajaGasto(gastosService.buscarGastoId(Integer.parseInt(fc.getExternalContext().getRequestParameterMap().get("idGasto"))));
		return llenarTabla();
	}
	
	public String inicioAgregar(){
		return "agregar";
	}

}