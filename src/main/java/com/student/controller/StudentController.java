package com.student.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.student.dto.StudentDto;
import com.student.responce.ApiResponce;
import com.student.service.StudentIfc;

@RestController
@RequestMapping("/api/student/v1")
public class StudentController {

	private final StudentIfc studentIfc;

	public StudentController(StudentIfc studentIfc) {
		this.studentIfc = studentIfc;

	}

	@PostMapping("/")
	public ApiResponce addStudentData(@RequestBody StudentDto studentDto) {

		// studentIfc.addStudent(studentDto);
		System.out.println("Add Student details Successfully");
		return studentIfc.addStudent(studentDto);

	}

	@GetMapping("/getid/{id}")
	public ApiResponce getById(@PathVariable("id") int id) {
		return studentIfc.getById(id);

	}

	@GetMapping("/getall")
	public ApiResponce getAll() {

		return studentIfc.getAllStudent();
	}

	@DeleteMapping("/deleteStudent/{id}")
	public ApiResponce deleteById(@PathVariable("id") int id) {
		return studentIfc.deleteById(id);

	}
	@PutMapping("/updtaestudent/{id}")
	public ApiResponce updateStudentDta(@PathVariable("id")int id,@RequestBody StudentDto studentDto) {
		return studentIfc.updateStudentData(id, studentDto);
		
	}
}
