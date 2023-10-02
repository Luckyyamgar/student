package com.student.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.student.dto.StudentDto;
import com.student.model.Student;
import com.student.repository.StudentRepository;
import com.student.responce.ApiResponce;

@Service
public class StudentService implements StudentIfc {

	private StudentRepository studentRepository;

	public StudentService(StudentRepository studentRepository) {
		this.studentRepository = studentRepository;
	}

	@Override
	public ApiResponce addStudent(StudentDto studentDto) {
		// TODO Auto-generated method stub
		try {

			if (studentDto != null) {

				Student student = new Student();

				student.setFirstName(studentDto.getFirstName());
				student.setEmail(studentDto.getEmail());
				student.setLastName(studentDto.getLastName());
				student.setMobileNo(studentDto.getMobileNo());
				studentRepository.save(student);

				return new ApiResponce(" Student Add Data Successfully  ", true, student);

			} else {
				return new ApiResponce("can't add Student data", false, null);
			}
		} catch (Exception e) {
			// TODO: handle exception

			return new ApiResponce(e.getMessage(), false, null);

		}
	}

	@Override
	public ApiResponce getById(int id) {
		// TODO Auto-generated method stub
		Student student = studentRepository.findById(id).get();

		try {
			if (student != null) {

				return new ApiResponce("Get By StudentId Successfull", true, student);
			} else {
				return new ApiResponce("StudentId not found", false, null);
			}

		} catch (Exception e) {
			return new ApiResponce(e.getMessage(), false, null);
		}

	}

	public ApiResponce getAllStudent() {

		List<Student> student = studentRepository.findAll();
		return new ApiResponce("Get All Student Data Successfully", true, student);
	}

	@Override
	public ApiResponce deleteById(int id) {

		try {
			studentRepository.deleteById(id);

			return new ApiResponce("Delete student id successfull", true, id);
		} catch (Exception e) {
			return new ApiResponce("Student id not found", false, null);
		}

	}

	@Override
	public ApiResponce updateStudentData(int id, StudentDto studentDto) {
		try {
			if (studentDto != null) {

				//Student student = studentRepository.findByStuId(id);//this is use for native Query for Sql Data BAse
				
				Student student=studentRepository.findById(id).get();

				student.setEmail(studentDto.getEmail());
				student.setFirstName(studentDto.getFirstName());
				student.setLastName(studentDto.getLastName());
				student.setMobileNo(studentDto.getMobileNo());

				studentRepository.save(student);
				return new ApiResponce("Student data update Successfully", true, student);
			} else {
				return new ApiResponce("student id not found", false, null);
			}

		} catch (Exception e) {
			return new ApiResponce(e.getMessage(), false, null);
		}

	}

}
