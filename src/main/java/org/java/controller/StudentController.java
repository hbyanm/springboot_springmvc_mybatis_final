package org.java.controller;

import org.java.pojo.Student;
import org.java.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class StudentController {
	@Autowired
	private StudentService studentService;
	
	@ResponseBody
	@RequestMapping("/show")
	public String getStudent() throws Exception{
		Student student = studentService.getStudentById(1);
		return student.getId() + "," + student.getName() + "," + student.getAge() + "," +
			student.getGrade().getId() + "," + student.getGrade().getName();
	}
}
