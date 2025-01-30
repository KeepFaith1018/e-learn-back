package com.cool.modules.course.service.impl;

import com.cool.core.base.BaseServiceImpl;
import com.cool.modules.course.entity.CourseInfoEntity;
import com.cool.modules.course.mapper.CourseInfoMapper;
import com.cool.modules.course.service.CourseInfoService;
import com.cool.modules.user.entity.UserInfoEntity;
import com.cool.modules.user.mapper.UserInfoMapper;
import com.cool.modules.user.service.UserInfoService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

/**
 * @Description:
 * @Date: 2025/1/30 11:01
 */
@Service
@RequiredArgsConstructor
public class CourseInfoServiceImpl extends BaseServiceImpl<CourseInfoMapper, CourseInfoEntity> implements
        CourseInfoService {
}
