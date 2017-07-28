package com.mx.pollos.DAO;

import java.util.List;

import com.mx.pollos.model.MovimientoPapas;

public interface MovimientoPapasDAO {

	public boolean insertarModificar(MovimientoPapas movimientoPapas);
	
	public boolean eliminar(MovimientoPapas movimientoPapas);
	
	public MovimientoPapas buscar(Integer id);
	
	public List<MovimientoPapas> buscar(String consulta);

	public List<MovimientoPapas> buscar(MovimientoPapas movimientoPapas);
	
}
