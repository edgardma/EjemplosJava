package pe.com.dyd.contacts.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import pe.com.dyd.contacts.dto.Contact;

public interface ContactRepository extends JpaRepository<Contact, Long> {

}
