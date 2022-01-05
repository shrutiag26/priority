package com.tatsam.priority.entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="Priority")
@IdClass(PriorityPK.class)
public class Priority {
	
	@Id
	private long userId;
	@Id
	private long areaId;
	private long priority;
	private long satisfaction;
	
	@OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "areaId", referencedColumnName = "id", insertable = false, updatable = false)
    private Area area;
	
	public Area getArea() {
		return area;
	}
	public void setArea(Area area) {
		this.area = area;
	}
	public long getUserId() {
		return userId;
	}
	public void setUserId(long userId) {
		this.userId = userId;
	}
	public long getAreaId() {
		return areaId;
	}
	public void setAreaId(long areaId) {
		this.areaId = areaId;
	}
	public long getPriority() {
		return priority;
	}
	public void setPriority(long priority) {
		this.priority = priority;
	}
	public long getSatisfaction() {
		return satisfaction;
	}
	public void setSatisfaction(long satisfaction) {
		this.satisfaction = satisfaction;
	}
	
	@Override
	public String toString() {
		return "Priority [userId=" + userId + ", areaId=" + areaId + ", priority=" + priority + ", satisfaction="
				+ satisfaction + ", area=" + area + "]";
	}
	
	public Priority() {
		super();
		// TODO Auto-generated constructor stub
	}
}
