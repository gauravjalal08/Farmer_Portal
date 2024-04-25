//package com.example.reposetory;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.jdbc.core.JdbcTemplate;
//
//import com.example.model.FarmerResult;
//
//public interface FarmerData {
//	public static final JdbcTemplate jdbctemp = new JdbcTemplate();
//	public FarmerResult getFarmerResult(String state,String product,String year,String uniqueNumber)
//	
//	    String  Sql= SELECT I.CM_STATE_NAME, L.PRODUCT_CD, M.CROP_SEASON_NAME, N.YEAR_CD, G.PARTY_NAME, C.POLICY_NUMBER, C.POLICY_STATUS_CD, 
//	            F.ACCOUNT_HOLDER_NAME, K.CROP_NAME, D.AREA_INSURED_HA, B.NET_PREMIUM_AMOUNT,B.TOTAL_SUM_INSURED
//	            FROM UW_LOT_H AS A
//	            JOIN UW_LOT_PROPOSAL_D AS B ON A.UW_LOT_ID = B.UW_LOT_ID
//	            JOIN UW_POLICY_H AS C ON B.UW_LOT_PROPOSAL_ID = C.UW_LOT_PROPOSAL_ID
//	            JOIN CM_STATE_MST AS I ON I.CM_STATE_ID = A.CM_STATE_ID
//	            JOIN PC_PRODUCT_H AS L ON L.PC_PRODUCT_ID = A.PC_PRODUCT_ID
//	            JOIN CM_CROP_SEASON_MST AS M ON M.CM_CROP_SEASON_ID = A.CM_CROP_SEASON_ID
//	            JOIN CM_YEAR_MST AS N ON N.CM_YEAR_ID = A.CM_YEAR_ID
//	            JOIN CM_PARTY_MST AS G ON G.CM_PARTY_ID = A.SENDER_PARTY_ID
//	            JOIN CM_PARTY_MST AS P ON P.CM_PARTY_ID = B.FARMER_PARTY_ID
//	            JOIN CM_PARTY_BANK_MST AS F ON F.CM_PARTY_BANK_ID = B.FARMER_PARTY_BANK_ID
//	            JOIN UW_LOT_PROPOSAL_LAND_D AS D ON B.UW_LOT_PROPOSAL_ID = D.UW_LOT_PROPOSAL_ID
//	            JOIN CM_PARTY_LAND_D AS E ON D.FARMER_PARTY_LAND_ID = E.CM_PARTY_LAND_ID
//	            JOIN CM_DISTRICT_MST AS J ON J.CM_DISTRICT_ID = E.CM_DISTRICT_ID
//	            JOIN CM_LOCTN_MST AS O ON O.CM_LOCTN_ID = B.VILLAGE_LOCTN_HIERARCHY_ID
//	            JOIN CM_CROP_MST AS K ON D.CM_CROP_ID = K.CM_CROP_ID
//	            WHERE C.CM_STATE_ID ='{state}' and A.CM_CROP_SEASON_ID ='{season}'  and A.CM_YEAR_ID ='{year}'  and A.PC_PRODUCT_ID='{product}' and B.MOA_APPLICATION_NUMBER='{unique_number}';
//      
//}
//}
