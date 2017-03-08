package com.mx.pollos.DAO.impl;

import java.util.List;

import com.mx.pollos.DAO.ConsolidadoVentaRemolqueDAO;
import com.mx.pollos.model.ConsolidadoVentaRemolque;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;
import org.hibernate.HibernateException;

public class ConsolidadoVentaRemolqueDAOImpl extends HibernateDaoSupport implements ConsolidadoVentaRemolqueDAO {

	@Override
	public ConsolidadoVentaRemolque buscar(Integer id) {
		try {
			return (ConsolidadoVentaRemolque) getHibernateTemplate().get(ConsolidadoVentaRemolque.class, id);
		} catch (HibernateException he) {
			he.printStackTrace();
			return null;
		}
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<ConsolidadoVentaRemolque> buscar(String consulta) {
		try {
			return getHibernateTemplate().find(consulta);
		} catch (HibernateException he) {
			he.printStackTrace();
			return null;
		}
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<ConsolidadoVentaRemolque> buscar(ConsolidadoVentaRemolque consolidadoVentaRemolque) {
		try {
			return getHibernateTemplate().findByExample(consolidadoVentaRemolque);
		} catch (HibernateException he) {
			he.printStackTrace();
			return null;
		}
	}

	@Override
	public boolean eliminar(ConsolidadoVentaRemolque consolidadoVentaRemolque) {
		try {
			getHibernateTemplate().delete(consolidadoVentaRemolque);
			return true;
		} catch (HibernateException he) {
			he.printStackTrace();
			return false;
		}
	}

	@Override
	public boolean insertarModificar(ConsolidadoVentaRemolque consolidadoVentaRemolque) {
		try {
			getHibernateTemplate().saveOrUpdate(consolidadoVentaRemolque);
			return true;
		} catch (HibernateException he) {
			he.printStackTrace();
			return false;
		}
	}

}
