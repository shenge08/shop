package cn.hdu.shop.service.impl;

import org.springframework.orm.hibernate3.HibernateTemplate;

import cn.hdu.shop.pojo.Student;

public class Demo {
	private HibernateTemplate hibernateTemplate;
	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}
	
	public void save(Student s){
		hibernateTemplate.save(s);
	}
}
