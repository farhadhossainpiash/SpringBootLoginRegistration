package net.farhad.springboot.service;

import net.farhad.springboot.model.User;
import net.farhad.springboot.web.dto.RegistrationDto;

public interface UserService {
	User save(RegistrationDto registrationDto);
}
