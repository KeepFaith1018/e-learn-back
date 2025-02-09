package com.learning.modules.exam.controller.admin;

import cn.hutool.json.JSONObject;
import com.learning.core.annotation.CoolRestController;
import com.learning.core.base.BaseController;
import com.learning.modules.exam.entity.ExamPaperInfoEntity;
import com.learning.modules.exam.entity.ExamRecordEntity;
import com.learning.modules.exam.service.ExamPaperInfoEntityService;
import com.mybatisflex.core.query.QueryWrapper;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.servlet.http.HttpServletRequest;

import static com.learning.modules.course.entity.table.CourseInfoEntityTableDef.COURSE_INFO_ENTITY;
import static com.learning.modules.exam.entity.table.ExamPaperInfoEntityTableDef.EXAM_PAPER_INFO_ENTITY;
import static com.learning.modules.exam.entity.table.ExamRecordEntityTableDef.EXAM_RECORD_ENTITY;

/**
 * @Description:
 * @Date: 2025/2/5 8:23
 */
@Tag(name = "考试信息", description = "考试信息")
@CoolRestController(api = { "add", "delete", "update", "page", "list", "info" })
public class AdminExamPaperInfoController extends BaseController<ExamPaperInfoEntityService, ExamPaperInfoEntity> {
    @Override
    protected void init(HttpServletRequest request, JSONObject requestParams) {
        String username = requestParams.getStr("username");
        setPageOption(createOp().keyWordLikeFields(EXAM_PAPER_INFO_ENTITY.PAPER_NAME).fieldEq(EXAM_PAPER_INFO_ENTITY.COURSE_ID)
                .queryWrapper(QueryWrapper.create()
                        .select()
                        .from(EXAM_PAPER_INFO_ENTITY)
                        .leftJoin(COURSE_INFO_ENTITY)
                        .on(EXAM_PAPER_INFO_ENTITY.COURSE_ID.eq(COURSE_INFO_ENTITY.ID)
                        )
                )
        );
        setListOption(createOp().fieldEq(EXAM_PAPER_INFO_ENTITY.COURSE_ID).queryWrapper(QueryWrapper.create().select(EXAM_PAPER_INFO_ENTITY.ALL_COLUMNS,
                EXAM_RECORD_ENTITY.SCORE.as("score")).from(EXAM_PAPER_INFO_ENTITY).leftJoin(EXAM_RECORD_ENTITY).on(EXAM_RECORD_ENTITY.PAPER_ID.eq(EXAM_PAPER_INFO_ENTITY.ID).and(EXAM_RECORD_ENTITY.STUDENT_USERNAME.eq(username,username!=null)))));
    }
}
