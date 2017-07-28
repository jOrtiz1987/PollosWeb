package com.mx.pollos.DAO.impl;

import java.util.List;

import com.mx.pollos.DAO.PiezaDAO;
import com.mx.pollos.model.Pieza;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;
import org.hibernate.HibernateException;

public class PiezaDAOImpl extends HibernateDaoSupport implements PiezaDAO {

	@Override
	public Pieza buscar(Integer id) {
		try {
			return (Pieza) getHibernateTemplate().get(Pieza.class, id);
		} catch (HibernateException he) {
			he.printStackTrace();
			return null;
		}
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Pieza> buscar(String consulta) {
		try {
			return getHibernateTemplate().find(consulta);
		} catch (HibernateException he) {
			he.printStackTrace();
			return null;
		}
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Pieza> buscar(Pieza pieza) {
		try {
			return getHibernateTemplate().findByExample(pieza);
		} catch (HibernateException he) {
			he.printStackTrace();
			return null;
		}
	}

	@Override
	public boolean eliminar(Pieza pieza) {
		try {
			getHibernateTemplate().delete(pieza);
			return true;
		} catch (HibernateException he) {
			he.printStackTrace();
			return false;
		}
	}

	@Override
	public boolean insertarModificar(Pieza pieza) {
		try {
			getHibernateTemplate().saveOrUpdate(pieza);
			return true;
		} catch (HibernateException he) {
			he.printStackTrace();
			return false;
		}
	}

	@Override
	public List<Pieza> buscarPiezasValidas(String nombre) {
		// TODO Auto-generated method stub
		return null;
	}

}
