package com.javacourse.project.hibernateAndJpa.DataAccess;
import java.util.List;

import com.javacourse.project.hibernateAndJpa.Entities.User;

public interface IUserDal  {
	
	List<User> getAll();
	void update(User user);
	void delete (User user);
	void add (User user);
	User getById(int id);	

}
