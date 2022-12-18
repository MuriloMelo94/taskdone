package br.com.esiggroup.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import br.com.esiggroup.jpautil.JPAUtil;

public class DaoGeneric<E> {

	public void salvar(E entidade) {
		
		EntityManager entityManager = JPAUtil.getEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		entityTransaction.begin();
		
		entityManager.persist(entidade);
		
		entityTransaction.commit();
		entityManager.close();
	}
		
}
