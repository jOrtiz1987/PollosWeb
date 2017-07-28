package com.mx.pollos.DAO;

import java.util.List;

import com.mx.pollos.model.CompraProducto;

public interface CompraProductoDAO {

	public boolean insertarModificar(CompraProducto compraProducto);
	
	public boolean eliminar(CompraProducto compraProducto);
	
	public CompraProducto buscar(Integer id);
	
	public List<CompraProducto> buscar(String consulta);

	public List<CompraProducto> buscar(CompraProducto compraProducto);
	
}
