package com.example.database.databasedemo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.database.databasedemo.entity.Person;
import com.example.database.databasedemo.jdbc.PersonJdbcDao;

//@SpringBootApplication
public class SpringJdbcDemoApplication implements CommandLineRunner {

	private Logger logger = LoggerFactory.getLogger(this.getClass());

	@Autowired
	PersonJdbcDao dao;

	public static void main(String[] args) {
		SpringApplication.run(SpringJdbcDemoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		logger.info("All users ->{}", dao.findAll());
		logger.info("User id 1001 -> {} ", dao.findById(1001));
		logger.info("Deleting 1002 -> No of Rows Deleted - {} ", dao.deleteById(1002));
//		logger.info("Inserting 1005 -> {}", dao.insert(new Person(1005, "Tara", "Meghalaya")));
//		logger.info("Update 1003 -> {}", dao.update(new Person(1003, "Abhimanyu", "Meghalaya")));
	}

}
