package cn.hdu.ssh;

import java.util.Date;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cn.hdu.shop.pojo.Student;
import cn.hdu.shop.service.impl.Demo;

public class SSHTest {
	@Test
	public void spring(){
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext-*.xml");
		Date date=(Date)context.getBean("date");
		System.out.println(date);
	}
	
	@Test
	public void hibernate(){
		System.out.println(HibernateSessionFactory.getConfiguration());
		//System.out.println(HibernateSessionFactory.getSessionFactory());
	//	System.out.println(HibernateSessionFactory.getSession());
	}
	
	@Test
	public void springHibernate(){
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext-*.xml");
		Demo demo = (Demo) context.getBean("demo");
		demo.save(new Student("chen"));
	}
}
