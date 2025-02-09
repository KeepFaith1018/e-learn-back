package com.learning.modules.user.controller.app;

import cn.hutool.json.JSONObject;
import com.learning.core.annotation.CoolRestController;
import com.learning.core.request.R;
import com.learning.core.util.CoolSecurityUtil;
import com.learning.core.util.EntityUtils;
import com.learning.modules.user.entity.UserInfoEntity;
import com.learning.modules.user.service.UserInfoService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestAttribute;

@RequiredArgsConstructor
@Tag(name = "用户信息", description = "用户信息")
@CoolRestController
public class AppUserInfoController {

    private final UserInfoService userInfoService;

    @Operation(summary = "用户个人信息", description = "获得App、小程序或者其他应用的用户个人信息")
    @GetMapping("/person")
    public R person() {
        Long userId = CoolSecurityUtil.getCurrentUserId();
        UserInfoEntity userInfoEntity = userInfoService.person(userId);
        return R.ok(EntityUtils.toMap(userInfoEntity,
            "password"));
    }

    @Operation(summary = "更新用户信息")
    @PostMapping("/updatePerson")
    public R updatePerson(@RequestAttribute JSONObject requestParams) {
        UserInfoEntity infoEntity = requestParams.toBean(UserInfoEntity.class);
        infoEntity.setId(CoolSecurityUtil.getCurrentUserId());
        return R.ok(
            userInfoService.updateById(infoEntity)
        );
    }

    @Operation(summary = "更新用户密码")
    @PostMapping("/updatePassword")
    public R updatePassword(
        @RequestAttribute JSONObject requestParams
    ) {
        String password = requestParams.get("password", String.class);
        String code = requestParams.get("code", String.class);
        userInfoService.updatePassword(CoolSecurityUtil.getCurrentUserId(), password, code);
        return R.ok();
    }

    @Operation(summary = "注销")
    @PostMapping("/logoff")
    public R logoff() {
        userInfoService.logoff(CoolSecurityUtil.getCurrentUserId());
        return R.ok();
    }

    @Operation(summary = "绑定手机号")
    @PostMapping("/bindPhone")
    public R bindPhone(
        @RequestAttribute JSONObject requestParams) {
        String phone = requestParams.get("phone", String.class);
        String code = requestParams.get("code", String.class);
        userInfoService.bindPhone(CoolSecurityUtil.getCurrentUserId(), phone, code);
        return R.ok();
    }
}
