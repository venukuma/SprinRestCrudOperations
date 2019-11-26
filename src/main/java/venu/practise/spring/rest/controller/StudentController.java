package venu.practise.spring.rest.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import venu.practise.spring.rest.constants.SpringRestUriConstants;
import venu.practise.spring.rest.pojo.Student;
import venu.practise.spring.rest.pojo.StudentResponse;
import venu.practise.spring.rest.service.StudentService;

@RestController
public class StudentController {

	private static final Logger logger = LoggerFactory.getLogger(StudentController.class);

	@Autowired
	private StudentService studentService;

	StudentResponse response = null;

	@RequestMapping(value = SpringRestUriConstants.SAVE_STUDENT, method = RequestMethod.POST)
	public StudentResponse saveStudents(@RequestBody Student student) {
		response = new StudentResponse();
		response = studentService.insertStudents(student);
		logger.info("Controller Resonse : {}", response.toString());
		return response;
	}

	@RequestMapping(value = SpringRestUriConstants.GET_STUDENTS, method = RequestMethod.GET)
	public StudentResponse getAllStudents() {
		response = new StudentResponse();
		response = studentService.getStudents();
		logger.info("Controller Resonse for getAllStudents : ", response.toString());
		return response;

	}

	@RequestMapping(value = SpringRestUriConstants.DELETE_STUDENT, method = RequestMethod.DELETE)
	public StudentResponse deleteStudent(@PathVariable("id") int stId) {
		logger.info("Path Variable for id --> {}", stId);
		response = new StudentResponse();
		response = studentService.deleteSTudent(stId);
		logger.info("Controller Response for delete student : ", response.toString());
		return response;

	}

	@RequestMapping(value = SpringRestUriConstants.UPDATE_STUDENT, method = RequestMethod.POST)
	public StudentResponse updateStudent(@RequestBody Student student) {
		logger.info("Path Variable for id --> {}", student);
		response = new StudentResponse();
		response = studentService.updateStudent(student);
		logger.info("Controller Response for delete student : ", response.toString());
		return response;

	}

}
