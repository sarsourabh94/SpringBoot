package com.example.demo.service.impl;

import java.util.ArrayList;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.example.demo.UserRepository;
import com.example.demo.io.entity.UserEntity;
import com.example.demo.service.UserService;
import com.example.demo.shared.dto.UserDto;
import com.example.demo.shared.utils.Utils;

@Service
public class UserServiceImplementation implements UserService {

	@Autowired
	UserRepository userRepository;
	
	@Autowired
	Utils userUtility;
	
	@Autowired
	BCryptPasswordEncoder bCryptPasswordEncoder;

	@Override
	public UserDto createUser(UserDto userdto) {

		UserEntity storedUserEntity=userRepository.findByEmail(userdto.getEmail());
		if(storedUserEntity!=null) throw new RuntimeException("Record already exist");
		
		UserEntity userEntity = new UserEntity();
		BeanUtils.copyProperties(userdto, userEntity);
		userEntity.setEncryptedpassword(bCryptPasswordEncoder.encode(userdto.getPassword()));
		userEntity.setUserid(userUtility.getUniqueId());

		UserEntity storedUserDetails = userRepository.save(userEntity);

		UserDto returnValue = new UserDto();
		BeanUtils.copyProperties(storedUserDetails, returnValue);
		
		return returnValue;

	}

	@Override
	public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
		
		UserEntity userEntity=userRepository.findByEmail(email);
		
		if(userEntity==null) throw new UsernameNotFoundException(email); 
		
		return new User(userEntity.getEmail(),userEntity.getEncryptedpassword(),new ArrayList<>());
	}

}
