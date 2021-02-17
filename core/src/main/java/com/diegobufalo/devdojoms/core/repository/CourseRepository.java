package com.diegobufalo.devdojoms.core.repository;

import com.diegobufalo.devdojoms.core.model.Course;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface CourseRepository extends PagingAndSortingRepository<Course, Long> {
}
