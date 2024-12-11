package com.example.ecommerce.model.user;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import java.util.List;

@Entity
@Table(name = "roles")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Role {
	@Id
	@GeneratedValue(strategy = GenerationType.UUID)
	@Column(name = "role_id")
	private String roleID;

	@Column(name = "role_name", unique = true)
	private String roleName;

	@JsonIgnore
	@OneToMany(mappedBy = "role")
	private List<User> users;

	public Role() {
	}

	public Role(String roleID, String roleName) {
		this.roleID = roleID;
		this.roleName = roleName;
	}

	public String getRoleID() {
		return this.roleID;
	}

	public void setRoleID(String roleID) {
		this.roleID = roleID;
	}

	public String getRoleName() {
		return this.roleName;
	}

	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}

	public List<User> getUsers() {
		return users;
	}

	public void setUsers(List<User> users) {
		this.users = users;
	}
}