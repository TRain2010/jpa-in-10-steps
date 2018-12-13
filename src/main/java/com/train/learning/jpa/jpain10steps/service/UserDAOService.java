package com.train.learning.jpa.jpain10steps.service;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.train.learning.jpa.jpain10steps.entity.User;
@Service
@Repository
@Transactional
public class UserDAOService {
	
	@PersistenceContext
	private EntityManager entityManager;
	
	public long insert(User user) {
		
		// open Transaction
		entityManager.persist(user);
		
		return user.getId();
	}

}
