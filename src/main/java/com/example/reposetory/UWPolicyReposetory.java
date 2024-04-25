//package com.example.reposetory;
//
//import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.data.jpa.repository.Query;
//import org.springframework.data.repository.query.Param;
//import org.springframework.stereotype.Repository;
//
//import com.example.entity.UWPolicy;
//
//
//@Repository
//public interface UWPolicyReposetory extends JpaRepository<UWPolicy, Long> {
//    @Query(value = "SELECT * FROM UW_POLICY_HR1 WHERE UW_POLICY_ID = :policyID", nativeQuery = true)
//	UWPolicy findBypolicyID(@Param("policyID") Long policyID);
//
//
//
//}
//
//
