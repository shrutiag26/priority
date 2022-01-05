package com.tatsam.priority.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Area {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private String area;
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getArea() {
		return area;
	}
	public void setArea(String area) {
		this.area = area;
	}
	
	@Override
	public String toString() {
		return "Area [id=" + id + ", area=" + area + "]";
	}
	
	public Area() {
		super();
		// TODO Auto-generated constructor stub
	}
}
