package com.tatsam.priority.service;

import java.util.List;

import com.tatsam.priority.entity.Priority;

public interface PriorityService {

	void setPriority(Priority prior);

	List<Priority> getPriority();

}
