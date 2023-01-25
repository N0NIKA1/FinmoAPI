package pojo;

import java.util.HashMap;
import java.util.Map;

public class Metadata {
	
	private String anyCustomRef;
	private AdditionalProperties additionalProperties;

	public String getAnyCustomRef() {
	return anyCustomRef;
	}

	public void setAnyCustomRef(String anyCustomRef) {
	this.anyCustomRef = anyCustomRef;
	}

		public AdditionalProperties getAdditionalProperties() {
		return this.additionalProperties;
		}
		
		public void setAdditionalProperty(AdditionalProperties getAdditionalProperties) {
		this.additionalProperties = getAdditionalProperties;
		}

}
