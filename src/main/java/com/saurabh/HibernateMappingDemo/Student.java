package com.saurabh.HibernateMappingDemo;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import antlr.collections.List;

@Entity
public class Student 
{
	@Id
	private int rollno;
	private String name;
	private int marks;
//	@OneToOne
//	private Laptop laptop;
	
	
	//private List<Laptop> laptop=new ArrayList<Laptop>(); 
	@OneToMany
	private Set<Laptop> laptop=new HashSet<Laptop>();
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
	
	public Set<Laptop> getLaptop() {
		return laptop;
	}
	public void setLaptop(Set<Laptop> laptop) {
		this.laptop = laptop;
	}
	@Override
	public String toString() {
		return "Student [rollno=" + rollno + ", name=" + name + ", marks=" + marks + "]";
	}
	
	
}
