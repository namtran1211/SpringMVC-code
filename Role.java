package com.project.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "role")
public class Role implements Serializable {
	private Integer roleId;
	private String rollName;
	private User user;
	
	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)	
	public Integer getRoleId() {
		return roleId;
	}

	public void setRoleId(Integer roleId) {
		this.roleId = roleId;
	}

	@Column(name = "rollName")
	public String getRollName() {
		return rollName;
	}

	public void setRollName(String rollName) {
		this.rollName = rollName;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "roleId", nullable = false)
	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Role(Integer roleId, String rollName) {
		super();
		this.roleId = roleId;
		this.rollName = rollName;
	}

	public Role(Integer roleId, String rollName, User user) {
		super();
		this.roleId = roleId;
		this.rollName = rollName;
		this.user = user;
	}

	public Role() {
		super();
	}

}
