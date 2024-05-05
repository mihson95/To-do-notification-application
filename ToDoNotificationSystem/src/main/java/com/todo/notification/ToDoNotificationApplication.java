package com.todo.notification;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

/**
 * @author Rishikesh
 *
 */
@SpringBootApplication
@EnableJpaRepositories("com.todo.notification.model")
@ComponentScan(basePackages = { "com.todo.notification.model" })
@EntityScan("com.todo.notification.model")
public class ToDoNotificationApplication {

	public static void main(String[] args) {
		SpringApplication.run(ToDoNotificationApplication.class, args);
	}

}
