package com.contact.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Contact {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    private int contactId;
    private String email;
    private String contactName;
    private int userId;
 
    public Contact() {
    	
    }
    
    
    
    

	public Contact(String email, String contactName, int userId) {
		super();
		this.email = email;
		this.contactName = contactName;
		this.userId = userId;
	}





	public Contact(int contactId, String email, String contactName, int userId) {
		super();
		this.contactId = contactId;
		this.email = email;
		this.contactName = contactName;
		this.userId = userId;
	}



	public int getContactId() {
		return contactId;
	}

	public void setContactId(int contactId) {
		this.contactId = contactId;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getContactName() {
		return contactName;
	}

	public void setContactName(String contactName) {
		this.contactName = contactName;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}





	@Override
	public String toString() {
		return "Contact [contactId=" + contactId + ", email=" + email + ", contactName=" + contactName + ", userId="
				+ userId + "]";
	}
	
	
    
}
