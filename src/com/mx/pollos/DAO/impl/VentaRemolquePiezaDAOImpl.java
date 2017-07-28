package com.mx.pollos.DAO.impl;

import java.util.List;

import com.mx.pollos.DAO.VentaRemolquePiezaDAO;
import com.mx.pollos.model.VentaRemolquePieza;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;
import org.hibernate.HibernateException;

public class VentaRemolquePiezaDAOImpl extends HibernateDaoSupport implements VentaRemolquePiezaDAO {

	@Override
	public VentaRemolquePieza buscar(Integer id) {
		try {
			return (VentaRemolquePieza) getHibernateTemplate().get(VentaRemolquePieza.class, id);
		} catch (HibernateException he) {
			he.printStackTrace();
			return null;
		}
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<VentaRemolquePieza> buscar(String consulta) {
		try {
			return getHibernateTemplate().find(consulta);
		} catch (HibernateException he) {
			he.printStackTrace();
			return null;
		}
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<VentaRemolquePieza> buscar(VentaRemolquePieza ventaRemolquePieza) {
		try {
			return getHibernateTemplate().findByExample(ventaRemolquePieza);
		} catch (HibernateException he) {
			he.printStackTrace();
			return null;
		}
	}

	@Override
	public boolean eliminar(VentaRemolquePieza ventaRemolquePieza) {
		try {
			getHibernateTemplate().delete(ventaRemolquePieza);
			return true;
		} catch (HibernateException he) {
			he.printStackTrace();
			return false;
		}
	}

	@Override
	public boolean insertarModificar(VentaRemolquePieza ventaRemolquePieza) {
		try {
			getHibernateTemplate().saveOrUpdate(ventaRemolquePieza);
			return true;
		} catch (HibernateException he) {
			he.printStackTrace();
			return false;
		}
	}
}
