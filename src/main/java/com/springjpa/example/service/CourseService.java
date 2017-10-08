package com.springjpa.example.service;

import com.springjpa.example.model.Course;

import java.util.List;


public interface CourseService {

    List<Course> getAllCourses();

    Course updateCourse(Course course, Integer id);

    Course addCourse(Course course);

    void deleteCourse(Integer id);

    Course getCourseById(Integer id);
}
