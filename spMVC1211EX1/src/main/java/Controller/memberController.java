package Controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import Factory.Style2;
import Model.member;
@RestController
@RequestMapping("member")
public class memberController {
	private static ApplicationContext a=new ClassPathXmlApplicationContext("style2.xml");
	private static Style2 s=a.getBean("STYLE2",Style2.class);
	
	//切換至login.jsp 頁面
	@RequestMapping("login")
	public ModelAndView login() {
		ModelAndView modelAndView=new ModelAndView("member/login");
		return modelAndView;
		
	}
	
	@RequestMapping("memberLogin")
	public ModelAndView memberLogin(HttpSession session, String username,String password)
	{
		System.out.println("name:"+username+", pasword:"+password);
		List<member>l=s.getMD().loginUser(username, password);
		
		if (l.size()==0) {
			ModelAndView modelAndView=new ModelAndView("member/login");
			return modelAndView;
		}
		member[]m=l.toArray(new member[l.size()]);
		session.setAttribute("M", m[0]);
		ModelAndView modelAndView=new ModelAndView("porder/index");
		return modelAndView;
	}
}
