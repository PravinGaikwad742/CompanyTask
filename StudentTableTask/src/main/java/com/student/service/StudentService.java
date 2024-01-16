package com.student.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.student.dao.StudentRepository;
import com.student.entity.Student;
@Component
public class StudentService {
    @Autowired
	private StudentRepository repository;
	
	public List<Student> getAllStudent(){
        List<Student> list =(List<Student>) this.repository.findAll(); 
		return list;
	}	
	
	  
	//add Student
	public Student addStudent(Student stud)
	{
		Student student = this.repository.save(stud);
		return student;
	}
   //delete Student
	public void deleteStud(int roll_no)
	{
		this.repository.deleteById(roll_no);
	}
	//update Student
	public void updateStud(Student stud,int roll_no)
	{
		stud.setRoll_no(roll_no);
		this.repository.save(stud);
	}
}
