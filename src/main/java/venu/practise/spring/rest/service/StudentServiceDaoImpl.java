package venu.practise.spring.rest.service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import venu.practise.spring.rest.dao.StudentDao;
import venu.practise.spring.rest.pojo.Student;
import venu.practise.spring.rest.pojo.StudentResponse;

@Service
public class StudentServiceDaoImpl implements StudentService {

	private static final Logger logger = LoggerFactory.getLogger(StudentServiceDaoImpl.class);

	@Autowired
	private StudentDao studentDao;

	StudentResponse response;

	@Override
	public StudentResponse insertStudents(Student student) {
		response = new StudentResponse();
		int rowsAffected = studentDao.insertStudents(student);
		logger.info("No of rows affected for insert statement in studentServiceDaoImpl is: {}", rowsAffected);
		if (rowsAffected > 0) {
			response.setResponseCode(200);
			response.setResponseStatus("Success");
			response.setResponseMessage("Student Details inserted Successfully");
			logger.info("Response of Student object is : {}", response.toString());
		} else {
			response.setResponseCode(404);
			response.setResponseStatus("Failed");
			response.setResponseMessage("Failed to insert Student Details");
		}

		return response;
	}

	@Override
	public StudentResponse getStudents() {
		response = new StudentResponse();
		List<Student> stList = studentDao.studentList();
		if (stList != null) {
			response.setResponseCode(200);
			response.setResponseStatus("Success");
			response.setResponseMessage("Get the Student Details Successfully");
			response.setStudentList(stList);
		} else {
			response.setResponseCode(404);
			response.setResponseStatus("Failed");
			response.setResponseMessage("Failed to get the Student Details");
		}
		return response;
	}

	@Override
	public StudentResponse deleteSTudent(int id) {
		response = new StudentResponse();
		int rowsAffected = studentDao.deletStudent(id);

		logger.info("No of rows affected for delete statement in studentServiceDaoImpl is: {}", rowsAffected);
		if (rowsAffected > 0) {
			response.setResponseCode(200);
			response.setResponseStatus("Success");
			response.setResponseMessage("Student Details deleted Successfully");
			logger.info("Response of Student object is : {}", response.toString());
		} else {
			response.setResponseCode(404);
			response.setResponseStatus("Failed");
			response.setResponseMessage("Failed to delete Student Details");
		}

		return response;

	}

	@Override
	public StudentResponse updateStudent(Student student) {
		response = new StudentResponse();
		int rowsAffected = studentDao.updateStudent(student);

		logger.info("No of rows affected for update statement in studentServiceDaoImpl is: {}", rowsAffected);
		if (rowsAffected > 0) {
			response.setResponseCode(200);
			response.setResponseStatus("Success");
			response.setResponseMessage("Student Details updated Successfully");
			logger.info("Response of Student object is : {}", response.toString());
		} else {
			response.setResponseCode(404);
			response.setResponseStatus("Failed");
			response.setResponseMessage("Failed to delete Student Details");
		}

		return response;

	}

}
