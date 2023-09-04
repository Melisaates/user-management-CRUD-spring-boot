package com.javacourse.project.hibernateAndJpa.DataAccess;

import java.util.List;

import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.javacourse.project.hibernateAndJpa.Entities.User;
import jakarta.persistence.EntityManager;


@Repository
public class hibernateUserDal implements IUserDal{
	
	
	private EntityManager entityManager;
	
	
	//Bu session tanımlıyor.
	@Autowired
	public hibernateUserDal(EntityManager entityManager) {
		super();
		this.entityManager = entityManager;
	}
	
	

	@Override
	@Transactional
	public List<User> getAll() {
		// TODO Auto-generated method stub
		Session session=entityManager.unwrap(Session.class);
		List<User> user=session.createQuery("from User",User.class).getResultList();
		return user;
		
		
	}

	@Override
	public void update(User user) {
		// TODO Auto-generated method stub
		Session session=entityManager.unwrap(Session.class);
		session.saveOrUpdate(user);
		
	}

	@Override
	public void delete(User user) {
		// TODO Auto-generated method stub
		
		Session session=entityManager.unwrap(Session.class);
		session.delete(user);
		
		
	}

	@Override
	public void add(User user) {
		// TODO Auto-generated method stub
		Session session=entityManager.unwrap(Session.class);
		session.saveOrUpdate(user);
		
	}
	
	public User getById(int id) {
		Session session=entityManager.unwrap(Session.class);
		User user=session.get(User.class, id);
		return user;
	}

}
