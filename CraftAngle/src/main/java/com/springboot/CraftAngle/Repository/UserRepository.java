package com.springboot.CraftAngle.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springboot.CraftAngle.Entity.User;


public interface UserRepository extends JpaRepository<User, Long>  {

}
