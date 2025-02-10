package com.learning.modules.chapter.service.impl;

import com.learning.core.base.BaseServiceImpl;
import com.learning.modules.chapter.entity.ChapterProgressEntity;
import com.learning.modules.chapter.mapper.CourseProgressMapper;
import com.learning.modules.chapter.service.ChapterProgressService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

/**
 * @Description:
 * @Date: 2025/2/10 20:48
 */
@Service
@RequiredArgsConstructor
public class ChapterProgressServiceImpl extends BaseServiceImpl<CourseProgressMapper, ChapterProgressEntity> implements ChapterProgressService {
}
