package com.zohocrm.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zohocrm.entities.Contact;
import com.zohocrm.repositories.ContactRepository;


@Service	
public class ContactServicesImpl implements ContactService {

	@Autowired
	private ContactRepository contactRepo;

	@Override
	public void saveContact(Contact contact) {
		contactRepo.save(contact);
		
	}

	@Override
	public List<Contact> findAllContact() {
		
		return null;
	}

	@Override
	public Contact getContact(long id) {
	
		return null;
	}
}
