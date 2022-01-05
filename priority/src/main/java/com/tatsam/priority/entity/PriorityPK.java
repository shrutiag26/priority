package com.tatsam.priority.entity;

import java.io.Serializable;
import lombok.EqualsAndHashCode;

@SuppressWarnings("serial")
@EqualsAndHashCode
public class PriorityPK implements Serializable{
	
	private long userId;
	private long areaId;
	
	public PriorityPK(long userId, long areaId) {
		super();
		this.userId = userId;
		this.areaId = areaId;
	}
	
	public PriorityPK() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public long getUserId() {
		return userId;
	}
	public long getAreaId() {
		return areaId;
	}
}
