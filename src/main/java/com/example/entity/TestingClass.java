//package com.example.entity;
//
//public class TestingClass {
//	
//
//	
//	package com.example.controller;
//
//	import java.util.List;
//	import java.util.Map;
//	import java.util.Map.Entry;
//	import java.util.Set;
//
//	import org.springframework.beans.factory.annotation.Autowired;
//	import org.springframework.http.HttpStatus;
//	import org.springframework.http.ResponseEntity;
//	import org.springframework.stereotype.Controller;
//	import org.springframework.web.bind.annotation.GetMapping;
//	import org.springframework.web.bind.annotation.PostMapping;
//	import org.springframework.web.bind.annotation.RequestMapping;
//	import org.springframework.web.bind.annotation.RequestMethod;
//	import org.springframework.web.bind.annotation.RequestParam;
//	import org.springframework.web.bind.annotation.RestController;
//
//	import com.example.service.FarmerService;
//
//	//import com.example.service.FarmerService;
//
//	//@RestController
//	@Controller
//	//@RequestMapping("/api")
//	public class FarmerController {
//
//		private final FarmerService farmerService;
//
//	    @Autowired
//	    public FarmerController(FarmerService farmerService) {
//	        this.farmerService = farmerService;
//	    }
//	     
//	    
//		@RequestMapping("/show")
//	    public String home(){
//	        return "login";
//		}
//
//		
////	    @PostMapping("/query")
//	    @RequestMapping(value = "/query", method = RequestMethod.POST)
//	    public ResponseEntity<Map<String, List<Map<String, Object>>>> query(
//	            @RequestParam(value = "state") String state,
//	            @RequestParam(value = "season") String season,
//	            @RequestParam(value = "year") String year,
//	            @RequestParam(value = "product") String product,
//	            @RequestParam(value = "uniqueNumber") String uniqueNumber) {
//
//	        try {
//	            Map<String, List<Map<String, Object>>> data = farmerService.fetchData(state, season, year, product, uniqueNumber);
//	          
//	            System.out.println(data);
//	            if (data.isEmpty()) {
//	                return ResponseEntity.noContent().build(); // Return 204 No Content if no data found
//	            } else {
////	                return ResponseEntity.ok(data); // Return data if found
//	            	return "index";
//	            }
//	        } catch (Exception e) {
//	            e.printStackTrace();
//	            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build(); // Return 500 Internal Server Error
//	        }
//	    }
//	}
//
//
//
//}
