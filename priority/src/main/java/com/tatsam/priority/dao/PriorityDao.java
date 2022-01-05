package com.tatsam.priority.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.tatsam.priority.entity.Priority;
import com.tatsam.priority.entity.PriorityPK;

@Repository
public interface PriorityDao extends JpaRepository<Priority,PriorityPK> {

}
