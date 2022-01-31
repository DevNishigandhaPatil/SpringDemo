package com.hib.pro.SpringDemo;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.PathResource;
import org.springframework.core.io.Resource;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		 AbstractApplicationContext context=new
		 ClassPathXmlApplicationContext("contextConfig.xml");
		 Address a=context.getBean("address1", Address.class);
		 System.out.println(a);
		// context.registerShutdownHook();
//     Employee e= context.getBean("employee1", Employee.class);
//        System.out.println(e);       
//    Employee e1=context.getBean("employee1",Employee.class);
//        System.out.println(e1);
//        
//        Student s1=context.getBean("student1",Student.class);
//       System.out.println(s1);

//		Resource r = new ClassPathResource("contextConfig.xml");
//		BeanFactory fc = new XmlBeanFactory(r);
//		Student s2 = context.getBean("student1", Student.class);
//	System.out.println(s2);
//		Student s3 = fc.getBean("student1", Student.class);
//		System.out.println(s3);

	}
}
