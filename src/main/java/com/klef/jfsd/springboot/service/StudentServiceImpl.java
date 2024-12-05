package com.klef.jfsd.springboot.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.klef.jfsd.springboot.model.Student;
import com.klef.jfsd.springboot.repository.StudentRepository;

@Service
public class StudentServiceImpl implements StudentService
{

	@Autowired
	private StudentRepository studentRepository;
	
	@Override
	public String addStudent(Student s) 
	{
		studentRepository.save(s);
		return "Student Added Successfully";
	}

	@Override
	public String updateStudent(Student s) {
		Student student = studentRepository.findById(s.getId()).get();
		
		student.setName(s.getName());
		student.setGender(s.getGender());
		student.setDepartment(s.getDepartment());
		student.setCgpa(s.getCgpa());
		student.setEmail(s.getEmail());
		
		studentRepository.save(student);
		
		return "Student Updated Successfully";
		
	}

	@Override
	public String deleteStudent(int id) {
		Student student = studentRepository.findById(id).get();
		studentRepository.delete(student);
		return "Student Deleted Successfully";
	}

	@Override
	public Student viewStudentByID(int id) {
		Student student = studentRepository.findById(id).get();
		return student;
	}

	@Override
	public List<Student> viewAllStudents() {
		
		return studentRepository.findAll();
	}

}
