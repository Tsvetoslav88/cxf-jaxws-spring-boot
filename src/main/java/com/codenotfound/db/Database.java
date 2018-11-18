package com.codenotfound.db;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.codenotfound.entity.Student;
import com.codenotfound.repository.Repository;

@Component
public class Database {

	@Autowired
	private Repository repository;
	
	public List<Student> getStudents(){
		return repository.findAll();
	}
	
}
