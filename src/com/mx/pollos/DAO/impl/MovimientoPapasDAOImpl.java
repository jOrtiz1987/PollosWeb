package com.mx.pollos.DAO.impl;

import java.util.List;

import com.mx.pollos.DAO.MovimientoPapasDAO;
import com.mx.pollos.model.MovimientoPapas;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;
import org.hibernate.HibernateException;

public class MovimientoPapasDAOImpl extends HibernateDaoSupport implements MovimientoPapasDAO {

	@Override
	public MovimientoPapas buscar(Integer id) {
		try {
			return (MovimientoPapas) getHibernateTemplate().get(MovimientoPapas.class, id);
		} catch (HibernateException he) {
			he.printStackTrace();
			return null;
		}
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<MovimientoPapas> buscar(String consulta) {
		try {
			return getHibernateTemplate().find(consulta);
		} catch (HibernateException he) {
			he.printStackTrace();
			return null;
		}
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<MovimientoPapas> buscar(MovimientoPapas movimientoPapas) {
		try {
			return getHibernateTemplate().findByExample(movimientoPapas);
		} catch (HibernateException he) {
			he.printStackTrace();
			return null;
		}
	}

	@Override
	public boolean eliminar(MovimientoPapas movimientoPapas) {
		try {
			getHibernateTemplate().delete(movimientoPapas);
			return true;
		} catch (HibernateException he) {
			he.printStackTrace();
			return false;
		}
	}

	@Override
	public boolean insertarModificar(MovimientoPapas movimientoPapas) {
		try {
			getHibernateTemplate().saveOrUpdate(movimientoPapas);
			return true;
		} catch (HibernateException he) {
			he.printStackTrace();
			return false;
		}
	}

}
