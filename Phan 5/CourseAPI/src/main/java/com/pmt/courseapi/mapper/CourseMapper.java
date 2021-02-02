package com.pmt.courseapi.mapper;

import org.springframework.stereotype.Component;

import com.pmt.courseapi.dto.CourseResDto;
import com.pmt.courseapi.entity.Course;

@Component
public class CourseMapper {

	public CourseResDto convertToCourseResponseDto(Course course) {
		CourseResDto responseDto = new CourseResDto();
		responseDto.setId(course.getId());
		responseDto.setName(course.getName());
		responseDto.setLocation(course.getLocation());
		responseDto.setTeacherName(course.getTeacher().getName());
		
		return responseDto;
	}

}
