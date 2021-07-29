package org.study.DAO.service;

import org.springframework.data.jpa.repository.JpaRepository;

import org.study.model.Student;

public interface StudentRepository extends JpaRepository<Student, Integer> {

}
