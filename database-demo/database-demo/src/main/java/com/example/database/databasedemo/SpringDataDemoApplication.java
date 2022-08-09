package com.example.database.databasedemo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.database.databasedemo.entity.Person;
import com.example.database.databasedemo.jdbc.PersonJdbcDao;
import com.example.database.databasedemo.jpa.PersonJpaRepository;
import com.example.database.databasedemo.springdata.PersonSpringDataRepository;

@SpringBootApplication
public class SpringDataDemoApplication implements CommandLineRunner {

	private Logger logger = LoggerFactory.getLogger(this.getClass());

	@Autowired
	PersonSpringDataRepository repository;

	public static void main(String[] args) {
		SpringApplication.run(SpringDataDemoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		logger.info("User id 1001 -> {} ", repository.findById(1001));
		logger.info("Inserting 1005 -> {}", 
				repository.save(new Person(1005, "Tara", "Meghalaya")));
		logger.info("Update 1003 -> {}", 
				repository.save(new Person(1003, "Abhimanyu", "Meghalaya")));
		
		repository.deleteById(1002);
		
		logger.info("All users -> {}", repository.findAll());

//		logger.info("All users ->{}", repository.findAll());
//		logger.info("Deleting 1002 -> No of Rows Deleted - {} ", repository.deleteById(1002));
//		logger.info("Inserting 1005 -> {}", repository.insert(new Person(1005, "Tara", "Meghalaya")));
//		logger.info("Update 1003 -> {}", repository.update(new Person(1003, "Abhimanyu", "Meghalaya")));

	}

}
