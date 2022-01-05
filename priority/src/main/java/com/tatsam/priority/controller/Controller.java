package com.tatsam.priority.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.tatsam.priority.entity.Area;
import com.tatsam.priority.entity.Priority;
import com.tatsam.priority.service.AreaService;
import com.tatsam.priority.service.PriorityService;

@RestController
public class Controller {
	
	@Autowired
	private AreaService aService;
	
	@Autowired
	private PriorityService pService;
	
	//gets priority areas
	@GetMapping("/areas")
	public List<Area> getAreas() {
		return this.aService.getAreas();
	}
	
	//sets a new area to database
	@PostMapping("/areas")
	public ResponseEntity<HttpStatus> setArea(@RequestBody Area area)
	{
		try
		{
			this.aService.setArea(area);
			return new ResponseEntity<>(HttpStatus.OK); 
		}
		catch(Exception e){
			return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
		}
	}
	
	//saves priority and satisfaction values for user into database
	@PostMapping("/priority")
	public ResponseEntity<HttpStatus> setPriority(@RequestBody Priority prior)
	{
		try
		{
			if(prior.getSatisfaction()<=5 && prior.getSatisfaction()>=1)
			{
				this.pService.setPriority(prior);
				return new ResponseEntity<>(HttpStatus.OK); 
			}
			return new ResponseEntity<>(HttpStatus.OK); 
		}
		catch(Exception e){
			return new ResponseEntity<>(HttpStatus.BAD_GATEWAY);
		}
	}
	
	@GetMapping("/priority")
	public List<Priority> getPriority()
	{
		return this.pService.getPriority();
	}
}
