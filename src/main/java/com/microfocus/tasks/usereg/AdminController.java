package com.microfocus.tasks.usereg;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AdminController {
	@Autowired
	private AdminRepository adminRepository;
	@PostMapping(path="/login") 
	  public @ResponseBody String addNewAdmin
	  (@RequestParam String username, 
 	   @RequestParam String password)
	  {
		    Admin n = new Admin();
		    
		    n.setUsername(username);
		    n.setPassword(password);
		    
		    
		    adminRepository.existsById(12);
		    
		    return "Admin";
}
	}
