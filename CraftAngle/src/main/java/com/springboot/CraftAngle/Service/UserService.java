package com.springboot.CraftAngle.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.springboot.CraftAngle.Entity.User;
import com.springboot.CraftAngle.Repository.UserRepository;

@Service
@Transactional
public class UserService {

	  @Autowired
	    private UserRepository userRepo;
	     
	    public List<User> listAll() {
	        return userRepo.findAll();
	    }
	     
	    public void save(User user) {
	    	userRepo.save(user);
	    }
	     
	    public User get(long userId) {
	        return userRepo.findById(userId).get();
	    }
	     
	    public void delete(long userId) {
	    	userRepo.deleteById(userId);
	    }
}
