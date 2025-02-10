package com.learning.modules.course.service.impl;

import com.learning.core.base.BaseServiceImpl;
import com.learning.modules.course.entity.CourseSelectEntity;
import com.learning.modules.course.mapper.CourseSelectMapper;
import com.learning.modules.course.service.CourseSelectService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

/**
 * @Description:
 * @Date: 2025/2/10 10:59
 */
@Service
@RequiredArgsConstructor
public class CourseSelectServiceImpl extends BaseServiceImpl<CourseSelectMapper, CourseSelectEntity> implements CourseSelectService {
}
