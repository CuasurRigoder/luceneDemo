package com.lei.zjs.dao.base;

import java.io.Serializable;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.List;

import javax.annotation.Resource;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.DetachedCriteria;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

public class BaseDaoImpl<T> extends HibernateDaoSupport implements BaseDao<T> {

	private Class<T> domainClass;

	public BaseDaoImpl() {
		ParameterizedType genericSuperclass = (ParameterizedType) this.getClass().getGenericSuperclass();
		Type[] actualTypeArguments = genericSuperclass.getActualTypeArguments();
		domainClass = (Class<T>) actualTypeArguments[0];
	}
	
	@Resource
	public void setSF(SessionFactory sessionFactory) {
		super.setSessionFactory(sessionFactory);
	}
	
	@Override
	public void save(T entity) {
		this.getHibernateTemplate().save(entity);
	}

	@Override
	public void delete(T entity) {
		this.getHibernateTemplate().delete(entity);
	}

	@Override
	public void update(T entity) {
		this.getHibernateTemplate().update(entity);
	}

	@Override
	public T findById(Serializable id) {
		return this.getHibernateTemplate().get(domainClass, id);
	}

	@Override
	public List<T> findAll() {
		String hql = "FROM " + domainClass.getSimpleName();
		return this.getHibernateTemplate().find(hql );
	}

	@Override
	public List<T> findByNamedQuery(String namedQuery, Object... args) {
		return this.getHibernateTemplate().findByNamedQuery(namedQuery, args);
	}

	@Override
	public void executeByNamedQuery(String namedQuery, Object... args) {
		Session session = this.getSession();
		Query query = session.getNamedQuery(namedQuery);
		if (args != null && args.length > 0) {
			for (int i = 0; i < args.length; i++) {
				query.setParameter(i, args[i]);
			}
		}
		query.executeUpdate();
		session.close();
	}

	@Override
	public List<T> findByCriteria(DetachedCriteria dc) {
		return this.getHibernateTemplate().findByCriteria(dc);
	}
}

