package com.learning.modules.discussion.service.impl;

import com.learning.core.base.BaseServiceImpl;
import com.learning.modules.discussion.entity.DiscussionDetailEntity;

import com.learning.modules.discussion.mapper.DiscussionDetailMapper;

import com.learning.modules.discussion.service.DiscussionDetailService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;


/**
 * @Description:
 * @Date: 2025/2/4 21:18
 */
@Service
@RequiredArgsConstructor
public class DiscussionDetailServiceImpl extends BaseServiceImpl<DiscussionDetailMapper, DiscussionDetailEntity> implements DiscussionDetailService {
}
