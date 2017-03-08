package com.mx.pollos.bean;
import java.io.Serializable;
import java.util.List;

import javax.faces.context.FacesContext;

import com.mx.pollos.model.Producto;
import com.mx.pollos.service.IngresoService;

/**
 * @author Jorge Ortiz
 * @version 1.0
 * @created 27-ene-2017 12:33:45 p.m.
 */
public class ProductoBean implements Serializable{

	private static final long serialVersionUID = 1L;
	private Producto producto = new Producto();
	private IngresoService ingresoService;
	private List<Producto> productos;

	public List<Producto> getProductos() {
		llenarTabla();
		return productos;
	}

	public void setProductos(List<Producto> productos) {
		this.productos = productos;
	}

	public Producto getProducto() {
		return producto;
	}

	public void setProducto(Producto producto) {
		this.producto = producto;
	}

	public void setIngresoService(IngresoService ingresoService) {
		this.ingresoService = ingresoService;
	}

	public ProductoBean(){
		producto = new Producto();
	}

	public void finalize() throws Throwable {

	}

	public String agregar(){
		try{
			ingresoService.agregarProducto(producto);
		}
		catch(Exception exception){
			exception.printStackTrace();
		}
		return llenarTabla();
	}

	public String buscar(){
		try{
			System.out.println(producto.getIdProducto());
			productos = ingresoService.buscarProducto(producto);
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
			producto = new Producto();
			productos = ingresoService.buscarProducto(producto);
		}
		catch(Exception exception){
			exception.printStackTrace();
		}
		return "productos";
	}
	
	public String modificar(){
		FacesContext fc = FacesContext.getCurrentInstance();
		producto = ingresoService.buscarProductoId(Integer.parseInt(fc.getExternalContext().getRequestParameterMap().get("idEmpleadoM")));
		return inicioAgregar();
	}
	
	public String borrar(){
		FacesContext fc = FacesContext.getCurrentInstance();
		ingresoService.bajaProducto(ingresoService.buscarProductoId(Integer.parseInt(fc.getExternalContext().getRequestParameterMap().get("idProducto"))));
		return llenarTabla();
	}
	
	public String inicioAgregar(){
		return "agregar";
	}

}