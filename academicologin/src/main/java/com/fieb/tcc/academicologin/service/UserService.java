package com.fieb.tcc.academicologin.service;

import org.springframework.security.core.userdetails.UserDetailsService;

import com.fieb.tcc.academicologin.model.User;
import com.fieb.tcc.academicologin.web.dto.UserDto;

public interface UserService extends UserDetailsService {

	User save(UserDto UserDto);

	User findByEmail(UserDto UserDto);

	User update(User user);

	User getAuthenticatdUser();
}
