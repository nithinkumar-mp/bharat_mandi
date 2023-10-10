package com.bharatmandi.cms.dto;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonInclude(value = Include.NON_NULL)
public class Users {

	private int userId;
	private String firstName;
	private String lastName;
	private String roleName;
	private String organizationName;
	private List<Users> reportingUsers;
	
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
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
	public String getRoleName() {
		return roleName;
	}
	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}
	public String getOrganizationName() {
		return organizationName;
	}
	public void setOrganizationName(String organizationName) {
		this.organizationName = organizationName;
	}
	public List<Users> getReportingUsers() {
		return reportingUsers;
	}
	public void setReportingUsers(List<Users> reportingUsers) {
		this.reportingUsers = reportingUsers;
	}
	
	@Override
	public String toString() {
		return "Users [userId=" + userId + ", firstName=" + firstName + ", lastName=" + lastName + ", roleName="
				+ roleName + ", organizationName=" + organizationName + ", reportingUsers=" + reportingUsers + "]";
	}
	
	
}
