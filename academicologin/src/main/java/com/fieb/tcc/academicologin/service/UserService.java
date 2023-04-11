package com.fieb.tcc.academicologin.service;

import org.springframework.security.core.userdetails.UserDetailsService;

import com.fieb.tcc.academicologin.model.Role;
import com.fieb.tcc.academicologin.model.User;
import com.fieb.tcc.academicologin.web.dto.UserDto;

public interface UserService extends UserDetailsService {

	User save(UserDto UserDto);

	User findByEmail(UserDto UserDto);

	User update(UserDto userDto);

	User getAuthenticatedUser();

	Role saveRole(Role role);

	void addRoleToUser(String username, String rolename);
}
