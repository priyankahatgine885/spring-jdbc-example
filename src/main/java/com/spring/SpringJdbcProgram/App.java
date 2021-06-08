package com.spring.SpringJdbcProgram;
import java.util.List;
import java.util.Scanner;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.spring.SpringJdbcProgram.dao.StudentDaoImplement;

public class App {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("My program is started");
		ApplicationContext context = new ClassPathXmlApplicationContext("com/spring/SpringJdbcProgram/config.xml");
		StudentDaoImplement studentDaoImplement = context.getBean("studentDao", StudentDaoImplement.class);
		int result = studentDaoImplement.insert(new Student(14, "Payal Shete", "Tisangi"));
		System.out.println("student added..." + result);
		result = studentDaoImplement.update(14, "Tisangi");
		System.out.println("student updated..." + result);
		System.out.println("Enter student id : ");
		int id = sc.nextInt();
		result = studentDaoImplement.delete(id);
		System.out.println("student deleted..." + result);
		List<Student> students = studentDaoImplement.getStudents();
		for (Student record : students) {
			System.out.print("ID : " + record.getId());
			System.out.print(" Name : " + record.getName());
			System.out.println(" City : " + record.getCity());
		}
	}
}
