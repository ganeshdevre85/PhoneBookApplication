package com.example.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.example.Entity.Contact;
import com.example.Repository.ContactRepository;



@Service
public class ContactServiceImpl implements ContactService {
	
	private ContactRepository repository;
	
	public ContactServiceImpl(ContactRepository repository) {
		this.repository=repository;
	}

	@Override
	public boolean saveContact(Contact contact) {
		Contact saveObj = repository.save(contact);
		
		return saveObj.getContactId()!=null;
		
	}

	@Override
	public List<Contact> getAllContacts() {
		List<Contact> findAll = repository.findAll();
		return findAll;
	}

	@Override
	public Contact getContactById(Integer contactId) {
		Optional<Contact> findById = repository.findById(contactId);
		if(findById.isPresent()) {
			return findById.get();
		}
		
		return null;
	}

	@Override
	public boolean deleteContactById(Integer contactId) {
		boolean isDeleted = false;
		try {
			repository.deleteById(contactId);
			isDeleted=true;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return isDeleted;
	}

}
