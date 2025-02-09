package com.learning.modules.exam.service.impl;

import com.learning.core.base.BaseServiceImpl;
import com.learning.modules.exam.entity.ExamRecordEntity;
import com.learning.modules.exam.mapper.ExamRecordMapper;
import com.learning.modules.exam.service.ExamRecordService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

/**
 * @Description:
 * @Date: 2025/2/8 10:36
 */
@Service
@RequiredArgsConstructor
public class ExamRecordServiceImpl extends BaseServiceImpl<ExamRecordMapper, ExamRecordEntity> implements ExamRecordService {
}
