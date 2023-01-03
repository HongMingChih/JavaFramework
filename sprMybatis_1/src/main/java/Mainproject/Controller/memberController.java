package Mainproject.Controller;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import Mainproject.Factory.Style2;
@RestController
@RequestMapping("member")
public class memberController {
	private static ApplicationContext a=new ClassPathXmlApplicationContext("style2.xml");
	private static Style2 s=a.getBean("STYLE2",Style2.class);
	
	//切換登入頁Login.jsp
	@RequestMapping("login")
	public ModelAndView login()
	{
		ModelAndView modelandview=new ModelAndView("member/login");
		return modelandview;
	}
	
	
	//

}
