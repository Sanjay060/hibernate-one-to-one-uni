package com.p1.demo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="instructor_detail")
public class InstructorDetail {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
@Column(name="id")
private int id;
@Column(name="courses")
private String courses;
@Column(name="hobby")
private String hobby;

public InstructorDetail()
{
	
}

public InstructorDetail(String courses, String hobby) {
	this.courses = courses;
	this.hobby = hobby;
}

public int getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
}

public String getCourses() {
	return courses;
}

public void setCourses(String courses) {
	this.courses = courses;
}

public String getHobby() {
	return hobby;
}

public void setHobby(String hobby) {
	this.hobby = hobby;
}

@Override
public String toString() {
	return "InstructorDetail [id=" + id + ", courses=" + courses + ", hobby=" + hobby + "]";
}





}
