package com.cool.modules.chapter.service.impl;

import com.cool.core.base.BaseServiceImpl;
import com.cool.modules.chapter.entity.ChapterInfoEntity;
import com.cool.modules.chapter.mapper.ChapterInfoMapper;
import com.cool.modules.chapter.service.ChapterInfoService;
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