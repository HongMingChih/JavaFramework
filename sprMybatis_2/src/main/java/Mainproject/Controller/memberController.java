package Mainproject.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import Mainproject.Mapper.memberDao;
import Mainproject.Model.member;
import jakarta.servlet.http.HttpServletRequest;

@RestController
@RequestMapping("member")
public class memberController {
	
	@Autowired//new 物件
	memberDao mp;
	
	@RequestMapping("add")
	public String add(HttpServletRequest request)
	{
		String Name=request.getParameter("name");
		String Username=request.getParameter("username");
		String Password=request.getParameter("password");
		
		mp.add(new member(Name,Username,Password));
		
		return "Success";
	}
	
	@RequestMapping("queryAll")
	public List<member> querryAll()
	{
		return mp.queryAll();
	}

}
