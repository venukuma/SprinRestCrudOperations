package venu.practise.spring.rest.constants;

public class DataBaseQueryConstants {

	public static final String INSERT = "insert into student(STID,STNAME,STDOB,STPHONE ) values(?,?,SYSDATE,?)";
	public static final String SELECT = "select * from student";
	public static final String DELETESTUDENT = "delete from student where stId=?";
	public static final String UPDATESTUDENT = "update student set stname=?,stPhone=? where stId=?";

}
