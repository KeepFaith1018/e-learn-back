package com.learning.modules.chapter.service.impl;

import com.learning.core.base.BaseServiceImpl;
import com.learning.modules.chapter.entity.ChapterInfoEntity;
import com.learning.modules.chapter.mapper.ChapterInfoMapper;
import com.learning.modules.chapter.service.ChapterInfoService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

/**
 * @Description:
 * @Date: 2025/1/30 11:01
 */
@Service
@RequiredArgsConstructor
public class ChapterInfoServiceImpl extends BaseServiceImpl<ChapterInfoMapper, ChapterInfoEntity> implements
        ChapterInfoService {
}