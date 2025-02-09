package com.learning.modules.discussion.service.impl;
import com.learning.core.base.BaseServiceImpl;
import com.learning.modules.discussion.entity.DiscussionGroupEntity;
import com.learning.modules.discussion.mapper.DiscussionGroupMapper;
import com.learning.modules.discussion.service.DiscussionGroupService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

/**
 * @Description: 讨论组服务实现类
 * @Date: 2025/2/1 18:01
 */

@Service
@RequiredArgsConstructor
public class DiscussionGroupServiceImpl extends BaseServiceImpl<DiscussionGroupMapper, DiscussionGroupEntity> implements DiscussionGroupService {
}
