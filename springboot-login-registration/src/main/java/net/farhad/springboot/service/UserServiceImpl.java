package net.farhad.springboot.service;

import java.util.Arrays;

import org.springframework.stereotype.Service;

import net.farhad.springboot.model.Role;
import net.farhad.springboot.model.User;
import net.farhad.springboot.repository.UserRegistrationRepository;
import net.farhad.springboot.web.dto.RegistrationDto;

@Service
public class UserServiceImpl implements UserService{

	public UserRegistrationRepository userRegistrationRepository;
	
	
	public UserServiceImpl(UserRegistrationRepository userRegistrationRepository) {
		super();
		this.userRegistrationRepository = userRegistrationRepository;
	}


	@Override
	public User save(RegistrationDto registrationDto) {
		
		User user = new User(registrationDto.getFirstName(), registrationDto.getLastName(), 
				registrationDto.getEmail(), registrationDto.getPassword(), Arrays.asList(new Role("ROLE_USER")));
		
		return userRegistrationRepository.save(user);
	}

	
	}

