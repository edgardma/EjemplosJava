package pe.com.dyd.contacts.api;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import pe.com.dyd.contacts.dto.Contact;

@RestController
public class ContactsApi {
	
	@RequestMapping(value="/product", method=RequestMethod.GET)
	public Contact getByApi() {
		return new Contact(1L, "Edgard", "Marquez", "1111", "1");
	}
}
