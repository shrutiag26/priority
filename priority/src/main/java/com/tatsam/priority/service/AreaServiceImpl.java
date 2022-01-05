package com.tatsam.priority.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tatsam.priority.dao.AreaDao;
import com.tatsam.priority.entity.Area;

@Service
public class AreaServiceImpl implements AreaService {

	@Autowired
	private AreaDao aDao;
	
	@Override
	public List<Area> getAreas() {
		return aDao.findAll();
	}

	@Override
	public void setArea(Area area) {
		aDao.save(area);
	}

}
