package com.mx.pollos.service;

import java.util.Date;
import java.util.List;

import com.mx.pollos.model.Gasto;
import com.mx.pollos.model.VentaRemolque;

public interface GastosService {

	public Boolean altaGasto(Gasto gasto);
	
	public Boolean bajaGasto(Gasto gasto);
	
	public Gasto buscar(String descripcion);
	
	public Gasto buscarGastoId(Integer id);
	
	public List<Gasto> buscarGasto(Gasto gasto);
	
	public Boolean registrarGasto(Gasto gasto, Double importe, Date fecha, VentaRemolque ventaRemolque);
	
	public Boolean eliminarGasto(Gasto gasto, Date fecha, VentaRemolque ventaRemolque);
}
