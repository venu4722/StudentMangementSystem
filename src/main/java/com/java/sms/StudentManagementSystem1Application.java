package com.java.sms;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.java.sms.entity.Student;
import com.java.sms.repository.StudentRepository;

@SpringBootApplication
public class StudentManagementSystem1Application implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(StudentManagementSystem1Application.class, args);
		
		
		
	}
	
	@Autowired
	private StudentRepository studentRepository;
	

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
//		Student student1=new Student("Ramesh","Dasari","rm@gmail.com");
//		studentRepository.save(student1);
//		Student student2=new Student("Venu","Nakkella","nvenu7272@gmail.com");
//		studentRepository.save(student2);
//		Student student3=new Student("Uday","Nagaram","ud12@gmail.com");
//		studentRepository.save(student3);
		
		
	}

}
