package com.cool.modules.discussion.service.impl;
import com.cool.core.base.BaseServiceImpl;
import com.cool.modules.discussion.entity.DiscussionGroupEntity;
import com.cool.modules.discussion.mapper.DiscussionGroupMapper;
import com.cool.modules.discussion.service.DiscussionGroupService;
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
