package pe.com.dyd.contacts.api;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

public class ContactRequest {
	private Long id;
	
	@NotNull(message="El nombre es requerido")
	@Size(min=2, max=30, message="El nombre debe tener entre {min} y {max} caracteres")
	private String firstName;
	
	private String lastName;
	
	@Pattern(regexp="^\\+[0-9]*$", message="El número de teléfono solo puede tener digitos iniciando con el simbolo +")
	private String phoneNumber;
	private String mail;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getMail() {
		return mail;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}
	
}
