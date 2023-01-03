package Controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import Model.porder;

@RestController
@RequestMapping("porder")
public class porderController {
		
		@RequestMapping("add")
		public ModelAndView add()
		{
			ModelAndView modelandview=new ModelAndView("porder/addOrder");
//			modelandview.addObject("message","hello world");
			return modelandview;
		}

		@RequestMapping("confirm")
		public ModelAndView confirm()
		{
			
			ModelAndView modelandview=new ModelAndView("porder/confirm");
			return modelandview;
		}
		
		@RequestMapping("porderIndex")
		public ModelAndView porderIndex()
		{
			ModelAndView modelandview=new ModelAndView("porder/index");
			return modelandview;
		}
		@RequestMapping("addOrder")
		public ModelAndView addOrder()
		{
			ModelAndView modelandview=new ModelAndView("porder/addOrder");
			return modelandview;
		}
		@RequestMapping("query")
		public ModelAndView query()
		{
			ModelAndView modelandview=new ModelAndView("porder/query");
			return modelandview;
		}
		
		
		@RequestMapping("update")
		public ModelAndView update()
		{
			ModelAndView modelandview=new ModelAndView("porder/update");
			return modelandview;
		}
		@RequestMapping("delete")
		public ModelAndView delete()
		{
			ModelAndView modelandview=new ModelAndView("porder/delete");
			return modelandview;
		}
		
		@GetMapping("getTest")
		public String getTest()
		{
			return "get";
		}
		
		@PostMapping("test1")
		public String test1(String name ,String password)
		{
			return "name: "+name+"password: "+password;
		}
		

		@PostMapping("test2")
		public String test2(HttpServletRequest request)
		{
			String x=request.getParameter("name");
			String y=request.getParameter("password");
			
			return "name: "+x+", pasword: "+y;
		}
		
		@RequestMapping("test3/{name}/{password}")
		public String test3(@PathVariable String name,@PathVariable("name") String password)
		{
			return "name:"+name+", pasword:"+password;
		}
		

		@PostMapping("test4")
		public String test4(@RequestParam String name, @RequestParam String password)
		{
			return "name:"+name+", pasword:"+password;
		}
		
		@RequestMapping("test5")
		@ResponseBody
		public List<porder> getTest5(){
			List<porder> l=new ArrayList();
			
			l.add(new porder("a1",1,1));
			l.add(new porder("a2",1,1));
			l.add(new porder("a3",1,1));
			l.add(new porder("a4",1,1));
			
			return l;
		}
		
	}


