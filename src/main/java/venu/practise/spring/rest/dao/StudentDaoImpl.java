package venu.practise.spring.rest.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import venu.practise.spring.rest.constants.DataBaseQueryConstants;
import venu.practise.spring.rest.pojo.Student;

@Repository
public class StudentDaoImpl implements StudentDao {

	private static final Logger logger = LoggerFactory.getLogger(StudentDaoImpl.class);

	@Autowired
	private JdbcTemplate template;

	@Override
	public int insertStudents(Student student) {

		Object[] studentObj = new Object[] { student.getStId(), student.getStName(), student.getStPhone() };
		logger.info("Student object before inserting into database is :" + studentObj.toString());
		int rowsAffected = template.update(DataBaseQueryConstants.INSERT, studentObj);
		logger.info(rowsAffected + "has inserted in database");
		return rowsAffected;
	}

	@Override
	public List<Student> studentList() {

		List<Student> studentList = template.query(DataBaseQueryConstants.SELECT, new RowMapper<Student>() {

			@Override
			public Student mapRow(ResultSet rs, int rowNum) throws SQLException {
				Student st = new Student();
				st.setStId(rs.getInt(1));
				st.setStName(rs.getString(2));
				st.setStDob(rs.getDate(3));
				st.setStPhone(rs.getString(4));
				return st;
			}

		});

		return studentList;
	}

	@Override
	public int deletStudent(int id) {
		int row = template.update(DataBaseQueryConstants.DELETESTUDENT, id);
		return row;
	}

	@Override
	public int updateStudent(Student student) {
		Object[] studentObj = new Object[] { student.getStName(), student.getStPhone(), student.getStId() };
		int row = template.update(DataBaseQueryConstants.UPDATESTUDENT, studentObj);
		return row;
	}

}
