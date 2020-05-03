package com.microfocus.tasks.usereg;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
	@Autowired
		private UserRepository userRepo;
		@PostMapping(path="/adduser") 
		  public @ResponseBody String addNewUser 
		  (@RequestParam String fname, 
	   	   @RequestParam String lname,
	   	   @RequestParam String email,
	   	   @RequestParam String maritalstatus,
	   	   @RequestParam String city,
	   	   @RequestParam String state,
	   	   @RequestParam String country,
	   	   @RequestParam Integer mobile,
	   	   @RequestParam Integer zipcode,
	   	   @RequestParam Integer dob,
	   	   @RequestParam String gender
	   	) {
		    User n = new User();
		    
		    n.setFirstName(fname);
		    n.setLastName(lname);
		    n.setEmail(email);
		    n.setGender(gender);
		    n.setDob(dob);
		    n.setPhoneNumber(mobile);
		    n.setMartialStatus(maritalstatus);
		    n.setCity(city);
		    n.setState(state);
		    n.setCountry(country);
		    n.setZipcode(zipcode);
		    userRepo.save(n);
		    return "User Successfully Registered";
		  }
		
		@GetMapping(path="/users")
		  public @ResponseBody Iterable<User> getAllUsers() {
		    // To return JSON or XML with the users
		    return userRepo.findAll();
		  }
}
