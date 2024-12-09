package com.example.ecommerce.model.user;

import java.util.ArrayList;

public class Role {
	private String roleID;
	private String roleName;
	public ArrayList<User> user = new ArrayList<User>();

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
}