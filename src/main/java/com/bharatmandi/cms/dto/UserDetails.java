package com.bharatmandi.cms.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="USER_DETAILS")
public class UserDetails {

	@Id
	@Column(name="USER_ID")
	private int userId;
	@Column(name="FIRST_NAME")
	private String firstName;
	@Column(name="LAST_NAME")
	private String lastName;
	@Column(name="EMAIL_ID")
	private String emailId;
	@Column(name="CREATE_DATE")
	private String createDate;
	@Column(name="MODIFIED_DATE")
	private String modifiedDate;
	@Column(name="STATUS")
	private int status;
	@Column(name="PASSWORD")
	private String password;
	@Column(name="REPORTS_TO")
	private int reportsTo;
	@OneToOne
	@JoinColumn(name="organizationId")
	private Organizations organization;
	@OneToOne
	@JoinColumn(name="roleId")
	private Roles roles;
	
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
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public String getCreateDate() {
		return createDate;
	}
	public void setCreateDate(String createDate) {
		this.createDate = createDate;
	}
	public String getModifiedDate() {
		return modifiedDate;
	}
	public void setModifiedDate(String modifiedDate) {
		this.modifiedDate = modifiedDate;
	}
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public int getReportsTo() {
		return reportsTo;
	}
	public void setReportsTo(int reportsTo) {
		this.reportsTo = reportsTo;
	}
	public Organizations getOrganization() {
		return organization;
	}
	public void setOrganization(Organizations organization) {
		this.organization = organization;
	}
	public Roles getRoles() {
		return roles;
	}
	public void setRoles(Roles roles) {
		this.roles = roles;
	}
	@Override
	public String toString() {
		return "UserDetails [userId=" + userId + ", firstName=" + firstName + ", lastName=" + lastName + ", emailId="
				+ emailId + ", createDate=" + createDate + ", modifiedDate=" + modifiedDate + ", status=" + status
				+ ", password=" + password + ", reportsTo=" + reportsTo + ", organization=" + organization + ", roles="
				+ roles + "]";
	}
}
