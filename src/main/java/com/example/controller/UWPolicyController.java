//package com.example.controller;
// 
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//import org.springframework.stereotype.Controller;
//import
//org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestParam;
//
//import com.example.entity.UWPolicy;
//import com.example.service.UWPolicyService;
//
//@Controller
//public class UWPolicyController {
//	@Autowired
//	private UWPolicyService uwpolicyh1service;
//	
//	@GetMapping("/show") 
//	public String showPage() {
//    return "index" ;
//
//	}
//
//	@PostMapping("/getbyData")
//	public ResponseEntity<UWPolicy> getDataByUwId(@RequestParam("policyID") Long policyID) {
//		UWPolicy findByuwlotID = uwpolicyh1service.findByuwlotID(policyID);
//		System.out.println(findByuwlotID.getPolicyNumber());
//		System.out.println(findByuwlotID.getPolicyStatus());
//		return new ResponseEntity<>(findByuwlotID, HttpStatus.OK);
////		if (findByuwlotID != null) {
////			
////			Gson gson = new Gson();
////			String jsonData = gson.toJson(findByuwlotID);
////			System.out.println(jsonData);
////			return ResponseEntity.ok(jsonData);
////		} else {
////			System.out.println("Data not found by given id:");
////			return ResponseEntity.notFound().build();
////		}
//	}
//}
