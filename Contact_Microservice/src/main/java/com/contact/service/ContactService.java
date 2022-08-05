package com.contact.service;

import java.util.List;
import java.util.Optional;

import com.contact.entity.Contact;

public interface ContactService {

	public void addcontact(Contact contact);
	public List<Contact> getContactsOfUser(int userId);
	List<Contact> getAllcontacts();
}
