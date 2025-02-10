package com.learning.modules.exam.controller.admin;

import cn.hutool.json.JSONObject;
import com.learning.core.annotation.CoolRestController;
import com.learning.core.base.BaseController;
import com.learning.modules.exam.entity.ExamRecordEntity;
import com.learning.modules.exam.service.ExamRecordService;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.servlet.http.HttpServletRequest;

import static com.learning.modules.exam.entity.table.ExamRecordEntityTableDef.EXAM_RECORD_ENTITY;

/**
 * @Description:
 * @Date: 2025/2/8 10:38
 */
@Tag(name = "考试详情", description = "")
@CoolRestController(api = { "add", "delete", "update", "page", "list", "info" })
public class AdminExamRecordController extends BaseController<ExamRecordService, ExamRecordEntity> {
    @Override
    protected void init(HttpServletRequest request, JSONObject requestParams) {

        setPageOption(createOp().fieldEq(EXAM_RECORD_ENTITY.PAPER_ID,EXAM_RECORD_ENTITY.STUDENT_USERNAME).keyWordLikeFields(EXAM_RECORD_ENTITY.STUDENT_USERNAME));
    }
}
