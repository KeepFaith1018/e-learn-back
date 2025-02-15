package com.learning.modules.course.controller.admin;

import cn.hutool.json.JSONObject;
import com.learning.core.annotation.CoolRestController;
import com.learning.core.base.BaseController;
import com.learning.core.enums.QueryModeEnum;
import com.learning.modules.course.entity.CourseSelectEntity;
import com.learning.modules.course.service.CourseSelectService;
import com.mybatisflex.core.query.QueryWrapper;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.servlet.http.HttpServletRequest;

import static com.learning.modules.base.entity.sys.table.BaseSysUserEntityTableDef.BASE_SYS_USER_ENTITY;
import static com.learning.modules.course.entity.table.CourseSelectEntityTableDef.COURSE_SELECT_ENTITY;

/**
 * @Description:
 * @Date: 2025/2/10 11:00
 */
@Tag(name = "课程信息", description = "课程信息")
@CoolRestController(api = {"add", "delete", "update", "page", "list", "info"})
public class AdminCourseSelectController extends BaseController<CourseSelectService, CourseSelectEntity> {
    @Override
    protected void init(HttpServletRequest request, JSONObject requestParams) {
        setPageOption(createOp().fieldEq(COURSE_SELECT_ENTITY.STUDENT_USERNAME,COURSE_SELECT_ENTITY.COURSE_ID).keyWordLikeFields(COURSE_SELECT_ENTITY.STUDENT_USERNAME).queryModeEnum(QueryModeEnum.ENTITY_WITH_RELATIONS)
                );
        setListOption(createOp().fieldEq(COURSE_SELECT_ENTITY.STUDENT_USERNAME,COURSE_SELECT_ENTITY.COURSE_ID));
    }
}
