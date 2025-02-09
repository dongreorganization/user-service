package com.dongrejaipal.userinfo.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import com.dongrejaipal.userinfo.dto.UserDTO;
import com.dongrejaipal.userinfo.entity.User;

@Mapper
public interface UserMapper {
	
	UserMapper INSTANCE = Mappers.getMapper(UserMapper.class);
	
	UserDTO mapUserToUserDTO(User user);
	User mapUserDTOToUser(UserDTO userDTO);

}
