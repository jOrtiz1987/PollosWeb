package com.mx.pollos.DAO.impl;

import java.util.List;

import com.mx.pollos.DAO.RemolqueDAO;
import com.mx.pollos.model.Remolque;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;
import org.hibernate.HibernateException;

public class RemolqueDAOImpl extends HibernateDaoSupport implements RemolqueDAO {

	@Override
	public Remolque buscar(Integer id) {
		try {
			return (Remolque) getHibernateTemplate().get(Remolque.class, id);
		} catch (HibernateException he) {
			he.printStackTrace();
			return null;
		}
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Remolque> buscar(String consulta) {
		try {
			return getHibernateTemplate().find(consulta);
		} catch (HibernateException he) {
			he.printStackTrace();
			return null;
		}
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Remolque> buscar(Remolque remolque) {
		try {
			return getHibernateTemplate().findByExample(remolque);
		} catch (HibernateException he) {
			he.printStackTrace();
			return null;
		}
	}

	@Override
	public boolean eliminar(Remolque remolque) {
		try {
			getHibernateTemplate().delete(remolque);
			return true;
		} catch (HibernateException he) {
			he.printStackTrace();
			return false;
		}
	}

	@Override
	public boolean insertarModificar(Remolque remolque) {
		try {
			getHibernateTemplate().saveOrUpdate(remolque);
			return true;
		} catch (HibernateException he) {
			he.printStackTrace();
			return false;
		}
	}
}
