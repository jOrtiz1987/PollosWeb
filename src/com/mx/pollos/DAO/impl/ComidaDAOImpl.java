package com.mx.pollos.DAO.impl;

import java.util.List;

import com.mx.pollos.DAO.ComidaDAO;
import com.mx.pollos.model.Comida;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;
import org.hibernate.HibernateException;

public class ComidaDAOImpl extends HibernateDaoSupport implements ComidaDAO {

	@Override
	public Comida buscar(Integer id) {
		try {
			return (Comida) getHibernateTemplate().get(Comida.class, id);
		} catch (HibernateException he) {
			he.printStackTrace();
			return null;
		}
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Comida> buscar(String consulta) {
		try {
			return getHibernateTemplate().find(consulta);
		} catch (HibernateException he) {
			he.printStackTrace();
			return null;
		}
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Comida> buscar(Comida comida) {
		try {
			return getHibernateTemplate().findByExample(comida);
		} catch (HibernateException he) {
			he.printStackTrace();
			return null;
		}
	}

	@Override
	public boolean eliminar(Comida comida) {
		try {
			getHibernateTemplate().delete(comida);
			return true;
		} catch (HibernateException he) {
			he.printStackTrace();
			return false;
		}
	}

	@Override
	public boolean insertarModificar(Comida comida) {
		try {
			System.out.println("DAO " + comida.getPollo() + " " + comida.getPapas());
			getHibernateTemplate().saveOrUpdate(comida);
			return true;
		} catch (HibernateException he) {
			he.printStackTrace();
			return false;
		}
	}

}
