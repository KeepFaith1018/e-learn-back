package com.cool.modules.exam.controller.admin;

import cn.hutool.json.JSONObject;
import com.cool.core.annotation.CoolRestController;
import com.cool.core.base.BaseController;
import com.cool.modules.exam.entity.ExamPaperInfoEntity;
import com.cool.modules.exam.service.ExamPaperInfoEntityService;
import com.mybatisflex.core.query.QueryWrapper;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.servlet.http.HttpServletRequest;

import static com.cool.modules.course.entity.table.CourseInfoEntityTableDef.COURSE_INFO_ENTITY;
import static com.cool.modules.exam.entity.table.ExamPaperInfoEntityTableDef.EXAM_PAPER_INFO_ENTITY;
/**
 * @Description:
 * @Date: 2025/2/5 8:23
 */
@Tag(name = "考试信息", description = "考试信息")
@CoolRestController(api = { "add", "delete", "update", "page", "list", "info" })
public class AdminExamPaperInfoController extends BaseController<ExamPaperInfoEntityService, ExamPaperInfoEntity> {
    @Override
    protected void init(HttpServletRequest request, JSONObject requestParams) {
        setPageOption(createOp().keyWordLikeFields(EXAM_PAPER_INFO_ENTITY.PAPER_NAME).fieldEq(EXAM_PAPER_INFO_ENTITY.COURSE_ID)
                .queryWrapper(QueryWrapper.create()
                        .select()
                        .from(EXAM_PAPER_INFO_ENTITY)
                        .leftJoin(COURSE_INFO_ENTITY)
                        .on(EXAM_PAPER_INFO_ENTITY.COURSE_ID.eq(COURSE_INFO_ENTITY.ID))
                )
        );
    }
}
