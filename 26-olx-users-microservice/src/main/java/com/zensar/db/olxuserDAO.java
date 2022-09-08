package com.zensar.db;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface olxuserDAO extends JpaRepository <olxuserDAO, Integer> {
	olxuserDAO findByuserName(String userName);
	
	

}
