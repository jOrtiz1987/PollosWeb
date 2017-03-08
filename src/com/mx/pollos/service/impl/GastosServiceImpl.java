package com.mx.pollos.service.impl;

import java.util.Date;
import java.util.List;

import com.mx.pollos.DAO.GastoDAO;
import com.mx.pollos.DAO.GastoSemanaDAO;
import com.mx.pollos.model.Gasto;
import com.mx.pollos.model.GastoSemana;
import com.mx.pollos.model.Semana;
import com.mx.pollos.model.SemanaDia;
import com.mx.pollos.model.VentaRemolque;
import com.mx.pollos.service.GastosService;
import com.mx.pollos.service.SemanaService;
import com.mx.pollos.service.VentaService;

public class GastosServiceImpl implements GastosService {

	private GastoDAO gastoDAO;
	private GastoSemanaDAO gastoSemanaDAO;
	private SemanaService semanaService;
	private VentaService ventaService;
	
	@Override
	public Boolean altaGasto(Gasto gasto) {
		return gastoDAO.insertarModificar(gasto);
	}

	@Override
	public Boolean eliminarGasto(Gasto gasto, Date fecha,
			VentaRemolque ventaRemolque) {
		return gastoDAO.eliminar(gasto);
	}

	@Override
	public Boolean registrarGasto(Gasto gasto, Double importe, Date fecha,
			VentaRemolque ventaRemolque) {
		GastoSemana gastoSemana = new GastoSemana();
		gastoSemana.setGasto(gasto);
		gastoSemana.setImporte(importe);
		gastoSemana.setVentaremolque(ventaRemolque);
		Semana semana = semanaService.obtenerSemana(fecha);
		SemanaDia semanaDia = semanaService.obtenerSemanaDia(semana, fecha);
		gastoSemana.setSemanadia(semanaDia);
		return gastoSemanaDAO.insertarModificar(gastoSemana);
	}

	@Override
	public Gasto buscar(String descripcion) {
		Gasto gasto = new Gasto();
		gasto.setDescripcion(descripcion);
		return gastoDAO.buscar(gasto).get(0);
	}

	public void setGastoDAO(GastoDAO gastoDAO) {
		this.gastoDAO = gastoDAO;
	}

	public void setGastoSemanaDAO(GastoSemanaDAO gastoSemanaDAO) {
		this.gastoSemanaDAO = gastoSemanaDAO;
	}

	public void setSemanaService(SemanaService semanaService) {
		this.semanaService = semanaService;
	}

	public void setVentaService(VentaService ventaService) {
		this.ventaService = ventaService;
	}

	@Override
	public List<Gasto> buscarGasto(Gasto gasto) {
		return gastoDAO.buscar(gasto);
	}

	@Override
	public Gasto buscarGastoId(Integer id) {
		return gastoDAO.buscar(id);
	}

	@Override
	public Boolean bajaGasto(Gasto gasto) {
		return gastoDAO.eliminar(gasto);
	}
	
}
