package Controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import Factory.Style1;
import Model.member;

@RestController
public class testController {
	private static ApplicationContext a1 = new ClassPathXmlApplicationContext("style1.xml");
	static Style1 s1 = a1.getBean("STYLE1", Style1.class);

	public static void main(String[] args) {
		member m=new member("jerry","jerry@gmail.com","jerry123");
		s1.getMD().add(m);
	}
	
	
	@RequestMapping("a1")
	public String getA1()
	{
		
		return "hello";
	}
	
	@RequestMapping("a2")
	public ModelAndView getA2()
	{
		ModelAndView modelandview=new ModelAndView("hello");
		return modelandview;
	}
	@RequestMapping("a3")
	@ResponseBody
	public List<member> getA3()
	{
		List<member> l=new ArrayList();
		l.add(new member("a","q1","55"));
		l.add(new member("b","q2","55"));
		l.add(new member("c","q3","55"));
		
		return l;
	}
	
	@RequestMapping("addOrder")
	public ModelAndView add()
	{
		ModelAndView modelandview=new ModelAndView("porder/addOrder");
		return modelandview;
	}
	

}

