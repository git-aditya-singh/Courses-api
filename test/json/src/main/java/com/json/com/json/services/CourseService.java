package com.json.com.json.services;

import java.util.List;

import com.json.com.json.entities.Course;

public interface CourseService {
    public List<Course>getCourses();
    public Course getCourse(long courseId);
    public Course addCourse(Course course);
    public Course putCourse(Course course);
    public Course deleteCourse(long courseId);
}
