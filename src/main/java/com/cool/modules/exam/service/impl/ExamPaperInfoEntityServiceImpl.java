package com.cool.modules.exam.service.impl;

import com.cool.core.base.BaseServiceImpl;
import com.cool.modules.exam.entity.ExamPaperInfoEntity;
import com.cool.modules.exam.mapper.ExamPaperInfoEntityMapper;
import com.cool.modules.exam.service.ExamPaperInfoEntityService;
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
