package com.cool.modules.course.controller.admin;
import cn.hutool.json.JSONObject;
import com.cool.core.annotation.CoolRestController;
import com.cool.core.base.BaseController;
import com.cool.core.request.R;
import com.cool.modules.course.entity.CourseInfoEntity;
import com.cool.modules.course.service.CourseInfoService;
import com.mybatisflex.core.query.QueryWrapper;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import static com.cool.modules.chapter.entity.table.ChapterInfoEntityTableDef.CHAPTER_INFO_ENTITY;
import static com.cool.modules.course.entity.table.CourseInfoEntityTableDef.COURSE_INFO_ENTITY;
import static com.cool.modules.discussion.entity.table.DiscussionGroupEntityTableDef.DISCUSSION_GROUP_ENTITY;
import static com.cool.modules.exam.entity.table.ExamPaperInfoEntityTableDef.EXAM_PAPER_INFO_ENTITY;
import static com.cool.modules.resource.entity.table.ResourceInfoEntityTableDef.RESOURCE_INFO_ENTITY;
import static com.mybatisflex.core.query.QueryMethods.count;

@Tag(name = "课程信息", description = "课程信息")
@CoolRestController(api = {"add", "delete", "update", "page", "list", "info","test"})
public class AdminCourseInfoController extends BaseController<CourseInfoService, CourseInfoEntity> {

    @Override
    protected void init(HttpServletRequest request, JSONObject requestParams) {
        // 配置查询参数
        setPageOption(createOp()
                .fieldEq(COURSE_INFO_ENTITY.TEACHER_USERNAME)
                .keyWordLikeFields(COURSE_INFO_ENTITY.COURSE_NAME,COURSE_INFO_ENTITY.TEACHER_USERNAME)
                .queryWrapper(QueryWrapper.create()
                        .select(
                        )
                        .from(COURSE_INFO_ENTITY)
                        .leftJoin(CHAPTER_INFO_ENTITY).on(CHAPTER_INFO_ENTITY.COURSE_ID.eq(COURSE_INFO_ENTITY.ID))
                        .leftJoin(RESOURCE_INFO_ENTITY).on(RESOURCE_INFO_ENTITY.COURSE_ID.eq(COURSE_INFO_ENTITY.ID))
                        .leftJoin(DISCUSSION_GROUP_ENTITY).on(DISCUSSION_GROUP_ENTITY.COURSE_ID.eq(COURSE_INFO_ENTITY.ID))
                        .leftJoin(EXAM_PAPER_INFO_ENTITY).on(EXAM_PAPER_INFO_ENTITY.COURSE_ID.eq(COURSE_INFO_ENTITY.ID))
                ));
        setListOption(createOp());
    }

    @PostMapping("/test")
    public R test(@RequestBody JSONObject requestparams) {
        System.out.println(requestparams.getStr("user"));
        return R.ok();
    }
}
