package com.spring.SpringJdbcProgram.dao;
import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.jdbc.core.RowMapper;
import com.spring.SpringJdbcProgram.Student;
public class StudentMapper implements RowMapper{
	public Student mapRow(ResultSet rs, int rowNum) throws SQLException {
		Student student = new Student();
		student.setId(rs.getInt("id"));
		student.setName(rs.getString("name"));
		student.setCity(rs.getString("city"));
		return student;
	}

}
