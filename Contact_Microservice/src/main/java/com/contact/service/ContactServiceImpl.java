package com.contact.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.contact.entity.Contact;
import com.contact.repository.ContactRepo;



@Service
public class ContactServiceImpl implements ContactService {

	@Autowired
	ContactRepo contactrepo;
	
	List<Contact> list = new ArrayList<>();

	@Override
	public List<Contact> getContactsOfUser(int userId) {
		
	  //fetching all the contacts from database
	  List<Contact> allUsersList = contactrepo.findAll();
	  
	  //Payload List to return the list
	  List<Contact> payloadList = new ArrayList();
	  
	  for(Contact targetContact: allUsersList)
	     if(targetContact.getUserId() == userId) {
	    	 payloadList.add(targetContact);
	     }
       return payloadList;
	}

	@Override
	public List<Contact> getAllcontacts() {
		
		return contactrepo.findAll();
	}

	@Override
	public void addcontact(Contact contact) {
		contactrepo.save(contact);
		
	}
	
	
	
	
}
