package org.dnyanyog;

import org.dnyanyog.Config.ApplicationConfig;
import org.dnyanyog.component.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ApplicationMain {
	public static void main(String[]args) {
		// Spring run
		ApplicationContext spring = new AnnotationConfigApplicationContext(ApplicationConfig.class); // Container > jarguns
		
		Student app = spring.getBean(Student.class);  // student class object by Spring
		
		app.setFirstName("Vaibhav");
		app.getAddress().setCity("Pune");
		System.out.println(app.firstName);
		System.out.println(app.getAddress().getCity());
		
		System.out.println(".....................");
		
		Student std = new Student(); //java
		std.setFirstName("pankaj");
		std.getAddress().setCity("pune");
		System.out.println(std);
		System.out.println(std.getAddress().getCity());
	
	
	}
	}
