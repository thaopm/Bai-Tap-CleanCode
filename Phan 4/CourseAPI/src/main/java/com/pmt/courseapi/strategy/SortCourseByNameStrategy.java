package com.pmt.courseapi.strategy;

import org.springframework.data.domain.Sort;

public class SortCourseByNameStrategy implements SortCourseStrategy {

	@Override
	public Sort getSort() {
		return Sort.by(Sort.Direction.ASC, "name");
	}

}
