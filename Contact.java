package com.example.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "ContactDetails")
public class Contact {
	
	@Id
	@GeneratedValue
	@Column(name = "ContactId")
	private Integer contactId;
	
	@Column(name = "ContactName")
	private String contactName;
	
	@Column(name = "ContactNumber")
	private Long contactNumber;
	
	@Column(name = "ContactEmail")
	private String contactEmail;

	public Object getContactId() {
		// TODO Auto-generated method stub
		return null;
	}

	

}
