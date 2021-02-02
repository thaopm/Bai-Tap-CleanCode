package com.pmt.courseapi.service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.pmt.courseapi.dto.CourseReqSearchDto;
import com.pmt.courseapi.dto.CourseResDto;
import com.pmt.courseapi.entity.Course;
import com.pmt.courseapi.enums.CourseSortType;
import com.pmt.courseapi.mapper.CourseMapper;
import com.pmt.courseapi.repository.CourseRepository;
import com.pmt.courseapi.strategy.SortCourseByNameStrategy;
import com.pmt.courseapi.strategy.SortCourseByOpenedStrategy;
import com.pmt.courseapi.strategy.SortCourseStrategy;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class CourseService {

	private final CourseRepository courseRepository;
	private final CourseMapper courseMapper;
	private SortCourseStrategy sortCourseStrategy;

	public void setSortCourseStrategy(SortCourseStrategy sortCourseStrategy) {
		this.sortCourseStrategy = sortCourseStrategy;
	}

//	@Cacheable(value = "courses", key = "#courseId")
	@Transactional(readOnly = true)
	public List<CourseResDto> getCourses(CourseReqSearchDto courseDto) {
		String keyword = courseDto.getKeyword();
		String sortBy = courseDto.getSortBy();

		List<Course> courses = new ArrayList<Course>();

//		StringBuilder query = new StringBuilder();
//		query.append("SELECT c.* FROM course c ");
//		if (keyword != null) {
//			query.append("WHERE c.name LIKE '%");
//			query.append(keyword);
//			query.append("%' ");
//		}
//		if (sortBy != null) {
//			if (CourseSortType.name.toString().equals(sortBy)) {
//				setSortCourseStrategy(new SortCourseByNameStrategy());
//			} else if (CourseSortType.opened.toString().equals(sortBy)) {
//				setSortCourseStrategy(new SortCourseByOpenedStrategy());
//			}
//			query.append("ORDER BY ");
//			query.append(sortCourseStrategy.getSort());
//		}
//		courses = courseRepository.findAllByName(query.toString());

		if (sortBy == null) {
			if (keyword == null) {
				courses = courseRepository.findAll();
			} else if (keyword != null) {
				courses = courseRepository.findAllByNameLike("%" + keyword + "%");
			}
		} else if (sortBy != null) {
			if (CourseSortType.opened.toString().equals(sortBy)) {
				sortCourseStrategy = new SortCourseByOpenedStrategy();
			} else {
				sortCourseStrategy = new SortCourseByNameStrategy();
			}
			Sort sort = sortCourseStrategy.getSort();
			if (keyword == null) {
				courses = courseRepository.findAll(sort);
			} else if (keyword != null) {
				courses = courseRepository.findAllByNameLike(sort, "%" + keyword + "%");
			}
		}

		return courses.stream().map(course -> courseMapper.convertToCourseResponseDto(course))
				.collect(Collectors.toList());
	}

}
