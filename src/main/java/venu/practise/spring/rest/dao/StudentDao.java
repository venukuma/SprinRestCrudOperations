package venu.practise.spring.rest.dao;

import java.util.List;

import venu.practise.spring.rest.pojo.Student;

public interface StudentDao {
	
	public int insertStudents(Student student);
	public List<Student> studentList();
	public int deletStudent(int id);
	public int updateStudent(Student student);
	

}
