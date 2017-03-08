package com.mx.pollos.DAO;

import java.util.List;

import com.mx.pollos.model.VentaRemolque;

public interface VentaRemolqueDAO {

	public VentaRemolque insertarModificar(VentaRemolque ventaRemolque);
	
	public boolean eliminar(VentaRemolque ventaRemolque);
	
	public VentaRemolque buscar(Integer id);
	
	public List<VentaRemolque> buscar(String consulta);

	public List<VentaRemolque> buscar(VentaRemolque ventaRemolque);
	
}
