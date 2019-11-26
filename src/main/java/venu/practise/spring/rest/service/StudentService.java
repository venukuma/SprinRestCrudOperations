package venu.practise.spring.rest.service;

import venu.practise.spring.rest.pojo.Student;
import venu.practise.spring.rest.pojo.StudentResponse;

public interface StudentService {
	
	public StudentResponse insertStudents(Student student);
	public StudentResponse getStudents();
	public StudentResponse deleteSTudent(int id);
	public StudentResponse updateStudent(Student student);

}
