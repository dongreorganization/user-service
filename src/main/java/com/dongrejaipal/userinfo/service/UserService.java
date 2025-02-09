package com.dongrejaipal.userinfo.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.dongrejaipal.userinfo.dto.UserDTO;
import com.dongrejaipal.userinfo.entity.User;
import com.dongrejaipal.userinfo.mapper.UserMapper;
import com.dongrejaipal.userinfo.repo.UserRepo;

@Service
public class UserService {

	@Autowired
	UserRepo userRepo;

	public UserDTO createUser(UserDTO userDTO) {

		User user = userRepo.save(UserMapper.INSTANCE.mapUserDTOToUser(userDTO));

		return UserMapper.INSTANCE.mapUserToUserDTO(user);
	}

	public ResponseEntity<UserDTO> fetchUserById(Integer userId) {
		// TODO Auto-generated method stub

		Optional<User> user = userRepo.findById(userId);

		if (user.isPresent())
			return new ResponseEntity<UserDTO>(UserMapper.INSTANCE.mapUserToUserDTO(user.get()), HttpStatus.OK);

		return new ResponseEntity<>(null, HttpStatus.NOT_FOUND);
	}

}
