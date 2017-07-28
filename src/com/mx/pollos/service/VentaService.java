package com.mx.pollos.service;

import java.util.Date;
import java.util.List;

import com.mx.pollos.model.Comida;
import com.mx.pollos.model.Empleado;
import com.mx.pollos.model.Pieza;
import com.mx.pollos.model.Remolque;
import com.mx.pollos.model.VentaRemolque;

public interface VentaService {

	public Boolean altaRemolque(Remolque remolque);
	
	public Boolean bajaRemolque(Remolque remolque);
	
	public Comida buscarComida(Integer id);
	
	public List<Comida> buscarComida(Comida comida);
	
	public Pieza buscarPieza(Integer id);
	
	public List<Pieza> buscarPieza(Pieza pieza);
	
	public Remolque buscarRemolque(Integer id);
	
	public List<Remolque> buscarRemolque(Remolque remolque);
	
	public Boolean altaComida(Double pollo, Double papa);
	
	public Boolean bajaComida(Comida comida);
	
	public Boolean altaConsolidadoVentaRemolque(VentaRemolque ventaRemolque, Double pollosVendidos, Double papasVendidas, Comida comida, Double totalVenta, Double billetes, Double monedas, Double diferencia);
	
	public VentaRemolque altaVentaRemolque(Double pollos, Double papas, Remolque remolque, Empleado parillero, Empleado chava, Date fecha);
	
	public Boolean altaVentaRemolquePieza(VentaRemolque ventaRemolque, Pieza pieza, Double cantidad, Date fecha);
	
	public Boolean altaPieza(Pieza pieza);
	
	public Boolean bajaPieza(Pieza pieza);
	
	public Boolean movimientoPollos(Double cantidad, VentaRemolque remolqueOrigen, VentaRemolque remolqueDestino, Date fecha);
	
	public Boolean movimientoPapas(Double cantidad, VentaRemolque remolqueOrigen, VentaRemolque remolqueDestino, Date fecha);
	
}
