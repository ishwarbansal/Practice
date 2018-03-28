package com.example.demo.dto;

public class SkillDto {
	Integer skillId;
	String SkillName;
	UserDto userDto;
	
	public SkillDto() {
		
	}
	public SkillDto(Integer skillId, String skillName, UserDto userDto) {
		super();
		this.skillId = skillId;
		SkillName = skillName;
		this.userDto = userDto;
	}

	public Integer getSkillId() {
		return skillId;
	}
	public void setSkillId(Integer skillId) {
		this.skillId = skillId;
	}
	public String getSkillName() {
		return SkillName;
	}
	public void setSkillName(String skillName) {
		SkillName = skillName;
	}
	public UserDto getUserDto() {
		return userDto;
	}
	public void setUserDto(UserDto userDto) {
		this.userDto = userDto;
	}
}