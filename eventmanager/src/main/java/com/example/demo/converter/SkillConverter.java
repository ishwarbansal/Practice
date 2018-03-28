package com.example.demo.converter;

import com.example.demo.dto.SkillDto;
import com.example.demo.entity.Skill;
import com.example.demo.entity.User;

public class SkillConverter {
	public static Skill dtoToEntity(SkillDto SkillDto, User user) {
		Skill Skill = new Skill(SkillDto.getSkillName(), null);
		Skill.setSkillId(SkillDto.getSkillId());
		Skill.setUser(user);
		return Skill;
	}
	public static SkillDto entityToDto(Skill skill) {
		return new SkillDto(skill.getSkillId(), skill.getSkillName(), null);
	}
}