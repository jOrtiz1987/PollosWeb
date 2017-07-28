package com.mx.pollos.DAO;

import java.util.List;

import com.mx.pollos.model.VentaRemolquePieza;

public interface VentaRemolquePiezaDAO {

	public boolean insertarModificar(VentaRemolquePieza ventaRemolquePieza);
	
	public boolean eliminar(VentaRemolquePieza ventaRemolquePieza);
	
	public VentaRemolquePieza buscar(Integer id);
	
	public List<VentaRemolquePieza> buscar(String consulta);

	public List<VentaRemolquePieza> buscar(VentaRemolquePieza ventaRemolquePieza);
	
}
