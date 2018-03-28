package com.example.demo.converter;

import java.util.stream.Collectors;

import com.example.demo.dto.UserDto;
import com.example.demo.entity.User;

public class UserConverter {
	public static User dtoToEntity(UserDto userDto) {
		User user = new User(userDto.getUserName(), null);
		user.setUserId(userDto.getUserId());
//		userDto.getSkillDtos().forEach(f -> f.setUserDto(userDto));
		user.setSkills(userDto.getSkillDtos().stream().map(f -> SkillConverter.dtoToEntity(f, user)).collect(Collectors.toList()));
//		user.getSkills().forEach(f -> f.setUser(user));
		return user;
	}
	public static UserDto entityToDto(User user) {
		UserDto userDto = new UserDto(user.getUserId(), user.getUserName(), null);
		userDto.setSkillDtos(user.getSkills().stream().map(SkillConverter::entityToDto).collect(Collectors.toList()));
//		userDto.getSkillDtos().forEach(f -> f.setUserDto(userDto));
		return userDto;
	}
}