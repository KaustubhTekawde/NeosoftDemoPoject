package com.example.demo;

import com.example.demo.model.Department;
import com.example.demo.model.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.kafka.KafkaProperties;
import org.springframework.data.jpa.repository.JpaRepository;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);

//		Configuration configuration = new Configuration().configure().addAnnotatedClass(Employee.class).addAnnotatedClass(Department.class);
//		SessionFactory sessionFactory = configuration.buildSessionFactory();
//		Session session = sessionFactory.openSession();
//		session.beginTransaction();
//
//		Department d1 = session.get(Department.class, 1);
//
//		System.out.println(d1.getName());
	}
}
