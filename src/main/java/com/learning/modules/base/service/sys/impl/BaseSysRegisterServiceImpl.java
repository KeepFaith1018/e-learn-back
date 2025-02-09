package com.learning.modules.base.service.sys.impl;

import cn.hutool.crypto.digest.MD5;
import com.learning.core.exception.CoolPreconditions;
import com.learning.modules.base.dto.sys.BaseSysRegisterDto;
import com.learning.modules.base.entity.sys.BaseSysUserEntity;

import com.learning.modules.base.mapper.sys.BaseSysUserMapper;
import com.learning.modules.base.service.sys.BaseSysPermsService;
import com.learning.modules.base.service.sys.BaseSysRegisterService;
import com.learning.modules.base.service.sys.BaseSysUserService;
import com.mybatisflex.core.query.QueryWrapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

/**
 * @Description:
 * @Date: 2025/1/31 16:37
 */
@Service
@RequiredArgsConstructor
public class BaseSysRegisterServiceImpl implements BaseSysRegisterService {
    private final BaseSysUserService baseSysUserService;
    private final BaseSysUserMapper baseSysUserMapper;
    private final BaseSysPermsService baseSysPermsService;
    @Override
    public Object register(BaseSysRegisterDto baseSysRegisterDto) {
        BaseSysUserEntity check = baseSysUserService.getOne(
                QueryWrapper.create().eq(BaseSysUserEntity::getUsername, baseSysRegisterDto.getUsername()));
        CoolPreconditions.check(check != null, "用户名已存在");
        BaseSysUserEntity entity = new BaseSysUserEntity();
        entity.setDepartmentId(baseSysRegisterDto.getDepartmentId());
        entity.setUsername(baseSysRegisterDto.getUsername());
        entity.setName(baseSysRegisterDto.getName());
        entity.setNickName(baseSysRegisterDto.getNickname());
        entity.setPassword(MD5.create().digestHex(baseSysRegisterDto.getPassword()));
        // 创建用户
        baseSysUserMapper.insertSelective(entity);
        // 刷新权限
        baseSysPermsService.updateUserRole(entity.getId(),
                baseSysRegisterDto.getRoleIdList());
        return entity.getId();
    }
}
