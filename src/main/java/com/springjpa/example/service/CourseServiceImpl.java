package com.springjpa.example.service;

import com.springjpa.example.Exceptions.EntityNotFoundException;
import com.springjpa.example.model.Course;
import com.springjpa.example.repository.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseServiceImpl implements CourseService {

    @Autowired
    private CourseRepository courseRepository;


    @Override
    public List<Course> getAllCourses() {
        return courseRepository.findAll();
    }

    @Override
    public Course updateCourse(Course course, Integer id) {
        Course existingCourse = courseRepository.findOne(id);
        existingCourse.setName(course.getName());
        existingCourse.setCredits(course.getCredits());
        existingCourse.setDescription(course.getDescription());
        existingCourse.setProfessor(course.getProfessor());
        return courseRepository.save(existingCourse);
    }

    @Override
    public Course addCourse(Course course) {
        return courseRepository.save(course);
    }

    @Override
    public void deleteCourse(Integer id) {
        courseRepository.delete(id);
    }

    @Override
    public Course getCourseById(Integer id) {
        Course course = courseRepository.findOne(id);
        if (course != null) {
            return courseRepository.findOne(id);
        } else {
            throw new EntityNotFoundException("Entity not found");
        }
    }
}
