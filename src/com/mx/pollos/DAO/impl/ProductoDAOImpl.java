package com.mx.pollos.DAO.impl;

import java.util.List;

import com.mx.pollos.DAO.ProductoDAO;
import com.mx.pollos.model.Producto;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;
import org.hibernate.HibernateException;

public class ProductoDAOImpl extends HibernateDaoSupport implements ProductoDAO {

	@Override
	public Producto buscar(Integer id) {
		try {
			return (Producto) getHibernateTemplate().get(Producto.class, id);
		} catch (HibernateException he) {
			he.printStackTrace();
			return null;
		}
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Producto> buscar(String consulta) {
		try {
			return getHibernateTemplate().find(consulta);
		} catch (HibernateException he) {
			he.printStackTrace();
			return null;
		}
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Producto> buscar(Producto producto) {
		try {
			return getHibernateTemplate().findByExample(producto);
		} catch (HibernateException he) {
			he.printStackTrace();
			return null;
		}
	}

	@Override
	public boolean eliminar(Producto producto) {
		try {
			getHibernateTemplate().delete(producto);
			return true;
		} catch (HibernateException he) {
			he.printStackTrace();
			return false;
		}
	}

	@Override
	public boolean insertarModificar(Producto producto) {
		try {
			getHibernateTemplate().saveOrUpdate(producto);
			return true;
		} catch (HibernateException he) {
			he.printStackTrace();
			return false;
		}
	}
}
