package com.dongrejaipal.userinfo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dongrejaipal.userinfo.dto.UserDTO;
import com.dongrejaipal.userinfo.service.UserService;

@RestController
@RequestMapping("/user")
public class UserController {

	@Autowired
	UserService userService;

	@PostMapping("/createUser")
	public ResponseEntity<UserDTO> createUser(@RequestBody UserDTO userDTO) {
		return new ResponseEntity<UserDTO>(userService.createUser(userDTO), HttpStatus.CREATED);
	}

	@GetMapping("/fetchUserById/{userId}")
	public ResponseEntity<UserDTO> fetchUserById(@PathVariable Integer userId) {
		return userService.fetchUserById(userId);
	}
}
