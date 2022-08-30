package com.jpa.test;
 
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.jpa.test.dao.StudentRepository;
import com.jpa.test.entity.Student;

@SpringBootApplication
public class JpaProjectCrudOperationsApplication {

	public static void main(String[] args) {
		ApplicationContext context=SpringApplication.run(JpaProjectCrudOperationsApplication.class, args);
		
		StudentRepository stdRepo=context.getBean(StudentRepository.class);
		//student-1
		/*
		 * Student std1=new Student();
		 * 
		 * std1.setStdId(1); std1.setStdName("johny"); std1.setBranch("CSE");
		 * std1.setCollege("JNTU HYDERABAD"); std1.setSemester("4th");
		 * 
		 * 
		 * //student -2 Student std2=new Student();
		 * 
		 * std2.setStdId(4); std2.setStdName("rohit"); std2.setBranch("MECH");
		 * std2.setCollege("BPUT "); std2.setSemester("8th");
		 * 
		 * 
		 * 
		 * //student-3 Student std3=new Student();
		 * 
		 * std3.setStdId(5); std3.setStdName("blak"); std3.setBranch("CSE");
		 * std3.setCollege("JNTU HYDERABAD"); std3.setSemester("4th");
		 * 
		 * 
		 * //student -4
		 * 
		 * Student std4=new Student();
		 * 
		 * std4.setStdId(1); std4.setStdName("mohit"); std4.setBranch("CSE");
		 * std4.setCollege("BHOPAL UNIVERSITY"); std4.setSemester("6th");
		 * 
		 * 
		 * 
		 * List<Student> list=List.of(std1,std2,std3,std4);
		 * 
		 * stdRepo.saveAll(list);
		 * 
		 * System.out.println("data stored sucessfully");
		 */
	    
	    //Retrieving data from database
	    
	    Iterable<Student> result=stdRepo.findAll();
	    result.forEach(student->{System.out.println(student);});
	
	}

}
