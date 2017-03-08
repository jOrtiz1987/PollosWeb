package com.mx.pollos.DAO;

import java.util.List;

import com.mx.pollos.model.Producto;

public interface ProductoDAO {

	public boolean insertarModificar(Producto producto);
	
	public boolean eliminar(Producto producto);
	
	public Producto buscar(Integer id);
	
	public List<Producto> buscar(String consulta);

	public List<Producto> buscar(Producto producto);
	
}
