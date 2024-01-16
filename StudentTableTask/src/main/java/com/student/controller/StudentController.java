package com.student.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import com.student.entity.Student;
import com.student.service.StudentService;

@RestController
public class StudentController {
	@Autowired
	private StudentService service;
	
       // Postman 
 //Diaplay all Student    
  @GetMapping("/student")
  public List<Student> getAllStudent()
  {
	return this.service.getAllStudent();
  }
  //Add Student
	  @PostMapping("/student")
      public ResponseEntity<Student> addStudent(@RequestBody Student student)
      {
    	  Student st=null;
    	  try
    	  {
			  st=this.service.addStudent(student);
			  System.out.println(student);
			  return ResponseEntity.status(HttpStatus.CREATED).build();
		  } catch (Exception e)
    	    {
			  e.printStackTrace();
		    }
    	  return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
      }
     //delete Student
	  @DeleteMapping("/student/{roll_no}")
      public void deleteStudent(@PathVariable("roll_no") int roll_no )
      {
    	  
		  this.service.deleteStud(roll_no);
			     
      }
	  //Update Student
	  @PostMapping("/student/{roll_no}")
      public Student updateStudent(@RequestBody Student student,@PathVariable("roll_no") int roll_no)
      {
			  this.service.updateStud(student, roll_no);
    	  return student;
      }
}//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   https://github.com/PravinGaikwad742/CompanyTask
