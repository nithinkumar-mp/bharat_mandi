package com.bharatmandi.cms.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="ORGANIZATIONS")
public class Organizations {

	@Id
	@Column(name="ORGANIZATION_ID")
	private int organizationId;
	@Column(name="NAME")
	private String organizationName;
	@Column(name="CREATE_DATE")
	private String createDate;
	@Column(name="MODIFIED_DATE")
	private String modifiedDate;
	@Column(name="STATUS")
	private int status;
	
	public int getOrganizationId() {
		return organizationId;
	}
	public void setOrganizationId(int organizationId) {
		this.organizationId = organizationId;
	}
	public String getOrganizationName() {
		return organizationName;
	}
	public void setOrganizationName(String organizationName) {
		this.organizationName = organizationName;
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
		return "Organizations [organizationId=" + organizationId + ", organizationName=" + organizationName
				+ ", createDate=" + createDate + ", modifiedDate=" + modifiedDate + ", status=" + status + "]";
	}
}
