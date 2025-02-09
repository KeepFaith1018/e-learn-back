package com.learning.modules.space.service.impl;

import com.learning.core.base.BaseServiceImpl;
import com.learning.modules.space.entity.SpaceTypeEntity;
import com.learning.modules.space.mapper.SpaceTypeMapper;
import com.learning.modules.space.service.SpaceTypeService;
import org.springframework.stereotype.Service;

/**
 * 文件空间信息
 */
@Service
public class SpaceTypeServiceImpl extends BaseServiceImpl<SpaceTypeMapper, SpaceTypeEntity>
        implements SpaceTypeService {
}