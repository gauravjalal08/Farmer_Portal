package com.example.entity;

import java.math.BigDecimal;
import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

//@Entity
//@Table(name="uw_policy_hr12")
public class UWPolicy {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "UW_POLICY_ID")
	private Long policyID;

	@Column(name = "POLICY_NUMBER")
	private String policyNumber;

	/**
	 * @return the policyNumber
	 */
	public String getPolicyNumber() {
		return policyNumber;
	}

	/**
	 * @param policyNumber
	 *            the policyNumber to set the value
	 */
	public void setPolicyNumber(String policyNumber) {
		this.policyNumber = policyNumber;
	}

	@Column(name = "UW_LOT_DECLARATION_ID")
	private Long declarationID;

	@Column(name = "FARMER_PARTY_ID")
	private Long farmerPartyID;

	@Column(name = "CHANNEL_PARTNER_PARTY_ID")
	private Long channelPartnerPartyID;

	@Column(name = "PC_PRODUCT_ID")
	private Long pcProductID;

	@Column(name = "EFFECTIVE_DATE")
	private Date effectiveDate;

	@Column(name = "EXPIRATION_DATE")
	private Date expirationDate;

	@Column(name = "POLICY_STATUS_CD")
	private String policyStatus;

	@Column(name = "STATUS_DT")
	private Date statusDate;

	@Column(name = "CANCLTN_REQUEST_DATE")
	private Date cancelReqDate;

	@Column(name = "CANCEL_EFFECTIVE_FROM_DATE")
	private Date cancelEffFrmDate;

	@Column(name = "PREMIUM_FREQUENCY_CD")
	private String premiumFrequency;

	@Column(name = "SUM_INSURED")
	private BigDecimal sumInsured;

	@Column(name = "TAX_AMOUNT")
	private BigDecimal taxAmount;
	
	@Column(name = "OPERATING_OFFICE_PARTY_ID")
	private Long operatingOfficePartyID;
	
	@Column(name = "CM_STATE_ID")
	private BigDecimal stateID;
	
	@Column(name = "CM_CROP_SEASON_ID")
	private BigDecimal seasonID;
	
	@Column(name = "CM_CROP_ID")
	private BigDecimal cropID;
  
	@Column(name = "CM_YEAR_ID")
	private BigDecimal yearID;
	
	@Column(name = "PREMIUM_AMOUNT")
	private BigDecimal premiumAmt;

	@Column(name = "CREATED_USER_ID")
	private Long createdUsrID;

	@Column(name = "CREATED_DT")
	private Date createdDate;
	
	
	/** The activation date. */
	@Column(name = "ACTIVATION_DATE")
	private Date activationDate;
	
	/** The lot ID. */
	@Column(name = "UW_LOT_ID")
	private Long uwLotId;
	
	public Long getUwLotId() {
		return uwLotId;
	}

	public void setUwLotId(Long uwLotId) {
		this.uwLotId = uwLotId;
	}

	/** The modified usr ID. */
	@Column(name = "MODIFIED_USER_ID")
	private Long modifiedUsrID;

	@Column(name = "MODIFIED_DT")
	private Date modifiedDate;
	
	/** The net premium amount. */
	@Column(name = "NET_PREMIUM_AMOUNT")
	private BigDecimal netPremiumAmount;
	
	@Column(name = "IS_COVERNOTE_GENERATED")
	private String isCoverNoteGenerated;
	
	@Column(name="COVERNOTE_GENERATED_DATE")
	private Date covernoteGenerateDate;
	
	@Column(name = "IS_POLICY_GENERATED")
	private String isPolicyGenerated;
	
	@Column(name="POLICY_GENERATED_DATE")
	private Date policyGenerateDate;

	@JsonIgnore
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "UW_LOT_PROPOSAL_ID", nullable = false)
	//private Proposal uwLotProposalId;

	/**
	 * @return the policyID
	 */
	public Long getPolicyID() {
		return policyID;
	}

	/**
	 * @param policyID
	 *            the policyID to set the value
	 */
	public void setPolicyID(Long policyID) {
		this.policyID = policyID;
	}

	/**
	 * @return the declarationID
	 */
	public Long getDeclarationID() {
		return declarationID;
	}

	/**
	 * @param declarationID
	 *            the declarationID to set the value
	 */
	public void setDeclarationID(Long declarationID) {
		this.declarationID = declarationID;
	}

	/**
	 * @return the farmerPartyID
	 */
	public Long getFarmerPartyID() {
		return farmerPartyID;
	}

	/**
	 * @param farmerPartyID
	 *            the farmerPartyID to set the value
	 */
	public void setFarmerPartyID(Long farmerPartyID) {
		this.farmerPartyID = farmerPartyID;
	}

	/**
	 * @return the channelPartnerPartyID
	 */
	public Long getChannelPartnerPartyID() {
		return channelPartnerPartyID;
	}

	/**
	 * @param channelPartnerPartyID
	 *            the channelPartnerPartyID to set the value
	 */
	public void setChannelPartnerPartyID(Long channelPartnerPartyID) {
		this.channelPartnerPartyID = channelPartnerPartyID;
	}

	/**
	 * @return the pcProductID
	 */
	public Long getPcProductID() {
		return pcProductID;
	}

	/**
	 * @param pcProductID
	 *            the pcProductID to set the value
	 */
	public void setPcProductID(Long pcProductID) {
		this.pcProductID = pcProductID;
	}

	/**
	 * @return the effectiveDate
	 */
	public Date getEffectiveDate() {
		return effectiveDate;
	}

	/**
	 * @param effectiveDate
	 *            the effectiveDate to set the value
	 */
	public void setEffectiveDate(Date effectiveDate) {
		this.effectiveDate = effectiveDate;
	}

	/**
	 * @return the expirationDate
	 */
	public Date getExpirationDate() {
		return expirationDate;
	}

	/**
	 * @param expirationDate
	 *            the expirationDate to set the value
	 */
	public void setExpirationDate(Date expirationDate) {
		this.expirationDate = expirationDate;
	}

	/**
	 * @return the policyStatus
	 */
	public String getPolicyStatus() {
		return policyStatus;
	}

	/**
	 * @param policyStatus
	 *            the policyStatus to set the value
	 */
	public void setPolicyStatus(String policyStatus) {
		this.policyStatus = policyStatus;
	}

	/**
	 * @return the statusDate
	 */
	public Date getStatusDate() {
		return statusDate;
	}

	/**
	 * @param statusDate
	 *            the statusDate to set the value
	 */
	public void setStatusDate(Date statusDate) {
		this.statusDate = statusDate;
	}

	/**
	 * @return the cancelReqDate
	 */
	public Date getCancelReqDate() {
		return cancelReqDate;
	}

	/**
	 * @param cancelReqDate
	 *            the cancelReqDate to set the value
	 */
	public void setCancelReqDate(Date cancelReqDate) {
		this.cancelReqDate = cancelReqDate;
	}

	/**
	 * @return the cancelEffFrmDate
	 */
	public Date getCancelEffFrmDate() {
		return cancelEffFrmDate;
	}

	/**
	 * @param cancelEffFrmDate
	 *            the cancelEffFrmDate to set the value
	 */
	public void setCancelEffFrmDate(Date cancelEffFrmDate) {
		this.cancelEffFrmDate = cancelEffFrmDate;
	}

	/**
	 * @return the premiumFrequency
	 */
	public String getPremiumFrequency() {
		return premiumFrequency;
	}

	/**
	 * @param premiumFrequency
	 *            the premiumFrequency to set the value
	 */
	public void setPremiumFrequency(String premiumFrequency) {
		this.premiumFrequency = premiumFrequency;
	}

	/**
	 * @return the sumInsured
	 */
	public BigDecimal getSumInsured() {
		return sumInsured;
	}

	/**
	 * @param sumInsured
	 *            the sumInsured to set the value
	 */
	public void setSumInsured(BigDecimal sumInsured) {
		this.sumInsured = sumInsured;
	}

	/**
	 * @return the taxAmount
	 */
	public BigDecimal getTaxAmount() {
		return taxAmount;
	}

	/**
	 * @param taxAmount
	 *            the taxAmount to set the value
	 */
	public void setTaxAmount(BigDecimal taxAmount) {
		this.taxAmount = taxAmount;
	}

	/**
	 * @return the operatingOfficePartyID
	 */
	public Long getOperatingOfficePartyID() {
		return operatingOfficePartyID;
	}

	/**
	 * @param operatingOfficePartyID the operatingOfficePartyID to set the value
	 */
	public void setOperatingOfficePartyID(Long operatingOfficePartyID) {
		this.operatingOfficePartyID = operatingOfficePartyID;
	}

	/**
	 * @return the premiumAmt
	 */
	public BigDecimal getPremiumAmt() {
		return premiumAmt;
	}

	/**
	 * @param premiumAmt
	 *            the premiumAmt to set the value
	 */
	public void setPremiumAmt(BigDecimal premiumAmt) {
		this.premiumAmt = premiumAmt;
	}

	/**
	 * @return the createdUsrID
	 */
	public Long getCreatedUsrID() {
		return createdUsrID;
	}

	/**
	 * @param createdUsrID
	 *            the createdUsrID to set the value
	 */
	public void setCreatedUsrID(Long createdUsrID) {
		this.createdUsrID = createdUsrID;
	}

	/**
	 * @return the createdDate
	 */
	public Date getCreatedDate() {
		return createdDate;
	}

	/**
	 * @param createdDate
	 *            the createdDate to set the value
	 */
	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

	/**
	 * @return the activationDate
	 */
	public Date getActivationDate() {
		return activationDate;
	}

	/**
	 * @param activationDate the activationDate to set the value
	 */
	public void setActivationDate(Date activationDate) {
		this.activationDate = activationDate;
	}

	/**
	 * @return the uwLotId
	 */
	

	/**
	 * Gets the modified usr ID.
	 *
	 * @return the modifiedUsrID
	 */
	public Long getModifiedUsrID() {
		return modifiedUsrID;
	}

	/**
	 * @param modifiedUsrID
	 *            the modifiedUsrID to set the value
	 */
	public void setModifiedUsrID(Long modifiedUsrID) {
		this.modifiedUsrID = modifiedUsrID;
	}

	/**
	 * @return the modifiedDate
	 */
	public Date getModifiedDate() {
		return modifiedDate;
	}

	/**
	 * @param modifiedDate
	 *            the modifiedDate to set the value
	 */
	public void setModifiedDate(Date modifiedDate) {
		this.modifiedDate = modifiedDate;
	}

	/**
	 * @return the uwLotProposalId
	 */
//	public Proposal getUwLotProposalId() {
//		return uwLotProposalId;
//	}

	/**
	 * @param uwLotProposalId
	 *            the uwLotProposalId to set the value
	 */
//	public void setUwLotProposalId(Proposal uwLotProposalId) {
//		this.uwLotProposalId = uwLotProposalId;
//	}

	public BigDecimal getStateID() {
    return stateID;
  }

  public void setStateID(BigDecimal stateID) {
    this.stateID = stateID;
  }

  public BigDecimal getSeasonID() {
    return seasonID;
  }

  public void setSeasonID(BigDecimal seasonID) {
    this.seasonID = seasonID;
  }

  public BigDecimal getCropID() {
    return cropID;
  }

  public void setCropID(BigDecimal cropID) {
    this.cropID = cropID;
  }

  public BigDecimal getYearID() {
    return yearID;
  }

  public void setYearID(BigDecimal yearID) {
    this.yearID = yearID;
  }

  public BigDecimal getNetPremiumAmount() {
	    return netPremiumAmount;
	  }

	  /**
	   * Sets the net premium amount.
	   *
	   * @param netPremiumAmount the netPremiumAmount to set the value
	   */
	  public void setNetPremiumAmount(BigDecimal netPremiumAmount) {
	    this.netPremiumAmount = netPremiumAmount;
	  }

  
	  public String getIsCoverNoteGenerated() {
		return isCoverNoteGenerated;
	}

	public void setIsCoverNoteGenerated(String isCoverNoteGenerated) {
		this.isCoverNoteGenerated = isCoverNoteGenerated;
	}

	public Date getCovernoteGenerateDate() {
		return covernoteGenerateDate;
	}

	public void setCovernoteGenerateDate(Date covernoteGenerateDate) {
		this.covernoteGenerateDate = covernoteGenerateDate;
	}

/**
   * 6:46:06 PM.
   */
//	public UWPolicy() {
//		super();
//	}

/**
 * @return the isPolicyGenerated
 */
public String getIsPolicyGenerated() {
	return isPolicyGenerated;
}

/**
 * @param isPolicyGenerated the isPolicyGenerated to set the value
 */
public void setIsPolicyGenerated(String isPolicyGenerated) {
	this.isPolicyGenerated = isPolicyGenerated;
}

/**
 * @return the policyGenerateDate
 */
public Date getPolicyGenerateDate() {
	return policyGenerateDate;
}

/**
 * @param policyGenerateDate the policyGenerateDate to set the value
 */
public void setPolicyGenerateDate(Date policyGenerateDate) {
	this.policyGenerateDate = policyGenerateDate;
}

}
	
	
	


