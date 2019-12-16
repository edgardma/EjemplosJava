package pe.com.dyd.contacts.api;

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
	
	@RequestMapping(value="/contact", method=RequestMethod.POST)
	public Contact updateOrSave(@RequestBody Contact contact) {
		return contactService.save(contact);
	}
	
	@RequestMapping(value="/product", method=RequestMethod.GET)
	public Contact getByApi() {
		return new Contact(1L, "Edgard", "Marquez", "1111", "1");
	}
}
