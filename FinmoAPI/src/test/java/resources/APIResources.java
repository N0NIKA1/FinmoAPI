package resources;

public enum APIResources {
	
	CreatePayoutAPI("v1/payout"),
	GetPayoutDetailsAPI("v1/payout/payout_fc94026188c947739aeef6dbd6e4b664");
	private String resource;
	
	APIResources(String resource)
	{
		this.resource=resource;
	}
	
	public String getResource()
	{
		return resource;
	}

}
