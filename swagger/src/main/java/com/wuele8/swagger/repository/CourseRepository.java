package com.wuele8.swagger.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.wuele8.swagger.model.Course;

public interface CourseRepository extends JpaRepository<Course, Integer> {

}
