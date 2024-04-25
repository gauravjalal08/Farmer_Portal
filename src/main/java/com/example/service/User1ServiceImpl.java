//package com.example.service;
//
//import java.util.List;
//import java.util.Optional;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import com.example.entity.User1;
//import com.example.reposetory.User1Reposetory;
//
//
//@Service
//public class User1ServiceImpl implements User1Service {
//	
//	@Autowired
//	private User1Reposetory userRepo;
//
//	@Override
//	public User1 saveUser1(User1 user) {
//		return userRepo.save(user);
//		
//		
//	}
//
//	@Override
//	public List<User1> listUser() {
//		List<User1> allUser = userRepo.findAll();
//		return allUser;
//	}
//
//	@Override
//	public User1 findByuserId1(Long id) {
//		Optional<User1> findById = userRepo.findById(id);
//		User1 user = findById.get();
//		return user;
//	}
//
//	
//	}
//
//
