package pojo;

import java.util.HashMap;
import java.util.Map;

public class PayoutBeneficiaryParam {
	
	
	private String bsb;
	private String accountNumber;
	private Individual individual;
	private AdditionalProperties additionalProperties;

	public String getBsb() {
	return bsb;
	}

	public void setBsb(String bsb) {
	this.bsb = bsb;
	}

	public String getAccountNumber() {
	return accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
	this.accountNumber = accountNumber;
	}

	public Individual getIndividual() {
	return individual;
	}

	public void setIndividual(Individual individual) {
	this.individual = individual;
	}

	public AdditionalProperties getAdditionalProperties() {
	return this.additionalProperties;
	}
		
	public void setAdditionalProperty(AdditionalProperties getAdditionalProperties) {
	this.additionalProperties = getAdditionalProperties;
	}

}
