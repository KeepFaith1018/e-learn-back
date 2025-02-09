package com.learning.modules.space.controller.admin;

import cn.hutool.json.JSONObject;
import com.learning.core.annotation.CoolRestController;
import com.learning.core.base.BaseController;
import com.learning.modules.space.entity.SpaceTypeEntity;
import com.learning.modules.space.service.SpaceTypeService;
import io.swagger.v3.oas.annotations.tags.Tag;

import jakarta.servlet.http.HttpServletRequest;

/**
 * 文件空间信息
 */
@Tag(name = "文件空间信息", description = "文件空间信息")
@CoolRestController(api = { "add", "delete", "update", "page", "list", "info" })
public class AdminSpaceTypeController extends BaseController<SpaceTypeService, SpaceTypeEntity> {

    @Override
    protected void init(HttpServletRequest request, JSONObject requestParams) {

    }
}