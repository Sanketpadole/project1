package com.example.project.Service;

import java.util.List;

import com.example.project.entities.Course;





public interface CourseService {
	
	

	public List<Course> getCourses();
	
	public Course addCourse(Course course);

	public Course updateCourse(Course course);
	
	public void deleteCourse();
}
