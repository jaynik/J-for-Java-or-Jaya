package com.project;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.beans.Student;
import com.data.StudentTemp;

@Controller
public class Example1 {
	@Autowired
	StudentTemp dao;
	@RequestMapping(value="/welcome",method=RequestMethod.GET)
	public String disform(Model m)
	{
		m.addAttribute("command", new Student());
		return "home";
	}
	
	/*public ModelAndView helloex()
	{
		return new ModelAndView("home");
	}*/
	
	
	@RequestMapping(value="/home",method=RequestMethod.POST)
	public String save(@ModelAttribute("stu")Student stu,Model m)
	{
		dao.save(stu);
		
		m.addAttribute("fname",stu.getFname());
		return "result";
	}
	
	@RequestMapping(value="/view")
	public String view(Model m)
	{
		List<Student> list=dao.show();
		m.addAttribute("list",list);
		return "view";
	}
	
	@RequestMapping(value="/delete/{id}",method=RequestMethod.GET)
	public String delete(@PathVariable int id)
	{
		dao.delete(id);
		return "home";
	}
	
	
	
	
	
	/*public String helloex1(@RequestParam("txt")String txt,ModelMap m)
	{
		//ModelMap m;
		//m.addAttribute("name1", "Success");
		m.addAttribute("name", txt);
		return "result";
	}*/
}
