package venu.practise.spring.rest.pojo;

import java.util.List;

public class StudentResponse {
	
	private int responseCode;
	private String responseStatus;
	private String responseMessage;
	private List<Student> studentList;
	private Student student;
	public int getResponseCode() {
		return responseCode;
	}
	public void setResponseCode(int responseCode) {
		this.responseCode = responseCode;
	}
	public String getResponseStatus() {
		return responseStatus;
	}
	public void setResponseStatus(String responseStatus) {
		this.responseStatus = responseStatus;
	}
	public String getResponseMessage() {
		return responseMessage;
	}
	public void setResponseMessage(String responseMessage) {
		this.responseMessage = responseMessage;
	}
	public List<Student> getStudentList() {
		return studentList;
	}
	public void setStudentList(List<Student> studentList) {
		this.studentList = studentList;
	}
	public Student getStudent() {
		return student;
	}
	public void setStudent(Student student) {
		this.student = student;
	}
	@Override
	public String toString() {
		return "StudentResponse [responseCode=" + responseCode + ", responseStatus=" + responseStatus
				+ ", responseMessage=" + responseMessage + ", studentList=" + studentList + "]";
	}
	
}
