package com.cool.modules.resource.service.impl;

import com.cool.core.base.BaseServiceImpl;
import com.cool.modules.resource.entity.ResourceInfoEntity;
import com.cool.modules.resource.mapper.ResourceInfoMapper;
import com.cool.modules.resource.service.ResourceInfoService;
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
