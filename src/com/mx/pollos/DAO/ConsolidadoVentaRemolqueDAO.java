package com.mx.pollos.DAO;

import java.util.List;

import com.mx.pollos.model.ConsolidadoVentaRemolque;

public interface ConsolidadoVentaRemolqueDAO {

	public boolean insertarModificar(ConsolidadoVentaRemolque consolidadoVentaRemolque);
	
	public boolean eliminar(ConsolidadoVentaRemolque consolidadoVentaRemolque);
	
	public ConsolidadoVentaRemolque buscar(Integer id);
	
	public List<ConsolidadoVentaRemolque> buscar(String consulta);

	public List<ConsolidadoVentaRemolque> buscar(ConsolidadoVentaRemolque consolidadoVentaRemolque);
	
}
