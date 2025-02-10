package com.learning.modules.chapter.controller.admin;

import cn.hutool.json.JSONObject;
import com.learning.core.annotation.CoolRestController;
import com.learning.core.base.BaseController;
import com.learning.modules.chapter.entity.ChapterProgressEntity;
import com.learning.modules.chapter.service.ChapterProgressService;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.servlet.http.HttpServletRequest;

import static com.learning.modules.chapter.entity.table.ChapterProgressEntityTableDef.CHAPTER_PROGRESS_ENTITY;

/**
 * @Description:
 * @Date: 2025/2/10 20:51
 */
@Tag(name = "章节记录信息", description = "章节记录信息")
@CoolRestController(api = {"add", "delete", "update", "page", "list", "info"})
public class AdminChapterProgressController extends BaseController<ChapterProgressService, ChapterProgressEntity> {
    @Override
    protected void init(HttpServletRequest request, JSONObject requestParams) {
        setListOption(createOp().fieldEq(CHAPTER_PROGRESS_ENTITY.STUDENT_USERNAME));
    }
}
