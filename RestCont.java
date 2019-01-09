package com.project;

import java.util.ArrayList;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestCont {
	@RequestMapping(value="/students/{name}",method=RequestMethod.GET)

	public ArrayList<Sample> student(@PathVariable("name")String sname)
	{
		ArrayList<Sample> al=new ArrayList<Sample>();
		Sample s1=new Sample();
		Sample s2=new Sample();
		Sample s3=new Sample();
		
		s1.setFname("Jayashree");
		s2.setFname("Nikhil");
		s3.setFname(sname);
		
		
		al.add(s1);
		al.add(s2);
		al.add(s3);
		
		return al;
	}
}
