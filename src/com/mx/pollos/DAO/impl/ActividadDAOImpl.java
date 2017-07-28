package com.mx.pollos.DAO.impl;

import java.util.List;

import com.mx.pollos.DAO.ActividadDAO;
import com.mx.pollos.model.Actividad;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;
import org.hibernate.HibernateException;

public class ActividadDAOImpl extends HibernateDaoSupport implements ActividadDAO {

	@Override
	public Actividad buscar(Integer id) {
		try {
			return (Actividad) getHibernateTemplate().get(Actividad.class, id);
		} catch (HibernateException he) {
			he.printStackTrace();
			return null;
		}
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Actividad> buscar(String consulta) {
		try {
			return getHibernateTemplate().find(consulta);
		} catch (HibernateException he) {
			he.printStackTrace();
			return null;
		}
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Actividad> buscar(Actividad actividad) {
		try {
			return getHibernateTemplate().findByExample(actividad);
		} catch (HibernateException he) {
			he.printStackTrace();
			return null;
		}
	}

	@Override
	public boolean eliminar(Actividad actividad) {
		try {
			getHibernateTemplate().delete(actividad);
			return true;
		} catch (HibernateException he) {
			he.printStackTrace();
			return false;
		}
	}

	@Override
	public boolean insertarModificar(Actividad actividad) {
		try {
			getHibernateTemplate().saveOrUpdate(actividad);
			return true;
		} catch (HibernateException he) {
			he.printStackTrace();
			return false;
		}
	}

}
