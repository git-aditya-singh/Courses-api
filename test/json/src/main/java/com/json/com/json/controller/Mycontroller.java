package com.json.com.json.controller;


import java.util.List;

import com.json.com.json.entities.Course;
import com.json.com.json.services.CourseService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Mycontroller {
    @Autowired
    public CourseService courseService;
    // @GetMapping("/home")
    // public String Home(){
    //     return "this is home1";
    // }
    //get the courses
    @GetMapping("/Courses")
    public List<Course>getCourses(){
        return this.courseService.getCourses();
    }
    @GetMapping("/Courses/{courseID}")
    public Course getCourse(@PathVariable String courseID){
       return  this.courseService.getCourse(Long.parseLong(courseID));
    }
    @PostMapping(path="/Courses",consumes="application/json")
    public Course addCourse(@RequestBody Course course){
         return this.courseService.addCourse(course);
    }
    @PutMapping("/Courses")
    public Course putCourse(@RequestBody Course course){
        return this.courseService.putCourse(course);
    }
    @DeleteMapping("/Courses/{courseID}")
    public Course deleteCourse(@PathVariable String courseID){
        return this.courseService.deleteCourse(Long.parseLong(courseID));
    }
}
