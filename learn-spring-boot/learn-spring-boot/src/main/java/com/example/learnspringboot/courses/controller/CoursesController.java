package com.example.learnspringboot.courses.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.learnspringboot.courses.bean.Course;

@RestController
public class CoursesController {
//http://localhost:8080/courses
	@GetMapping("/courses")
	public List<Course> getAllCourses(){
		return Arrays.asList(new Course(1,"Learn Microservices", "example"),
				new Course(2,"Learn Full Stack with Angular and React", "Code with Shubham"));
	}
//http://localhost:8080/courses/1
	@GetMapping("/courses/1")
	public Course getCourseDetails(){
		return new Course(1,"Learn Microservices", "CodeLearn");
	}
	
}
