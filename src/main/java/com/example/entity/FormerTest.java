//package com.example.entity;
//
//import java.sql.Connection;
//import java.sql.DriverManager;
//import java.sql.ResultSet;
//import java.sql.SQLException;
//import java.sql.Statement;
//import java.util.ArrayList;
//import java.util.HashMap;
//import java.util.List;
//import java.util.Map;
//import java.util.Scanner;
//
//public class FormerTest {
//	 private static final String URL = "jdbc:mysql://10.100.3.28:3164/SEWACORE";
//	    private static final String USER = "anubhavs";
//	    private static final String PASSWORD = "Anubhav@2022";
//
//	    public static void main(String[] args) {
//	        System.out.println("Application started");
//
//	        // Create a scanner object to take user input
//	        Scanner scanner = new Scanner(System.in);
//
//	        // Prompt user for input
//	        System.out.print("Enter state: ");
//	        String state = scanner.nextLine();
//
//	        System.out.print("Enter season: ");
//	        String season = scanner.nextLine();
//
//	        System.out.print("Enter year: ");
//	        String year = scanner.nextLine();
//
//	        System.out.print("Enter product: ");
//	        String product = scanner.nextLine();
//
//	        System.out.print("Enter unique number: ");
//	        String uniqueNumber = scanner.nextLine();
//
//	        // Close the scanner to prevent resource leak
//	        scanner.close();
//
//	        // Create a connection
//	        try (Connection connection = DriverManager.getConnection(URL, USER, PASSWORD)) {
//	            // Execute the main query
//	            String mainQuery = "SELECT I.CM_STATE_NAME, L.PRODUCT_CD, M.CROP_SEASON_NAME, N.YEAR_CD, G.PARTY_NAME, C.POLICY_NUMBER, C.POLICY_STATUS_CD, "
//	                    + "F.ACCOUNT_HOLDER_NAME, K.CROP_NAME, D.AREA_INSURED_HA, B.NET_PREMIUM_AMOUNT, B.TOTAL_SUM_INSURED "
//	                    + "FROM UW_LOT_H AS A " + "JOIN UW_LOT_PROPOSAL_D AS B ON A.UW_LOT_ID = B.UW_LOT_ID "
//	                    + "JOIN UW_POLICY_H AS C ON B.UW_LOT_PROPOSAL_ID = C.UW_LOT_PROPOSAL_ID "
//	                    + "JOIN CM_STATE_MST AS I ON I.CM_STATE_ID = A.CM_STATE_ID "
//	                    + "JOIN PC_PRODUCT_H AS L ON L.PC_PRODUCT_ID = A.PC_PRODUCT_ID "
//	                    + "JOIN CM_CROP_SEASON_MST AS M ON M.CM_CROP_SEASON_ID = A.CM_CROP_SEASON_ID "
//	                    + "JOIN CM_YEAR_MST AS N ON N.CM_YEAR_ID = A.CM_YEAR_ID "
//	                    + "JOIN CM_PARTY_MST AS G ON G.CM_PARTY_ID = A.SENDER_PARTY_ID "
//	                    + "JOIN CM_PARTY_MST AS P ON P.CM_PARTY_ID = B.FARMER_PARTY_ID "
//	                    + "JOIN CM_PARTY_BANK_MST AS F ON F.CM_PARTY_BANK_ID = B.FARMER_PARTY_BANK_ID "
//	                    + "JOIN UW_LOT_PROPOSAL_LAND_D AS D ON B.UW_LOT_PROPOSAL_ID = D.UW_LOT_PROPOSAL_ID "
//	                    + "JOIN CM_PARTY_LAND_D AS E ON D.FARMER_PARTY_LAND_ID = E.CM_PARTY_LAND_ID "
//	                    + "JOIN CM_DISTRICT_MST AS J ON J.CM_DISTRICT_ID = E.CM_DISTRICT_ID "
//	                    + "JOIN CM_LOCTN_MST AS O ON O.CM_LOCTN_ID = B.VILLAGE_LOCTN_HIERARCHY_ID "
//	                    + "JOIN CM_CROP_MST AS K ON D.CM_CROP_ID = K.CM_CROP_ID " + "WHERE C.CM_STATE_ID = '" + state
//	                    + "' AND A.CM_CROP_SEASON_ID = '" + season + "' " + "AND A.CM_YEAR_ID = '" + year
//	                    + "' AND A.PC_PRODUCT_ID = '" + product + "' " + "AND B.MOA_APPLICATION_NUMBER = '"
//	                    + uniqueNumber + "'";
//	            Statement mainStatement = connection.createStatement();
//	            ResultSet mainResultSet = mainStatement.executeQuery(mainQuery);
//
//	            List<Map<String, Object>> mainResult = new ArrayList<>();
//	            if (mainResultSet.next()) {
//	                Map<String, Object> row = new HashMap<>();	            
//	                row.put("CM_STATE_NAME", mainResultSet.getObject("CM_STATE_NAME"));
//	                row.put("PRODUCT_CD", mainResultSet.getObject("PRODUCT_CD"));
//	                // Add more columns as needed
//	                mainResult.add(row);
//	                // Execute the claim query
//	                String claimQuery = "SELECT CL_CLAIM_APPROVED_AMOUNT, CL_CLAIM_TYPE_CD, CLAIM_STATUS_CD "
//	                        + "FROM CL_REGISTER_CLAIM_D "
//	                        + "WHERE CM_STATE_ID = '" + state + "' AND CM_CROP_SEASON_ID = '" + season
//	                        + "' AND CM_YEAR_ID = '" + year + "' AND PC_PRODUCT_ID = '" + product
//	                        + "' AND POLICY_NUMBER IN (SELECT POLICY_NUMBER FROM UW_POLICY_H as A "
//	                        + "JOIN UW_LOT_PROPOSAL_D as B ON A.UW_LOT_PROPOSAL_ID=B.UW_LOT_PROPOSAL_ID "
//	                        + "WHERE B.MOA_APPLICATION_NUMBER='" + uniqueNumber + "')";
//	                Statement claimStatement = connection.createStatement();
//	                ResultSet claimResultSet = claimStatement.executeQuery(claimQuery);
//
//	                List<Map<String, Object>> claimResult = new ArrayList<>();
//	                while (claimResultSet.next()) {
//	                    // Populate claimResult with the claim query results
//	                    // Assuming CL_REGISTER_CLAIM_D has columns like 'CL_CLAIM_APPROVED_AMOUNT', 'CL_CLAIM_TYPE_CD', etc.
//	                    Map<String, Object> claimRow = new HashMap<>();
//	                    claimRow.put("CL_CLAIM_APPROVED_AMOUNT", claimResultSet.getObject("CL_CLAIM_APPROVED_AMOUNT"));
//	                    claimRow.put("CL_CLAIM_TYPE_CD", claimResultSet.getObject("CL_CLAIM_TYPE_CD"));
//	                    claimRow.put("CLAIM_STATUS_CD", claimResultSet.getObject("CLAIM_STATUS_CD"));
//	                    // Add more columns as needed
//	                    claimResult.add(claimRow);
//	                }
//
//	                // Call the renderTemplate method with mainResult and claimResult
//	                renderTemplate(uniqueNumber, mainResult, claimResult);
//	            } else {
//	                System.out.println("No records found for the provided unique number.");
//	            }
//	        } catch (SQLException e) {
//	            e.printStackTrace();
//	        }
//	        System.out.println("Application end");
//	    }
//
//	    private static void renderTemplate(String uniqueNumber, List<Map<String, Object>> mainResult,
//	            List<Map<String, Object>> claimResult) {
//	        // Implement the renderTemplate method according to your requirements
//	        // You can print or process the mainResult and claimResult here
//	        System.out.println("Rendering template...");
//	        // For example, printing the results
//	        System.out.println("Main result:");
//	        for (Map<String, Object> row : mainResult) {
//	            System.out.println(row);
//	        }
//	        System.out.println("Claim result:");
//	        for (Map<String, Object> row : claimResult) {
//	            System.out.println(row);
//	        }
//	    }
//	}
//		
//	
