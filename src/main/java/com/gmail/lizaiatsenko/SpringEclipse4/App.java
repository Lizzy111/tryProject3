package com.gmail.lizaiatsenko.SpringEclipse4;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
		Student student = (Student) context.getBean("student");
		student.setName("Liza");
		StudentDAO studentDAO = new StudentDAO();
		studentDAO.saveStudent(student);

	}
}
