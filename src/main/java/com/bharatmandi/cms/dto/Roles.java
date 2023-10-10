package com.bharatmandi.cms.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="ROLES")
public class Roles {

	@Id
	@Column(name="ROLE_ID")
	private int roleId;
	@Column(name="ROLE_NAME")
	private String roleName;
	@Column(name="CREATE_DATE")
	private String createDate;
	@Column(name="MODIFIED_DATE")
	private String modifiedDate;
	@Column(name="STATUS")
	private int status;
	
	public int getRoleId() {
		return roleId;
	}
	public void setRoleId(int roleId) {
		this.roleId = roleId;
	}
	public String getRoleName() {
		return roleName;
	}
	public void setRoleName(String roleName) {
		this.roleName = roleName;
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
	@Override
	public String toString() {
		return "Roles [roleId=" + roleId + ", roleName=" + roleName + ", createDate=" + createDate + ", modifiedDate="
				+ modifiedDate + ", status=" + status + "]";
	}
}
