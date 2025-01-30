package com.cool.modules.course.controller.admin;
import cn.hutool.json.JSONObject;
import com.cool.core.annotation.CoolRestController;
import com.cool.core.base.BaseController;
import com.cool.core.request.R;
import com.cool.modules.course.entity.CourseInfoEntity;
import com.cool.modules.course.service.CourseInfoService;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.RequestBody;

import static com.cool.modules.course.entity.table.CourseInfoEntityTableDef.COURSE_INFO_ENTITY;

@Tag(name = "课程信息", description = "课程信息")
@CoolRestController(api = {"add", "delete", "update", "page", "list", "info","test"})
public class AdminCourseInfoController extends BaseController<CourseInfoService, CourseInfoEntity> {

    @Override
    protected void init(HttpServletRequest request, JSONObject requestParams) {
        // 配置查询参数
        setPageOption(createOp()
                .keyWordLikeFields(COURSE_INFO_ENTITY.COURSE_NAME,COURSE_INFO_ENTITY.TEACHER_USERNAME));
    }

    @PostMapping("/test")
    public R test(@RequestBody JSONObject requestparams) {
        System.out.println(requestparams.getStr("user"));
        return R.ok();
    }
}
