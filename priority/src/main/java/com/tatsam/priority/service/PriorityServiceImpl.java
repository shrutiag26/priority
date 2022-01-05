package com.tatsam.priority.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.tatsam.priority.dao.PriorityDao;
import com.tatsam.priority.entity.Priority;

@Service
public class PriorityServiceImpl implements PriorityService {

	@Autowired
	private PriorityDao pDao;
	
	@Override
	public void setPriority(Priority prior) {
		pDao.save(prior);
	}

	@Override
	public List<Priority> getPriority() {
		return pDao.findAll();
	}

}
