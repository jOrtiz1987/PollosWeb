package com.mx.pollos.DAO.impl;

import java.util.List;

import com.mx.pollos.DAO.MovimientoPollosDAO;
import com.mx.pollos.model.MovimientoPollos;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;
import org.hibernate.HibernateException;

public class MovimientoPollosDAOImpl extends HibernateDaoSupport implements MovimientoPollosDAO {

	@Override
	public MovimientoPollos buscar(Integer id) {
		try {
			return (MovimientoPollos) getHibernateTemplate().get(MovimientoPollos.class, id);
		} catch (HibernateException he) {
			he.printStackTrace();
			return null;
		}
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<MovimientoPollos> buscar(String consulta) {
		try {
			return getHibernateTemplate().find(consulta);
		} catch (HibernateException he) {
			he.printStackTrace();
			return null;
		}
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<MovimientoPollos> buscar(MovimientoPollos movimientoPollos) {
		try {
			return getHibernateTemplate().findByExample(movimientoPollos);
		} catch (HibernateException he) {
			he.printStackTrace();
			return null;
		}
	}

	@Override
	public boolean eliminar(MovimientoPollos movimientoPollos) {
		try {
			getHibernateTemplate().delete(movimientoPollos);
			return true;
		} catch (HibernateException he) {
			he.printStackTrace();
			return false;
		}
	}

	@Override
	public boolean insertarModificar(MovimientoPollos movimientoPollos) {
		try {
			getHibernateTemplate().saveOrUpdate(movimientoPollos);
			return true;
		} catch (HibernateException he) {
			he.printStackTrace();
			return false;
		}
	}

}
