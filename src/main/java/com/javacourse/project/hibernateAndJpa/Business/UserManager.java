package com.javacourse.project.hibernateAndJpa.Business;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.javacourse.project.hibernateAndJpa.DataAccess.IUserDal;
import com.javacourse.project.hibernateAndJpa.Entities.User;

@Service
public class UserManager implements IUserService{

	private IUserDal userDal;
	
	//otomatik olarak git bak iuserdala uygun bir şey var mı sadece hibernate olduğu için şu an onu vericek.
	@Autowired
	public UserManager(IUserDal userDal) {
		this.userDal = userDal;
	}
	
	
	@Override
	@Transactional
	public List<User> getAll() {
		// TODO Auto-generated method stub
		return this.userDal.getAll();
	}

	

	@Override
	@Transactional
	public void update(User user) {
		// TODO Auto-generated method stub
		this.userDal.update(user);
		
	}

	@Override
	@Transactional
	public void delete(User user) {
		// TODO Auto-generated method stub
		this.userDal.delete(user);
		
	}

	@Override
	@Transactional
	public void add(User user) {
		// TODO Auto-generated method stub
		this.userDal.add(user);
		
	}
	
	@Override
	@Transactional
	public User getById (int id) {
		return this.userDal.getById(id);
	}

}
