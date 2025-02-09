package com.dongrejaipal.userinfo.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserDTO {
	
	private int id;
	private String userName;
	private String userPassword;
	private String city;
	private String address;

}
