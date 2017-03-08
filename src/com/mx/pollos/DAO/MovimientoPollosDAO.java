package com.mx.pollos.DAO;

import java.util.List;

import com.mx.pollos.model.MovimientoPollos;

public interface MovimientoPollosDAO {

	public boolean insertarModificar(MovimientoPollos movimientoPollos);
	
	public boolean eliminar(MovimientoPollos movimientoPollos);
	
	public MovimientoPollos buscar(Integer id);
	
	public List<MovimientoPollos> buscar(String consulta);

	public List<MovimientoPollos> buscar(MovimientoPollos movimientoPollos);
	
}
