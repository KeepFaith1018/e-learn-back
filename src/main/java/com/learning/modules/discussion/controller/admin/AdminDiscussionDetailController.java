package com.learning.modules.discussion.controller.admin;

import cn.hutool.json.JSONObject;
import com.learning.core.annotation.CoolRestController;
import com.learning.core.base.BaseController;
import com.learning.modules.discussion.entity.DiscussionDetailEntity;
import com.learning.modules.discussion.service.DiscussionDetailService;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.servlet.http.HttpServletRequest;

import static com.learning.modules.discussion.entity.table.DiscussionDetailEntityTableDef.DISCUSSION_DETAIL_ENTITY;

/**
 * @Description:
 * @Date: 2025/2/4 21:18
 */
@Tag(name = "讨论详情信息", description = "讨论详情信息")
@CoolRestController(api = { "add", "delete", "update", "page", "list", "info" })
public class AdminDiscussionDetailController extends BaseController<DiscussionDetailService, DiscussionDetailEntity> {
    @Override
    protected void init(HttpServletRequest request, JSONObject requestParams) {

        setPageOption(createOp().keyWordLikeFields(DISCUSSION_DETAIL_ENTITY.USER_USERNAME));
        setListOption(createOp().fieldEq(DISCUSSION_DETAIL_ENTITY.GROUP_ID));
    }
}
