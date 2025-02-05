package com.cool.modules.discussion.service.impl;

import com.cool.core.base.BaseServiceImpl;
import com.cool.modules.discussion.entity.DiscussionDetailEntity;

import com.cool.modules.discussion.mapper.DiscussionDetailMapper;

import com.cool.modules.discussion.service.DiscussionDetailService;
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
