package com.learning.modules.exam.service.impl;

import com.learning.core.base.BaseServiceImpl;
import com.learning.modules.exam.entity.ExamPaperInfoEntity;
import com.learning.modules.exam.mapper.ExamPaperInfoEntityMapper;
import com.learning.modules.exam.service.ExamPaperInfoEntityService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

/**
 * @Description:
 * @Date: 2025/2/5 8:16
 */
@Service
@RequiredArgsConstructor
public class ExamPaperInfoEntityServiceImpl extends BaseServiceImpl<ExamPaperInfoEntityMapper, ExamPaperInfoEntity> implements ExamPaperInfoEntityService {
}
