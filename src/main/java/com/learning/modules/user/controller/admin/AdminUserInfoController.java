package com.learning.modules.user.controller.admin;

import static com.learning.modules.user.entity.table.UserInfoEntityTableDef.USER_INFO_ENTITY;

import cn.hutool.json.JSONObject;
import com.learning.core.annotation.CoolRestController;
import com.learning.core.base.BaseController;
import com.learning.modules.user.entity.UserInfoEntity;
import com.learning.modules.user.service.UserInfoService;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.servlet.http.HttpServletRequest;

@Tag(name = "用户信息", description = "用户信息")
@CoolRestController(api = {"add", "delete", "update", "page", "list", "info"})
public class AdminUserInfoController extends BaseController<UserInfoService, UserInfoEntity> {

    @Override
    protected void init(HttpServletRequest request, JSONObject requestParams) {
        setPageOption(createOp().fieldEq(USER_INFO_ENTITY.STATUS, USER_INFO_ENTITY.GENDER,
                USER_INFO_ENTITY.LOGIN_TYPE)
            .keyWordLikeFields(USER_INFO_ENTITY.NICK_NAME, USER_INFO_ENTITY.PHONE));
    }
}
