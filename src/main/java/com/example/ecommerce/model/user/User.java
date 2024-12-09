package com.example.ecommerce.model.user;

public class User {
	private String userID;
	private String name;
	private String email;
	private String password;
	private Role role;
	private Address address;
	private FullName fullName;
	private Contact contact;

	public User() {
		// Default constructor
	}

	public User(String userID, String name, String email, String password, Role role, 
                Address address, FullName fullName, Contact contact) {
        this.userID = userID;
        this.name = name;
        this.email = email;
        this.password = password;
        this.role = role;
        this.address = address;
        this.fullName = fullName;
        this.contact = contact;
    }

	public String getUserID() {
		return this.userID;
	}

	public void setUserID(String userID) {
		this.userID = userID;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Role getRole() {
		return this.role;
	}

	public void setRole(Role role) {
		this.role = role;
	}

	public Address getAddress() {
		return this.address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public FullName getFullName() {
		return this.fullName;
	}

	public void setFullName(FullName fullName) {
		this.fullName = fullName;
	}

	public Contact getContact() {
		return this.contact;
	}

	public void setContact(Contact contact) {
		this.contact = contact;
	}
}