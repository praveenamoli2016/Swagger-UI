package com.wuele8.swagger.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wuele8.swagger.model.Course;
import com.wuele8.swagger.repository.CourseRepository;

@Service
public class CourseService {
	@Autowired
	private CourseRepository repository;
	
	public String saveCourse(Course course) {
		repository.save(course);
		return "saved Course with id" + course.getCourseId();
	}
	
	public List<Course> getAllCourse() {
		return repository.findAll();
	}

	public List<Course> deleteCourseById(int courseId) {
		repository.deleteById(courseId);
		return repository.findAll();
	}
}
