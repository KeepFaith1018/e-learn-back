package com.learning.modules.user.service;

import com.learning.core.base.BaseService;
import com.learning.modules.user.entity.UserAddressEntity;

/**
 * 用户模块-收货地址
 */
public interface UserAddressService extends BaseService<UserAddressEntity> {

    /**
     * 获取默认地址
     */
    Object getDefault(Long userId);
}
