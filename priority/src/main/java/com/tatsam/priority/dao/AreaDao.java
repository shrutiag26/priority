package com.tatsam.priority.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tatsam.priority.entity.Area;

@Repository
public interface AreaDao extends JpaRepository<Area,Long> {

}