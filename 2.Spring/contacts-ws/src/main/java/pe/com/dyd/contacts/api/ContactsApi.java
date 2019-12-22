package pe.com.dyd.contacts.api;

import javax.validation.Valid;

import org.dozer.Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import pe.com.dyd.contacts.dto.Contact;
import pe.com.dyd.contacts.service.ContactService;

@RestController
public class ContactsApi {
	
	@Autowired
	ContactService contactService;
	
	@Autowired
	Mapper mapper;
	
	@RequestMapping(value="/contact", method=RequestMethod.POST)
	public ContactResponse updateOrSave(@RequestBody @Valid ContactRequest contactRequest) {
		Contact contact = mapper.map(contactRequest, Contact.class);
		Contact updatedContact = contactService.save(contact);
		ContactResponse contactResponse = mapper.map(updatedContact, ContactResponse.class);
		
		return contactResponse;
	}
	
	@RequestMapping(value="/product", method=RequestMethod.GET)
	public Contact getByApi() {
		return new Contact(1L, "Edgard", "Marquez", "1111", "1");
	}
}
