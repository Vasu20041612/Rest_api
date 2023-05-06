package com.review2.project.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.review2.project.Model.StudentAddress;

public interface AddressRepo extends JpaRepository<StudentAddress, Integer> {

}