package com.cool.modules.discussion.controller.admin;

import cn.hutool.json.JSONObject;
import com.cool.core.annotation.CoolRestController;
import com.cool.core.base.BaseController;
import com.cool.modules.discussion.entity.DiscussionGroupEntity;
import com.cool.modules.discussion.service.DiscussionGroupService;
import com.mybatisflex.core.query.QueryWrapper;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.servlet.http.HttpServletRequest;

import static com.cool.modules.discussion.entity.table.DiscussionGroupEntityTableDef.DISCUSSION_GROUP_ENTITY;
import static com.cool.modules.discussion.entity.table.DiscussionDetailEntityTableDef.DISCUSSION_DETAIL_ENTITY;
import static com.cool.modules.course.entity.table.CourseInfoEntityTableDef.COURSE_INFO_ENTITY;

/**
 * @Description:
 * @Date: 2025/2/1 18:02
 */

@Tag(name = "讨论组信息", description = "讨论组信息")
@CoolRestController(api = { "add", "delete", "update", "page", "list", "info" })
public class AdminDiscussionGroupController extends BaseController<DiscussionGroupService, DiscussionGroupEntity> {
    @Override
    protected void init(HttpServletRequest request, JSONObject requestParams) {
        setPageOption(createOp()
                .fieldEq(DISCUSSION_GROUP_ENTITY.COURSE_ID)
                .keyWordLikeFields(DISCUSSION_GROUP_ENTITY.GROUP_NAME)
                .queryWrapper(
                        QueryWrapper.create().select()
                                .from(DISCUSSION_GROUP_ENTITY)
                                .leftJoin(COURSE_INFO_ENTITY)
                                .on(DISCUSSION_GROUP_ENTITY.COURSE_ID.eq(COURSE_INFO_ENTITY.ID))
                                .leftJoin(DISCUSSION_DETAIL_ENTITY)
                                .on(DISCUSSION_GROUP_ENTITY.ID.eq(DISCUSSION_DETAIL_ENTITY.GROUP_ID))
                ));
        setListOption(createOp()
                .fieldEq(DISCUSSION_GROUP_ENTITY.COURSE_ID)
                .keyWordLikeFields(DISCUSSION_GROUP_ENTITY.GROUP_NAME)
                .queryWrapper(
                        QueryWrapper.create().select()
                                .from(DISCUSSION_GROUP_ENTITY)
                                .leftJoin(COURSE_INFO_ENTITY)
                                .on(DISCUSSION_GROUP_ENTITY.COURSE_ID.eq(COURSE_INFO_ENTITY.ID))
                                .leftJoin(DISCUSSION_DETAIL_ENTITY)
                                .on(DISCUSSION_GROUP_ENTITY.ID.eq(DISCUSSION_DETAIL_ENTITY.GROUP_ID))
                ));
    }
}
