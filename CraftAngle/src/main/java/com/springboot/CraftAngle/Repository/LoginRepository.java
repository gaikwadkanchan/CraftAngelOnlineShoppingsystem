package com.springboot.CraftAngle.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.springboot.CraftAngle.Entity.Login;

public interface LoginRepository extends JpaRepository<Login, Long>{
	Login findByUsernameAndPassword(String username, String password);

}
