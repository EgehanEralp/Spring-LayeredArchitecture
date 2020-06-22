package com.egehaneralp.project.dersdbms.DAL;

import java.util.List;


import javax.persistence.EntityManager;


import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import com.egehaneralp.project.dersdbms.Entity.Ders;

@Repository
public class HibernateDersDal implements IDersDal{

	private EntityManager entityManager;
	
	@Autowired
	public HibernateDersDal(EntityManager entityManager) {
		this.entityManager = entityManager;
	}
	
	@Override
	@Transactional
	public List<Ders> getAll() {
		Session session = entityManager.unwrap(Session.class);
		List<Ders> dersler = session.createQuery("from Ders",Ders.class).getResultList();
		return dersler;
	}

	@Override
	@Transactional
	public void add(Ders ders) {
		Session session = entityManager.unwrap(Session.class);
		session.save(ders);
		
	}

	@Override
	@Transactional
	public void del(Ders ders) {
		Session session = entityManager.unwrap(Session.class);
		Ders silinecekDers=session.get(Ders.class, ders.getId());
		session.delete(silinecekDers);
	}

	@Override
	@Transactional
	public void update(Ders ders) {
		Session session = entityManager.unwrap(Session.class);
		session.saveOrUpdate(ders);
		
	}
	
	

}
