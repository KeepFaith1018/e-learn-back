package com.learning.modules.resource.service.impl;

import com.learning.core.base.BaseServiceImpl;
import com.learning.modules.resource.entity.ResourceInfoEntity;
import com.learning.modules.resource.mapper.ResourceInfoMapper;
import com.learning.modules.resource.service.ResourceInfoService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

/**
 * @Description:
 * @Date: 2025/2/3 23:45
 */
@Service
@RequiredArgsConstructor
public class ResourceInfoServiceImpl extends BaseServiceImpl<ResourceInfoMapper, ResourceInfoEntity> implements ResourceInfoService {
}
