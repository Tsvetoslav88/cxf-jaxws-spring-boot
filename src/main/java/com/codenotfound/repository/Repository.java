package com.codenotfound.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.codenotfound.entity.Student;

public interface Repository extends JpaRepository<Student, Integer>{

}
