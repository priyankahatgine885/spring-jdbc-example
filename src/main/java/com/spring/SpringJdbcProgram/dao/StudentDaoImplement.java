package com.spring.SpringJdbcProgram.dao;
import java.util.List;
import org.springframework.jdbc.core.JdbcTemplate;
import com.spring.SpringJdbcProgram.Student;
public class StudentDaoImplement implements StudentDao {
	private JdbcTemplate jdbcTemplate;
	public int insert(Student student) {
		 String query = "insert into students(id, name, city) values(?,?,?)";
		 int result = this.jdbcTemplate.update(query, student.getId(), student.getName(), student.getCity());
		return result;
	}
	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	public int update(int id, String city) {
			String query = "UPDATE students SET city = ? WHERE id = ?";
			int result = this.jdbcTemplate.update(query, city, id);
			return result;
	}
	public List<Student> getStudents() {
		 String query = "SELECT * FROM students";
		 List <Student> students = this.jdbcTemplate.query(query, new StudentMapper());
	      return students;
	}
	public int delete(int id) {
		String query = "DELETE FROM students where id = ?";
	     int result = this.jdbcTemplate.update(query, id);
		return result;
	}	

}
