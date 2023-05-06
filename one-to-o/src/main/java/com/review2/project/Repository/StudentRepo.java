package com.review2.project.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.review2.project.Model.StudentModel;
@Repository
public interface StudentRepo extends JpaRepository<StudentModel, Integer> {

}