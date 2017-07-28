package com.mx.pollos.service;

import java.util.Date;
import java.util.List;

import com.mx.pollos.model.Producto;
import com.mx.pollos.model.Servicio;


public interface IngresoService {

	public Boolean altaServicio(Servicio servicio);
	
	public Boolean bajaServicio(Servicio servicio);
	
	public Servicio buscarServicio(String descripcion);
	
	public Servicio buscarServicioId(Integer id);
	
	public List<Servicio> buscarServicio(Servicio servicio);
	
	public List<Producto> buscarProducto(Producto producto);
	
	public Producto buscarProductoId(Integer id);
	
	public Boolean compraServicio(Servicio servicio, Double importe, Date fecha);
	
	public Boolean agregarProducto(Producto producto);
	
	public Boolean bajaProducto(Producto producto);
	
	public Boolean comprarProducto(Date fecha, Producto producto, Double peso, Double cantidad, Double importeTotal);
	
	public Boolean comprarProductoCantidad(Date fecha, Producto producto, Double cantidad, Double importeTotal);
	
	public Boolean comprarProductoPeso(Date fecha, Producto producto, Double peso, Double importeTotal);
}
