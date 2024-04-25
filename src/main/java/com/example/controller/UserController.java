package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

//
//import java.util.List;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;

//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//import com.example.entity.User1;
//import com.example.service.User1Service;
//
//
//@Controller
//public class UserController {
//	
//	@Autowired
//	private User1Service userservice;
//	
//	@RequestMapping("/show")
//    public String home(){
//        return "login";
//	}
//}
//	@PostMapping("/user")
//	public ResponseEntity<User1> saveUser(@RequestBody User1 user){
//		User1 saveUser1 = userservice.saveUser1(user);
//		return new ResponseEntity<>(saveUser1, HttpStatus.OK);
//		
//	}
//	 @GetMapping("{id}")
//	    public ResponseEntity<User1> getUserById(@PathVariable("id") Long id) {
//		 User1 findByuserId1 = userservice.findByuserId1(id);
//	        return new ResponseEntity<>(findByuserId1, HttpStatus.OK);
//	    }
//
//	    @GetMapping
//	    public ResponseEntity<List<User1>> getAllUsers() {
//	    	List<User1> listUser = userservice.listUser();
//	        return new ResponseEntity<>(listUser, HttpStatus.OK);
//	    }
//	
//
//}
