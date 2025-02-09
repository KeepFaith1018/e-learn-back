package com.learning.modules.user.service;

import com.learning.core.base.BaseService;
import com.learning.modules.user.entity.UserWxEntity;

/**
 * 微信用户
 */
public interface UserWxService extends BaseService<UserWxEntity> {

    /**
     * 获取小程序用户信息
     */
    UserWxEntity getMiniUserInfo(String code, String encryptedData, String iv);
}
