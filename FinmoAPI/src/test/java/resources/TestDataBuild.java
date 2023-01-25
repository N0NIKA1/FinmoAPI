package resources;

import java.util.ArrayList;
import java.util.List;

import pojo.CreatePayout;
import pojo.Individual;
import pojo.Metadata;
import pojo.PayoutBeneficiaryParam;
import pojo.PayoutMethodParam;
import pojo.PayoutSenderParam;


public class TestDataBuild {

	
	public CreatePayout createPayoutPayLoad()
	{
		CreatePayout cp =new CreatePayout();
		cp.setSenderAmount(10);
		cp.setSenderCurrency("AUD");
		cp.setBeneficiaryAmount(10);
		cp.setBeneficiaryCurrency("AUD");
		cp.setPayoutMethodName("au_bank_acct");
		
		
		PayoutMethodParam pmp = new PayoutMethodParam();
		pmp.setAdditionalProperty(null);
		
		PayoutSenderParam psp = new PayoutSenderParam();
		psp.setAdditionalProperty(null);
		
		
		PayoutBeneficiaryParam pbp = new PayoutBeneficiaryParam();
		pbp.setBsb("123456");
		pbp.setAccountNumber("12345678");
	
		
		Individual i = new Individual();
		i.setFirstName("John");
		i.setLastName("Doe");
		
		
		cp.setPurposeCode("SELF");
		cp.setOrganizationReferenceId("some-org-ref-2211");
		
		
		
		Metadata m = new Metadata();
		m.setAnyCustomRef("INV_123");
		
		
		return cp;
	}
	
	
	

}
