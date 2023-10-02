package com.student.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.student.model.Student;

public interface StudentRepository extends JpaRepository<Student, Integer> {

//@Query("select*from school where stu_id=id",nativeQuery=true)
	@Query(value = "SELECT * FROM school WHERE stu_id = 0?", nativeQuery = true)

	Student findByStuId(int stu_id);
}
