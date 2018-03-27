package com.example.demo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="TMP_SKILL_DATA")
public class Skill {
	
	@Column(name="skillId")
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Id
	private Integer skillId;
	
	@Column(name="skillName")
	private String skillName;
	
	@ManyToOne
	@JoinColumn(name = "userId", nullable = false)
	private User user;
	
	public Skill(String skillName) {
		this.skillName = skillName;
	}
	public Integer getSkillId() {
		return skillId;
	}
	public void setSkillId(Integer skillId) {
		this.skillId = skillId;
	}
	public String getSkillName() {
		return skillName;
	}
	public void setSkillName(String skillName) {
		this.skillName = skillName;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public Skill() {
	}
	public Skill(String skillName, User user) {
		this.skillName = skillName;
		this.user = user;
	}
}
