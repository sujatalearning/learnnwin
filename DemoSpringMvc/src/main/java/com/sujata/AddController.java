package com.sujata;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.sujata.service.Service;

@Controller
public class AddController 
{

	@RequestMapping("/add")
	public ModelAndView add(HttpServletRequest req,HttpServletResponse res)
	{
		
		int i = Integer.parseInt(req.getParameter("t1"));
		int j = Integer.parseInt(req.getParameter("t2"));
		//int k=i+j;
		Service sr = new Service();
		int k = sr.add(i,j);
		
		ModelAndView mv = new ModelAndView();
		mv.setViewName("display.jsp");
		mv.addObject("result",k);
		return mv;
		
		
	//	System.out.println("adds two numbers");
	}
}
