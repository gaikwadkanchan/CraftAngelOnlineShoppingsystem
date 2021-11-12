package com.springboot.CraftAngle.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.CraftAngle.Entity.Login;
import com.springboot.CraftAngle.Repository.LoginRepository;

@Service
public class LoginService {

	@Autowired
	private LoginRepository repo;
	
	public Login userLogin(String username, String password)
	{
		Login login = repo.findByUsernameAndPassword(username,password);
		return login;
	}
}