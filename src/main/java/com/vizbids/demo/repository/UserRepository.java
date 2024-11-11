package com.vizbids.demo.repository;
import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import com.vizbids.demo.model.User;

@Repository
public interface UserRepository extends JpaRepository<User,String>{

}
