package com.pmt.courseapi.controller;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pmt.courseapi.dto.UserDto;
import com.pmt.courseapi.dto.UserResponseDto;
import com.pmt.courseapi.service.UserService;

@RequiredArgsConstructor
@RestController
@RequestMapping("/api/v1/users")
public class UserController {

	private final UserService userService;

	@PostMapping
    @ApiOperation("Create a new user")
	@ApiResponses({ @ApiResponse(code = 200, message = "Create task successfully"),
			@ApiResponse(code = 400, message = "Email has already been taken") })
	public ResponseEntity<UserResponseDto> createUser(@Validated @RequestBody UserDto userDto) {
		UserResponseDto userResponse = userService.createUser(userDto);
		return new ResponseEntity<>(userResponse, HttpStatus.OK);
	}
	

}
