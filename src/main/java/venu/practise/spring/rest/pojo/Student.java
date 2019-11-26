package venu.practise.spring.rest.pojo;

import java.util.Date;

public class Student {
	
	private int stId;
	private String stName;
	private Date stDob;
	private String stPhone;
	public int getStId() {
		return stId;
	}
	public void setStId(int stId) {
		this.stId = stId;
	}
	public String getStName() {
		return stName;
	}
	public void setStName(String stName) {
		this.stName = stName;
	}
	public Date getStDob() {
		return stDob;
	}
	public void setStDob(Date stDob) {
		this.stDob = stDob;
	}
	public String getStPhone() {
		return stPhone;
	}
	public void setStPhone(String stPhone) {
		this.stPhone = stPhone;
	}
	@Override
	public String toString() {
		return "Student [stId=" + stId + ", stName=" + stName + ", stDob=" + stDob + ", stPhone=" + stPhone + "]";
	}
	
}
