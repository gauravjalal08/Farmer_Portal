package com.example.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class FarmerResult {
	
	    private String stateName;
	    private String productCode;
	    private String cropSeasonName;
	    private int year;
	    private String partyName;
	    private String policyNumber;
	    private String policyStatusCode;
	    private String accountHolderName;
	    private String cropName;
	    private double areaInsuredHa;
	    private double netPremiumAmount;
	    private double totalSumInsured;


}
