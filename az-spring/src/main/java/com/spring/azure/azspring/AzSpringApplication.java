package com.spring.azure.azspring;

import org.apache.catalina.core.ApplicationContext;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.spring.azure.dao.UserRepository;
import com.spring.azure.entity.User;

@SpringBootApplication
public class AzSpringApplication {

	public static void main(String[] args) {
		ApplicationContext applicationContex =  (ApplicationContext) SpringApplication.run(AzSpringApplication.class, args);
		
		
		UserRepository userRepository = ((BeanFactory) applicationContex).getBean(UserRepository.class);
		User user = new User();
		
		user.setName("Abhishek");
		user.setCity("Pune");
		user.setStatus("Java Developer");
		
		
		User user1 = userRepository.save(user);
		System.out.println(user1);
		
	}	
		

}
