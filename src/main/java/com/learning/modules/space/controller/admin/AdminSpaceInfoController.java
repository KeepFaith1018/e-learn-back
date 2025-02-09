package com.learning.modules.space.controller.admin;

import cn.hutool.json.JSONObject;
import com.learning.core.annotation.CoolRestController;
import com.learning.core.base.BaseController;
import com.learning.modules.space.entity.SpaceInfoEntity;
import com.learning.modules.space.service.SpaceInfoService;
import io.swagger.v3.oas.annotations.tags.Tag;

import jakarta.servlet.http.HttpServletRequest;

import static com.learning.modules.space.entity.table.SpaceInfoEntityTableDef.SPACE_INFO_ENTITY;

/**
 * 文件空间信息
 */
@Tag(name = "文件空间信息", description = "文件空间信息")
@CoolRestController(api = { "add", "delete", "update", "page", "list", "info" })
public class AdminSpaceInfoController extends BaseController<SpaceInfoService, SpaceInfoEntity> {
    @Override
    protected void init(HttpServletRequest request, JSONObject requestParams) {
        setPageOption(createOp().fieldEq(SPACE_INFO_ENTITY.TYPE, SPACE_INFO_ENTITY.CLASSIFY_ID));
    }
}
