package com.pmt.courseapi.service;

import com.pmt.courseapi.factory.UserFactory;
import com.pmt.courseapi.mapper.UserMapper;
import lombok.RequiredArgsConstructor;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.pmt.courseapi.dto.UserDto;
import com.pmt.courseapi.dto.UserResponseDto;
import com.pmt.courseapi.entity.User;
import com.pmt.courseapi.error.ErrorCodes;
import com.pmt.courseapi.error.ServiceRuntimeException;
import com.pmt.courseapi.repository.UserRepository;

@Service
@RequiredArgsConstructor
public class UserService {

	private final UserRepository userRepository;
	private final UserFactory userFactory;
	private final UserMapper userMapper;

	public User findByEmail(String email) {
		return userRepository.findByEmail(email).orElse(null);
	}

	@Transactional()
	public UserResponseDto createUser(UserDto userDto) throws RuntimeException {
		if (findByEmail(userDto.getEmail()) == null) {
			User user = userFactory.createUser(userDto);
			User createdUser = userRepository.save(user);
			UserResponseDto userResponse = userMapper.convertToUserResponseDto(createdUser);
			return userResponse;
		} else {
			throw new ServiceRuntimeException(HttpStatus.BAD_REQUEST, ErrorCodes.USER_E001,
					"Email has already been taken");
		}
	}

}
