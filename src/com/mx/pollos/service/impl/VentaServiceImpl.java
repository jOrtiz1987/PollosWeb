package com.mx.pollos.service.impl;

import java.util.Date;
import java.util.List;

import com.mx.pollos.DAO.ComidaDAO;
import com.mx.pollos.DAO.ConsolidadoVentaRemolqueDAO;
import com.mx.pollos.DAO.MovimientoPapasDAO;
import com.mx.pollos.DAO.MovimientoPollosDAO;
import com.mx.pollos.DAO.PiezaDAO;
import com.mx.pollos.DAO.RemolqueDAO;
import com.mx.pollos.DAO.VentaRemolqueDAO;
import com.mx.pollos.DAO.VentaRemolquePiezaDAO;
import com.mx.pollos.model.Comida;
import com.mx.pollos.model.ConsolidadoVentaRemolque;
import com.mx.pollos.model.Empleado;
import com.mx.pollos.model.MovimientoPapas;
import com.mx.pollos.model.MovimientoPollos;
import com.mx.pollos.model.Pieza;
import com.mx.pollos.model.Remolque;
import com.mx.pollos.model.Semana;
import com.mx.pollos.model.SemanaDia;
import com.mx.pollos.model.VentaRemolque;
import com.mx.pollos.model.VentaRemolquePieza;
import com.mx.pollos.service.EmpleadoService;
import com.mx.pollos.service.SemanaService;
import com.mx.pollos.service.VentaService;

public class VentaServiceImpl implements VentaService {

	private ComidaDAO comidaDAO;
	private ConsolidadoVentaRemolqueDAO consolidadoVentaRemolqueDAO;
	private VentaRemolqueDAO ventaRemolqueDAO;
	private VentaRemolquePiezaDAO ventaRemolquePiezaDAO;
	private PiezaDAO piezaDAO;
	private RemolqueDAO remolqueDAO;
	private SemanaService semanaService;
	private MovimientoPapasDAO movimientoPapasDAO;
	private MovimientoPollosDAO movimientoPollosDAO;
	private EmpleadoService empleadoService;

	@Override
	public Remolque buscarRemolque(Integer id) {
		return remolqueDAO.buscar(id);
	}
	
	@Override
	public List<Remolque> buscarRemolque(Remolque remolque) {
		return remolqueDAO.buscar(remolque);
	}
	
	@Override
	public Boolean altaRemolque(Remolque remolque) {
		return remolqueDAO.insertarModificar(remolque);
	}

	@Override
	public Boolean altaPieza(Pieza pieza) {
		return piezaDAO.insertarModificar(pieza);
	}

	@Override
	public Boolean altaComida(Double pollo, Double papa) {
		Comida comida = new Comida();
		comida.setPapas(papa);
		comida.setPollo(pollo);
		System.out.println("Service " + comida.getPollo() + " " + comida.getPapas());
		return comidaDAO.insertarModificar(comida);
	}

	@Override
	public VentaRemolque altaVentaRemolque(Double pollos, Double papas,
			Remolque remolque, Empleado parillero, Empleado chava, Date fecha) {
		VentaRemolque ventaRemolque = new VentaRemolque();
		ventaRemolque.setCantPapas(papas);
		ventaRemolque.setCantPollos(pollos);
		ventaRemolque.setEmpleadoByChava(chava);
		ventaRemolque.setEmpleadoByParillero(parillero);
		ventaRemolque.setRemolque(remolque);
		Semana semana = semanaService.obtenerSemana(fecha);
		SemanaDia semanaDia = semanaService.obtenerSemanaDia(semana, fecha);
		ventaRemolque.setSemanadia(semanaDia);
		return ventaRemolqueDAO.insertarModificar(ventaRemolque);
	}

	@Override
	public Boolean altaVentaRemolquePieza(VentaRemolque ventaRemolque,
			Pieza pieza, Double cantidad, Date fecha) {
		VentaRemolquePieza ventaRemolquePieza = new VentaRemolquePieza();
		ventaRemolquePieza.setCantidad(cantidad);
		ventaRemolquePieza.setPieza(pieza);
		Semana semana = semanaService.obtenerSemana(fecha);
		SemanaDia semanaDia = semanaService.obtenerSemanaDia(semana, fecha);
		ventaRemolquePieza.setSemanadia(semanaDia);
		ventaRemolquePieza.setVentaremolque(ventaRemolque);
		return ventaRemolquePiezaDAO.insertarModificar(ventaRemolquePieza);
	}

	@Override
	public Boolean movimientoPapas(Double cantidad, VentaRemolque remolqueOrigen,
			VentaRemolque remolqueDestino, Date fecha) {
		MovimientoPapas movimientoPapas = new MovimientoPapas();
		movimientoPapas.setCantidad(cantidad);
		Semana semana = semanaService.obtenerSemana(fecha);
		SemanaDia semanaDia = semanaService.obtenerSemanaDia(semana, fecha);
		movimientoPapas.setSemanadia(semanaDia);
		movimientoPapas.setVentaremolqueByRemolqueDestino(remolqueDestino);
		movimientoPapas.setVentaremolqueByRemolqueOrigen(remolqueOrigen);
		return movimientoPapasDAO.insertarModificar(movimientoPapas);
	}

	@Override
	public Boolean movimientoPollos(Double cantidad, VentaRemolque remolqueOrigen,
			VentaRemolque remolqueDestino, Date fecha) {
		MovimientoPollos movimientoPollos= new MovimientoPollos();
		movimientoPollos.setCantidad(cantidad);
		Semana semana = semanaService.obtenerSemana(fecha);
		SemanaDia semanaDia = semanaService.obtenerSemanaDia(semana, fecha);
		movimientoPollos.setSemanadia(semanaDia);
		movimientoPollos.setVentaremolqueByRemolqueDestino(remolqueDestino);
		movimientoPollos.setVentaremolqueByRemolqueOrigen(remolqueOrigen);
		return movimientoPollosDAO.insertarModificar(movimientoPollos);
	}

	@Override
	public Boolean altaConsolidadoVentaRemolque(VentaRemolque ventaRemolque,
			Double pollosVendidos, Double papasVendidas, Comida comida,
			Double totalVenta, Double billetes, Double monedas, Double diferencia) {
		ConsolidadoVentaRemolque consolidadoVentaRemolque = new ConsolidadoVentaRemolque();
		consolidadoVentaRemolque.setBilletes(billetes);
		consolidadoVentaRemolque.setComida(comida);
		consolidadoVentaRemolque.setDiferencia(diferencia);
		consolidadoVentaRemolque.setMonedas(monedas);
		consolidadoVentaRemolque.setPapasVendidas(papasVendidas);
		consolidadoVentaRemolque.setPollosVendidos(pollosVendidos);
		consolidadoVentaRemolque.setTotalVenta(totalVenta);
		return consolidadoVentaRemolqueDAO.insertarModificar(consolidadoVentaRemolque);
	}

	@Override
	public Comida buscarComida(Integer id) {
		return comidaDAO.buscar(id);
	}

	@Override
	public Pieza buscarPieza(Integer id) {
		return piezaDAO.buscar(id);
	}
	
	public void setComidaDAO(ComidaDAO comidaDAO) {
		this.comidaDAO = comidaDAO;
	}

	public void setConsolidadoVentaRemolqueDAO(
			ConsolidadoVentaRemolqueDAO consolidadoVentaRemolqueDAO) {
		this.consolidadoVentaRemolqueDAO = consolidadoVentaRemolqueDAO;
	}

	public void setVentaRemolqueDAO(VentaRemolqueDAO ventaRemolqueDAO) {
		this.ventaRemolqueDAO = ventaRemolqueDAO;
	}

	public void setVentaRemolquePiezaDAO(VentaRemolquePiezaDAO ventaRemolquePiezaDAO) {
		this.ventaRemolquePiezaDAO = ventaRemolquePiezaDAO;
	}

	public void setPiezaDAO(PiezaDAO piezaDAO) {
		this.piezaDAO = piezaDAO;
	}

	public void setRemolqueDAO(RemolqueDAO remolqueDAO) {
		this.remolqueDAO = remolqueDAO;
	}

	public void setSemanaService(SemanaService semanaService) {
		this.semanaService = semanaService;
	}

	public void setMovimientoPapasDAO(MovimientoPapasDAO movimientoPapasDAO) {
		this.movimientoPapasDAO = movimientoPapasDAO;
	}

	public void setMovimientoPollosDAO(MovimientoPollosDAO movimientoPollosDAO) {
		this.movimientoPollosDAO = movimientoPollosDAO;
	}

	public void setEmpleadoService(EmpleadoService empleadoService) {
		this.empleadoService = empleadoService;
	}

	@Override
	public List<Comida> buscarComida(Comida comida) {
		return comidaDAO.buscar(comida);
	}

	@Override
	public List<Pieza> buscarPieza(Pieza pieza) {
		return piezaDAO.buscar(pieza);
	}

	@Override
	public Boolean bajaComida(Comida comida) {
		return comidaDAO.eliminar(comida);
	}

	@Override
	public Boolean bajaPieza(Pieza pieza) {
		return piezaDAO.eliminar(pieza);
	}

	@Override
	public Boolean bajaRemolque(Remolque remolque) {
		return remolqueDAO.eliminar(remolque);
	}
	
}
