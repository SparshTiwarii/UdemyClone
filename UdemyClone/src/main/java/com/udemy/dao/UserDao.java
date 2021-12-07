package com.udemy.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.udemy.model.User;

@Repository
public class UserDao {
	@Autowired
	private HibernateTemplate hibernateTemplate;
	public int saveUser(User user) {
		Integer i = (Integer) this.hibernateTemplate.save(user);
		return i;
	}
}
