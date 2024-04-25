package com.example.service;


import org.springframework.boot.autoconfigure.SpringBootApplication;

//public class FarmerService {package com.gauravsinghjalal.Farmer.Portal;

import org.springframework.stereotype.Service;

import java.sql.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
@SpringBootApplication
public class FarmerService {

    private static final String URL = "jdbc:mysql://10.100.3.28:3164/SEWACORE";
    private static final String USER = "anubhavs";
    private static final String PASSWORD = "Anubhav@2022";

    public Map<String, List<Map<String, Object>>> fetchData(String state, String season, String year, String product, String uniqueNumber) {
        List<Map<String, Object>> mainResult = new ArrayList<>();
        List<Map<String, Object>> claimResult = new ArrayList<>();

        try (Connection connection = DriverManager.getConnection(URL, USER, PASSWORD)) {
            String mainQuery = "SELECT I.CM_STATE_NAME, L.PRODUCT_CD, M.CROP_SEASON_NAME, N.YEAR_CD, G.PARTY_NAME, C.POLICY_NUMBER, C.POLICY_STATUS_CD, " +
                    "F.ACCOUNT_HOLDER_NAME, K.CROP_NAME, D.AREA_INSURED_HA, B.NET_PREMIUM_AMOUNT, B.TOTAL_SUM_INSURED, F.IFS_CD, F.BANK_ACCOUNT_NUMBER, " +
                    "COALESCE(F.BANK_NAME, '') AS BANK_NAME, COALESCE(F.BRANCH_NAME, '') AS BRANCH_NAME " +
                    "FROM UW_LOT_H AS A " +
                    "JOIN UW_LOT_PROPOSAL_D AS B ON A.UW_LOT_ID = B.UW_LOT_ID " +
                    "JOIN UW_POLICY_H AS C ON B.UW_LOT_PROPOSAL_ID = C.UW_LOT_PROPOSAL_ID " +
                    "JOIN CM_STATE_MST AS I ON I.CM_STATE_ID = A.CM_STATE_ID " +
                    "JOIN PC_PRODUCT_H AS L ON L.PC_PRODUCT_ID = A.PC_PRODUCT_ID " +
                    "JOIN CM_CROP_SEASON_MST AS M ON M.CM_CROP_SEASON_ID = A.CM_CROP_SEASON_ID " +
                    "JOIN CM_YEAR_MST AS N ON N.CM_YEAR_ID = A.CM_YEAR_ID " +
                    "JOIN CM_PARTY_MST AS G ON G.CM_PARTY_ID = A.SENDER_PARTY_ID " +
                    "JOIN CM_PARTY_MST AS P ON P.CM_PARTY_ID = B.FARMER_PARTY_ID " +
                    "JOIN CM_PARTY_BANK_MST AS F ON F.CM_PARTY_BANK_ID = B.FARMER_PARTY_BANK_ID " +
                    "JOIN UW_LOT_PROPOSAL_LAND_D AS D ON B.UW_LOT_PROPOSAL_ID = D.UW_LOT_PROPOSAL_ID " +
                    "JOIN CM_PARTY_LAND_D AS E ON D.FARMER_PARTY_LAND_ID = E.CM_PARTY_LAND_ID " +
                    "JOIN CM_DISTRICT_MST AS J ON J.CM_DISTRICT_ID = E.CM_DISTRICT_ID " +
                    "JOIN CM_LOCTN_MST AS O ON O.CM_LOCTN_ID = B.VILLAGE_LOCTN_HIERARCHY_ID " +
                    "JOIN CM_CROP_MST AS K ON D.CM_CROP_ID = K.CM_CROP_ID " +
                    "WHERE C.CM_STATE_ID = ? AND A.CM_CROP_SEASON_ID = ? AND A.CM_YEAR_ID = ? AND A.PC_PRODUCT_ID = ? AND B.MOA_APPLICATION_NUMBER = ?";

            try (PreparedStatement mainStatement = connection.prepareStatement(mainQuery)) {
                mainStatement.setString(1, state);
                mainStatement.setString(2, season);
                mainStatement.setString(3, year);
                mainStatement.setString(4, product);
                mainStatement.setString(5, uniqueNumber);

                try (ResultSet mainResultSet = mainStatement.executeQuery()) {
                    while (mainResultSet.next()) {
                        Map<String, Object> row = new HashMap<>();
                        row.put("CM_STATE_NAME", mainResultSet.getObject("CM_STATE_NAME"));
                        row.put("PRODUCT_CD", mainResultSet.getObject("PRODUCT_CD"));
                        row.put("CROP_SEASON_NAME", mainResultSet.getObject("CROP_SEASON_NAME"));
                        row.put("YEAR_CD", mainResultSet.getObject("YEAR_CD"));
                        row.put("PARTY_NAME", mainResultSet.getObject("PARTY_NAME"));
                        row.put("POLICY_NUMBER", mainResultSet.getObject("POLICY_NUMBER"));
                        row.put("POLICY_STATUS_CD", mainResultSet.getObject("POLICY_STATUS_CD"));
                        row.put("ACCOUNT_HOLDER_NAME", mainResultSet.getObject("ACCOUNT_HOLDER_NAME"));
                        row.put("CROP_NAME", mainResultSet.getObject("CROP_NAME"));
                        row.put("AREA_INSURED_HA", mainResultSet.getObject("AREA_INSURED_HA"));
                        row.put("NET_PREMIUM_AMOUNT", mainResultSet.getObject("NET_PREMIUM_AMOUNT"));
                        row.put("TOTAL_SUM_INSURED", mainResultSet.getObject("TOTAL_SUM_INSURED"));
                        row.put("IFS_CD", mainResultSet.getObject("IFS_CD"));
                        row.put("BANK_ACCOUNT_NUMBER", mainResultSet.getObject("BANK_ACCOUNT_NUMBER"));
                        row.put("BANK_NAME", mainResultSet.getObject("BANK_NAME"));
                        row.put("BRANCH_NAME", mainResultSet.getObject("BRANCH_NAME"));

                        mainResult.add(row);
                    }
                }
            }

            String claimQuery = "SELECT CL_CLAIM_APPROVED_AMOUNT, CL_CLAIM_TYPE_CD, CLAIM_STATUS_CD ,CL_APPRV_DATE "+
                    "FROM CL_REGISTER_CLAIM_D " +
                    "WHERE CM_STATE_ID = ? AND CM_CROP_SEASON_ID = ? AND CM_YEAR_ID = ? AND PC_PRODUCT_ID = ? " +
                    "AND POLICY_NUMBER IN (SELECT POLICY_NUMBER FROM UW_POLICY_H as A " +
                    "JOIN UW_LOT_PROPOSAL_D as B ON A.UW_LOT_PROPOSAL_ID=B.UW_LOT_PROPOSAL_ID " +
                    "WHERE B.MOA_APPLICATION_NUMBER= ?)";

            try (PreparedStatement claimStatement = connection.prepareStatement(claimQuery)) {
                claimStatement.setString(1, state);
                claimStatement.setString(2, season);
                claimStatement.setString(3, year);
                claimStatement.setString(4, product);
                claimStatement.setString(5, uniqueNumber);

                try (ResultSet claimResultSet = claimStatement.executeQuery()) {
                    while (claimResultSet.next()) {
                        Map<String, Object> row = new HashMap<>();
                        row.put("CL_CLAIM_APPROVED_AMOUNT", claimResultSet.getObject("CL_CLAIM_APPROVED_AMOUNT"));
                        row.put("CL_CLAIM_TYPE_CD", claimResultSet.getObject("CL_CLAIM_TYPE_CD"));
                        row.put("CLAIM_STATUS_CD", claimResultSet.getObject("CLAIM_STATUS_CD"));
                        row.put("CL_APPRV_DATE", claimResultSet.getObject("CL_APPRV_DATE"));

                        claimResult.add(row);
                    }
                }
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        Map<String, List<Map<String, Object>>> result = new HashMap<>();
        result.put("mainResult", mainResult);
        result.put("claimResult", claimResult);

        return result;
    }
}

	



