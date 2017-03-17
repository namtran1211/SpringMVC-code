package com.project.dao.impl;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

import com.project.dao.UserDao;
import com.project.model.User;

@Repository
public class UserDaoImpl implements UserDao {
	
	private SessionFactory sessionFactory;

	public User findByUserName(String userName) {
		List<User> user = new ArrayList<User>();
		user = sessionFactory.getCurrentSession().createQuery("from User where userName = ?").setParameter(0,userName).list();
		if (user.size() > 0) {
			return user.get(0);
		}else return null;
	}

	public User findByUserId(int id) {		
		List<User> user = new ArrayList<User>();
		user = sessionFactory.getCurrentSession().createQuery("from User where userId = ?").setParameter(0,id).list();
		if (user.size() > 0) {
			return user.get(0);
		}else return null;
	}

}
