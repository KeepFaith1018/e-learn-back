package com.learning.modules.user.service.impl;

import com.learning.core.base.BaseServiceImpl;
import com.learning.modules.user.entity.UserAddressEntity;
import com.learning.modules.user.mapper.UserAddressMapper;
import com.learning.modules.user.service.UserAddressService;
import com.mybatisflex.core.query.QueryWrapper;
import org.springframework.stereotype.Service;

/**
 * 用户模块-收货地址
 */
@Service
public class UserAddressServiceImpl extends BaseServiceImpl<UserAddressMapper, UserAddressEntity> implements UserAddressService {

    @Override
    public Object getDefault(Long userId) {
        return this.getOne(QueryWrapper.create().eq(UserAddressEntity::getUserId, userId)
            .eq(UserAddressEntity::getIsDefault, true).limit(1));
    }
}