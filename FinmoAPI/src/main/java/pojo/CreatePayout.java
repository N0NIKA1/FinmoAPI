package pojo;

public class CreatePayout {
	

		private Integer senderAmount;
		private String senderCurrency;
		private Integer beneficiaryAmount;
		private String beneficiaryCurrency;
		private String payoutMethodName;
		private PayoutMethodParam payoutMethodParam;
		private PayoutSenderParam payoutSenderParam;
		private PayoutBeneficiaryParam payoutBeneficiaryParam;
		private String purposeCode;
		private String organizationReferenceId;
		private Metadata metadata;
		private AdditionalProperties additionalProperties;
		
		public Integer getSenderAmount() {
		return senderAmount;
		}
		
		public void setSenderAmount(Integer senderAmount) {
		this.senderAmount = senderAmount;
		}
		
		public String getSenderCurrency() {
		return senderCurrency;
		}
		
		public void setSenderCurrency(String senderCurrency) {
		this.senderCurrency = senderCurrency;
		}
		
		public Integer getBeneficiaryAmount() {
		return beneficiaryAmount;
		}
		
		public void setBeneficiaryAmount(Integer beneficiaryAmount) {
		this.beneficiaryAmount = beneficiaryAmount;
		}
		
		public String getBeneficiaryCurrency() {
		return beneficiaryCurrency;
		}
		
		public void setBeneficiaryCurrency(String beneficiaryCurrency) {
		this.beneficiaryCurrency = beneficiaryCurrency;
		}
		
		public String getPayoutMethodName() {
		return payoutMethodName;
		}
		
		public void setPayoutMethodName(String payoutMethodName) {
		this.payoutMethodName = payoutMethodName;
		}
		
		public PayoutMethodParam getPayoutMethodParam() {
		return payoutMethodParam;
		}
		
		public void setPayoutMethodParam(PayoutMethodParam payoutMethodParam) {
		this.payoutMethodParam = payoutMethodParam;
		}
		
		public PayoutSenderParam getPayoutSenderParam() {
		return payoutSenderParam;
		}
		
		public void setPayoutSenderParam(PayoutSenderParam payoutSenderParam) {
		this.payoutSenderParam = payoutSenderParam;
		}
		
		public PayoutBeneficiaryParam getPayoutBeneficiaryParam() {
		return payoutBeneficiaryParam;
		}
		
		public void setPayoutBeneficiaryParam(PayoutBeneficiaryParam payoutBeneficiaryParam) {
		this.payoutBeneficiaryParam = payoutBeneficiaryParam;
		}
		
		public String getPurposeCode() {
		return purposeCode;
		}
		
		public void setPurposeCode(String purposeCode) {
		this.purposeCode = purposeCode;
		}
		
		public String getOrganizationReferenceId() {
		return organizationReferenceId;
		}
		
		public void setOrganizationReferenceId(String organizationReferenceId) {
		this.organizationReferenceId = organizationReferenceId;
		}
		
		public Metadata getMetadata() {
		return metadata;
		}
		
		public void setMetadata(Metadata metadata) {
		this.metadata = metadata;
		}
		
		public AdditionalProperties getAdditionalProperties() {
		return this.additionalProperties;
		}
		
		public void setAdditionalProperty(AdditionalProperties getAdditionalProperties) {
		this.additionalProperties = getAdditionalProperties;
		}
		

}
