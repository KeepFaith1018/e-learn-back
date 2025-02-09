package com.learning.modules.space.service.impl;

import com.learning.core.base.BaseServiceImpl;
import com.learning.modules.space.entity.SpaceInfoEntity;
import com.learning.modules.space.mapper.SpaceInfoMapper;
import com.learning.modules.space.service.SpaceInfoService;
import org.springframework.stereotype.Service;

/**
 * 文件空间信息
 */
@Service
public class SpaceInfoServiceImpl extends BaseServiceImpl<SpaceInfoMapper, SpaceInfoEntity>
        implements SpaceInfoService {
}