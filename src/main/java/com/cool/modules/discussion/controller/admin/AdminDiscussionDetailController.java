package com.cool.modules.discussion.controller.admin;

import cn.hutool.json.JSONObject;
import com.cool.core.annotation.CoolRestController;
import com.cool.core.base.BaseController;
import com.cool.modules.discussion.entity.DiscussionDetailEntity;
import com.cool.modules.discussion.service.DiscussionDetailService;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.servlet.http.HttpServletRequest;

/**
 * @Description:
 * @Date: 2025/2/4 21:18
 */
@Tag(name = "讨论详情信息", description = "讨论详情信息")
@CoolRestController(api = { "add", "delete", "update", "page", "list", "info" })
public class AdminDiscussionDetailController extends BaseController<DiscussionDetailService, DiscussionDetailEntity> {
    @Override
    protected void init(HttpServletRequest request, JSONObject requestParams) {
        setPageOption(createOp().keyWordLikeFields());
    }
}
