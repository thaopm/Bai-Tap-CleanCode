package com.pmt.courseapi.factory;

import com.pmt.courseapi.dto.UserDto;
import com.pmt.courseapi.entity.User;
import com.pmt.courseapi.enums.UserType;
import com.pmt.courseapi.mapper.UserMapper;

import lombok.RequiredArgsConstructor;

import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class UserFactory {

    private final UserMapper userMapper;

    public User createUser(UserDto userDto) {
        User user = null;
        if (UserType.STUDENT.toString().equals(userDto.getMode())) {
            user = userMapper.convertToStudent(userDto);
        } else if (UserType.TEACHER.toString().equals(userDto.getMode())) {
            user = userMapper.convertToTeacher(userDto);
        }
        return user;
    }

}
