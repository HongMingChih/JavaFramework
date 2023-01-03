package Mainproject.Controller;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import Mainproject.Factory.Style1;
import Mainproject.Model.member;

public class testController {

	private static ApplicationContext a1=new ClassPathXmlApplicationContext("style1.xml");
	static Style1 s1=a1.getBean("STYLE1", Style1.class);
	
	public static void main(String[] args) {
		member m=new member("abcwww","qq","1234");
		
		s1.getMD().add(m);

	}

}
