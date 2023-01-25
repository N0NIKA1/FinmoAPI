package pojo;

import java.util.HashMap;
import java.util.Map;

public class Individual {
	
	private String firstName;
	private String lastName;
	private AdditionalProperties additionalProperties;

	public String getFirstName() {
	return firstName;
	}

	public void setFirstName(String firstName) {
	this.firstName = firstName;
	}

	public String getLastName() {
	return lastName;
	}

	public void setLastName(String lastName) {
	this.lastName = lastName;
	}

		public AdditionalProperties getAdditionalProperties() {
		return this.additionalProperties;
		}
		
		public void setAdditionalProperty(AdditionalProperties getAdditionalProperties) {
		this.additionalProperties = getAdditionalProperties;
		}
}
