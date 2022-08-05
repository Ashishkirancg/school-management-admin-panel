package com.contact.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.contact.entity.Contact;
import com.contact.repository.ContactRepo;
import com.contact.service.ContactService;

@RestController
@RequestMapping("/contact")
public class ContactController {

	@Autowired
	ContactService contactservice;
	
	@PostMapping("/addcontact")
	public void addcontact(@RequestBody Contact contact)
	{
		System.out.println("------------------------------------------------------");
		System.out.println(contact);
		 contactservice.addcontact(contact);		
	}
	 @GetMapping("/contactid/{id}")
	    public List<Contact> getContact(@PathVariable("id") int id)
	    {
	    	List<Contact> contact= contactservice.getContactsOfUser(id);
			return contact;
	    }
	 
	 @GetMapping("/allcontacts")
	    public List<Contact> getAllContact()
	    {
	    	List<Contact> contact= contactservice.getAllcontacts();
			return contact;
	    }
}
