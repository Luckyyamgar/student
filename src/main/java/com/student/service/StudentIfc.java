package com.student.service;

import com.student.dto.StudentDto;
import com.student.responce.ApiResponce;

public interface StudentIfc {
	
	public ApiResponce addStudent(StudentDto studentDto);
	
	public ApiResponce getById(int id);
	
	public ApiResponce getAllStudent();
	
	public ApiResponce deleteById(int id);
	
	public ApiResponce updateStudentData(int id ,StudentDto student);

}
