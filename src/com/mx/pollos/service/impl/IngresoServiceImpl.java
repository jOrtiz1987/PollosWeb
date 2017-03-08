package com.mx.pollos.service.impl;

import java.util.Date;
import java.util.List;

import com.mx.pollos.DAO.CompraProductoDAO;
import com.mx.pollos.DAO.ProductoDAO;
import com.mx.pollos.DAO.ServicioCompraDAO;
import com.mx.pollos.DAO.ServicioDAO;
import com.mx.pollos.model.CompraProducto;
import com.mx.pollos.model.Producto;
import com.mx.pollos.model.Semana;
import com.mx.pollos.model.SemanaDia;
import com.mx.pollos.model.Servicio;
import com.mx.pollos.model.ServicioCompra;
import com.mx.pollos.service.IngresoService;
import com.mx.pollos.service.SemanaService;

public class IngresoServiceImpl implements IngresoService{

	private CompraProductoDAO compraProductoDAO;
	private ProductoDAO productoDAO;
	private SemanaService semanaService;
	private ServicioDAO servicioDAO;
	private ServicioCompraDAO servicioCompraDAO;
	
	@Override
	public Boolean agregarProducto(Producto producto) {
		return productoDAO.insertarModificar(producto);
	}

	@Override
	public Boolean altaServicio(Servicio servicio) {
		return servicioDAO.insertarModificar(servicio);
	}

	@Override
	public Servicio buscarServicio(String servicio) {
		return servicioDAO.buscar(servicio).get(0);
	}

	@Override
	public Boolean compraServicio(Servicio servicio, Double importe, Date fecha) {
		ServicioCompra servicioCompra = new ServicioCompra();
		servicioCompra.setImporte(importe);
		servicioCompra.setServicio(servicio);
		Semana semana = semanaService.obtenerSemana(fecha);
		SemanaDia semanadia = semanaService.obtenerSemanaDia(semana, fecha);
		servicioCompra.setSemanadia(semanadia);
		return servicioCompraDAO.insertarModificar(servicioCompra);
	}

	@Override
	public Boolean comprarProducto(Date fecha, Producto producto, Double peso,
			Double cantidad, Double importeTotal) {
		CompraProducto compraProducto = new CompraProducto();
		compraProducto.setCantidad(cantidad);
		compraProducto.setImporteTotal(importeTotal);
		compraProducto.setImporteUnitario(importeTotal/cantidad);
		compraProducto.setPeso(peso);
		compraProducto.setProducto(producto);
		Semana semana = semanaService.obtenerSemana(fecha);
		compraProducto.setSemana(semana);
		return compraProductoDAO.insertarModificar(compraProducto);
	}

	@Override
	public Boolean comprarProductoCantidad(Date fecha, Producto producto,
			Double cantidad, Double importeTotal) {
		CompraProducto compraProducto = new CompraProducto();
		compraProducto.setCantidad(cantidad);
		compraProducto.setImporteTotal(importeTotal);
		compraProducto.setImporteUnitario(importeTotal/cantidad);
		compraProducto.setProducto(producto);
		Semana semana = semanaService.obtenerSemana(fecha);
		compraProducto.setSemana(semana);
		return compraProductoDAO.insertarModificar(compraProducto);
	}

	@Override
	public Boolean comprarProductoPeso(Date fecha, Producto producto,
			Double peso, Double importeTotal) {
		CompraProducto compraProducto = new CompraProducto();
		compraProducto.setImporteTotal(importeTotal);
		compraProducto.setPeso(peso);
		compraProducto.setProducto(producto);
		Semana semana = semanaService.obtenerSemana(fecha);
		compraProducto.setSemana(semana);
		return compraProductoDAO.insertarModificar(compraProducto);
	}

	public void setCompraProductoDAO(CompraProductoDAO compraProductoDAO) {
		this.compraProductoDAO = compraProductoDAO;
	}

	public void setProductoDAO(ProductoDAO productoDAO) {
		this.productoDAO = productoDAO;
	}

	public void setSemanaService(SemanaService semanaService) {
		this.semanaService = semanaService;
	}

	public void setServicioDAO(ServicioDAO servicioDAO) {
		this.servicioDAO = servicioDAO;
	}

	public void setServicioCompraDAO(ServicioCompraDAO servicioCompraDAO) {
		this.servicioCompraDAO = servicioCompraDAO;
	}

	@Override
	public List<Servicio> buscarServicio(Servicio servicio) {
		return servicioDAO.buscar(servicio);
	}

	@Override
	public List<Producto> buscarProducto(Producto producto) {
		return productoDAO.buscar(producto);
	}

	@Override
	public Producto buscarProductoId(Integer id) {
		return productoDAO.buscar(id);
	}

	@Override
	public Boolean bajaProducto(Producto producto) {
		return productoDAO.eliminar(producto);
	}

	@Override
	public Boolean bajaServicio(Servicio servicio) {
		return servicioDAO.eliminar(servicio);
	}

	@Override
	public Servicio buscarServicioId(Integer id) {
		return servicioDAO.buscar(id);
	}

	
	
}
