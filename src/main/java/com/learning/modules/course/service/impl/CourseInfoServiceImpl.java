package com.learning.modules.course.service.impl;

import com.learning.core.base.BaseServiceImpl;
import com.learning.modules.chapter.mapper.ChapterInfoMapper;
import com.learning.modules.chapter.service.ChapterInfoService;
import com.learning.modules.course.entity.CourseInfoEntity;
import com.learning.modules.course.mapper.CourseInfoMapper;
import com.learning.modules.course.service.CourseInfoService;
import com.learning.modules.discussion.mapper.DiscussionDetailMapper;
import com.learning.modules.discussion.service.DiscussionDetailService;
import com.learning.modules.exam.entity.ExamPaperInfoEntity;
import com.learning.modules.exam.mapper.ExamPaperInfoEntityMapper;
import com.learning.modules.exam.service.ExamPaperInfoEntityService;
import com.learning.modules.resource.mapper.ResourceInfoMapper;
import com.learning.modules.resource.service.ResourceInfoService;
import com.mybatisflex.core.query.QueryWrapper;
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
