package com.klef.jfsd.springboot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.klef.jfsd.springboot.model.Student;
import com.klef.jfsd.springboot.service.StudentService;

import jakarta.servlet.http.HttpServletRequest;

@Controller
public class StudentController 
{
	@Autowired
	private StudentService studentService;
	private int id;
	
	@GetMapping("/")
	public ModelAndView home()
	{
		ModelAndView mv = new ModelAndView("home");
		return mv;
	}
	
	@GetMapping("/studentreg")
	public ModelAndView studentreg()
	{
		ModelAndView mv = new ModelAndView("studentreg");
		return mv;
	}
	
	@PostMapping("/addstudent")
	@ResponseBody
	public String addstudent(HttpServletRequest request)
	{
		int id =Integer.parseInt( request.getParameter("id"));
		String name = request.getParameter("name");
		String gender = request.getParameter("gender");
		String dept = request.getParameter("dept");
		float cgpa = Float.parseFloat(request.getParameter("cgpa")) ;
		String email = request.getParameter("email");
		
		Student s = new Student();
		
		s.setId(id);
		s.setName(name);
		s.setGender(gender);
		s.setDepartment(dept);
		s.setEmail(email);
		s.setCgpa(cgpa);
		
		return studentService.addStudent(s);
	}
	
	@GetMapping("/updatestudent")
	public ModelAndView updatestudent()
	{
		ModelAndView mv = new ModelAndView("updatestudent");
		return mv;
	}
	
	@PostMapping("/studentupdate")
	@ResponseBody
	public String studentupdate(HttpServletRequest request)
	{
		int id =Integer.parseInt( request.getParameter("id"));
		String name = request.getParameter("name");
		String gender = request.getParameter("gender");
		String dept = request.getParameter("dept");
		float cgpa = Float.parseFloat(request.getParameter("cgpa")) ;
		String email = request.getParameter("email");
		
		Student s = new Student();
		
		s.setId(id);
		s.setName(name);
		s.setGender(gender);
		s.setDepartment(dept);
		s.setEmail(email);
		s.setCgpa(cgpa);
		
		return studentService.updateStudent(s);
	}
	
	@GetMapping("/viewallstudents")
	public ModelAndView viewallstudents()
	{
		List<Student> students = studentService.viewAllStudents();
		ModelAndView mv = new ModelAndView("viewallstudents");
		mv.addObject("studentlist", students);
		
		
		return mv;
	}
	@GetMapping("/viewstudent")
	public ModelAndView viewstudent(@RequestParam("id") int id)
	{
		Student student = studentService.viewStudentByID(id);
		ModelAndView mv = new ModelAndView("viewstudent");
		mv.addObject("student",student);
		return mv;
	}
}
