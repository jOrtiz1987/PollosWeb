package com.mx.pollos.DAO.impl;

import java.util.List;

import com.mx.pollos.DAO.ServicioDAO;
import com.mx.pollos.model.Servicio;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;
import org.hibernate.HibernateException;

public class ServicioDAOImpl extends HibernateDaoSupport implements ServicioDAO {

	@Override
	public Servicio buscar(Integer id) {
		try {
			return (Servicio) getHibernateTemplate().get(Servicio.class, id);
		} catch (HibernateException he) {
			he.printStackTrace();
			return null;
		}
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Servicio> buscar(String consulta) {
		try {
			return getHibernateTemplate().find(consulta);
		} catch (HibernateException he) {
			he.printStackTrace();
			return null;
		}
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Servicio> buscar(Servicio servicio) {
		try {
			return getHibernateTemplate().findByExample(servicio);
		} catch (HibernateException he) {
			he.printStackTrace();
			return null;
		}
	}

	@Override
	public boolean eliminar(Servicio servicio) {
		try {
			getHibernateTemplate().delete(servicio);
			return true;
		} catch (HibernateException he) {
			he.printStackTrace();
			return false;
		}
	}

	@Override
	public boolean insertarModificar(Servicio servicio) {
		try {
			getHibernateTemplate().saveOrUpdate(servicio);
			return true;
		} catch (HibernateException he) {
			he.printStackTrace();
			return false;
		}
	}
}
