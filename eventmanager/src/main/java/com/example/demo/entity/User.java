package com.example.demo.entity;

import java.io.Serializable;
import java.util.LinkedList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="TMP_USER_DATA")
public class User implements Serializable{
	private static final long serialVersionUID = 0x62A6DA99AABDA8A8L;
	
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Id
	@Column(name = "userId")
	private Integer userId;
	
	@Column(name="userName")
	private String userName;
	
	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	private List<Skill> skills= new LinkedList<>();
	
	public Integer getUserId() {
		return userId;
	}
	public void setUserId(Integer userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public List<Skill> getSkills() {
		return skills;
	}
	public void setSkills(List<Skill> skills) {
		this.skills = skills;
	}
	public User() {
	}
	public User(String userName, List<Skill> skills) {
		this.userName = userName;
		this.skills = skills;
	}
}