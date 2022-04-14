package com.json.com.json.services;


import java.util.*;

import com.json.com.json.entities.Course;

import org.springframework.stereotype.Service;
@Service
public class CourseServiceimpl implements CourseService{
    List<Course>list;
    @Override
    public List<Course> getCourses() {
        return list;
    }

    public CourseServiceimpl() {
        list=new ArrayList<Course>();
        list.add(new Course(14,"javacore course","this code contains basic of java"));
        list.add(new Course(17,"springboot course","creating restapi using springboot"));
        
    }

    @Override
    public Course getCourse(long courseId) {
        Course c=null;
        for(Course course:list){
            if(course.getId()==courseId){
                c=course;
                break;
            }
        }
        return c;
    }

    @Override
    public Course addCourse(Course course) {
        list.add(course);
        return course;
    }

    @Override
    public Course putCourse(Course course) {
        Course c=null;
        for(Course courseitr:list){
            if(courseitr.getId()==course.getId()){
                courseitr.title=course.title;
                courseitr.description=course.description;
                c=courseitr;
                break;
            }
        }
        return c;
    }

    @Override
    public Course deleteCourse(long courseId) {
        Course c=null;
        for(Course course:list){
            if(course.getId()==courseId){
                c=course;
                list.remove(course);
                break;
            }
        }
        return c;
    }
    
}
