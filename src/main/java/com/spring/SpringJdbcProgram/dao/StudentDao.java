package com.spring.SpringJdbcProgram.dao;
import java.util.ArrayList;
import java.util.List;
import com.spring.SpringJdbcProgram.Student;
public interface StudentDao {
	public int insert(Student student);
	public int update(int id, String city);
	public int delete(int bookId);
	public List<Student> getStudents();
}
