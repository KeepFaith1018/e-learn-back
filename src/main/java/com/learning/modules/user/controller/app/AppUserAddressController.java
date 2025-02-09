package com.learning.modules.user.controller.app;

import static com.learning.modules.user.entity.table.UserAddressEntityTableDef.USER_ADDRESS_ENTITY;

import cn.hutool.json.JSONObject;
import com.learning.core.annotation.CoolRestController;
import com.learning.core.base.BaseController;
import com.learning.core.request.R;
import com.learning.core.util.CoolSecurityUtil;
import com.learning.modules.user.entity.UserAddressEntity;
import com.learning.modules.user.service.UserAddressService;
import com.mybatisflex.core.query.QueryWrapper;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * 用户模块-收货地址
 */
@Tag(name = "用户模块-收货地址", description = "用户模块-收货地址")
@CoolRestController(api = {"add", "delete", "update", "page", "list", "info"})
public class AppUserAddressController extends BaseController<UserAddressService, UserAddressEntity> {
    @Override
    protected void init(HttpServletRequest request, JSONObject requestParams) {
        setPageOption(
            createOp()
                .queryWrapper(
                    QueryWrapper.create()
                        .and(USER_ADDRESS_ENTITY.USER_ID.eq(CoolSecurityUtil.getCurrentUserId()))
                        .orderBy(
                            USER_ADDRESS_ENTITY.IS_DEFAULT.getName(), false)));

        setListOption(
            createOp()
                .queryWrapper(
                    QueryWrapper.create()
                        .and(USER_ADDRESS_ENTITY.USER_ID.eq(CoolSecurityUtil.getCurrentUserId()))
                        .orderBy(
                            USER_ADDRESS_ENTITY.IS_DEFAULT.getName(), false)));
    }

    @Operation(summary = "默认地址", description = "默认地址")
    @GetMapping("/default")
    public R getDefault() {
        Long userId = CoolSecurityUtil.getCurrentUserId();
        return R.ok(this.service.getDefault(userId));
    }
}