package com.spring.fileupload.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.spring.fileupload.entity.UserFileUpload;

@Component
public class UserFileUploadDao {

	@Autowired
	private SessionFactory sessionFactory;
	
	@Transactional
	public int save(UserFileUpload u) {
		
		Session ses=sessionFactory.getCurrentSession();
		
		ses.save(u);
		
		return u.getUid();
	}
	
	@Transactional
	public List<UserFileUpload> list(){
		
		Session ses=sessionFactory.getCurrentSession();
		List<UserFileUpload> ulist=null;
		
		Query<UserFileUpload> query=ses.createQuery("from UserFileUpload",UserFileUpload.class);
		
		ulist=query.getResultList();
		
		return ulist;
	}
	
}
