package com.springboot.CraftAngle.Controller;

import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.springboot.CraftAngle.Entity.Login;
import com.springboot.CraftAngle.Service.LoginService;



@Controller
public class LoginController {

	@Autowired
	private LoginService LogService;
	
	@GetMapping("/login")
	public ModelAndView login()
	{
		 ModelAndView mav = new  ModelAndView("login");
		 mav.addObject("login", new Login());
		 return mav;
	}
	
	@PostMapping("/login")
	public String userLogin(@ModelAttribute("login") Login login)
	{
		Login oauthUser= LogService.userLogin(login.getUsername(),login.getPassword());
		System.out.print(oauthUser);
		if(Objects.nonNull(oauthUser))
		{
			return "redirect:/";
		}
		else {
			return "redirect:/login";
		}
	}
}
