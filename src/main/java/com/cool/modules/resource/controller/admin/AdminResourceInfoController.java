package com.cool.modules.resource.controller.admin;

import cn.hutool.json.JSONObject;
import com.cool.core.annotation.CoolRestController;
import com.cool.core.base.BaseController;
import com.cool.modules.resource.entity.ResourceInfoEntity;
import com.cool.modules.resource.service.ResourceInfoService;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.servlet.http.HttpServletRequest;
import static com.cool.modules.resource.entity.table.ResourceInfoEntityTableDef.RESOURCE_INFO_ENTITY;

/**
 * @Description:
 * @Date: 2025/2/3 23:48
 */
@Tag(name = "资源信息", description = "资源信息")
@CoolRestController(api = {"add", "delete", "update", "page", "list", "info","test"})
public class AdminResourceInfoController extends BaseController<ResourceInfoService, ResourceInfoEntity> {
    @Override
    protected void init(HttpServletRequest request, JSONObject requestParams) {
        setPageOption(createOp().keyWordLikeFields(RESOURCE_INFO_ENTITY.RESOURCE_NAME).fieldEq(RESOURCE_INFO_ENTITY.COURSE_ID));
        setListOption(createOp().keyWordLikeFields(RESOURCE_INFO_ENTITY.RESOURCE_NAME).fieldEq(RESOURCE_INFO_ENTITY.COURSE_ID));
    }
}
