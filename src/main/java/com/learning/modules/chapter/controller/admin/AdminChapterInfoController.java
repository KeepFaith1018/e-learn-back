package com.learning.modules.chapter.controller.admin;

import cn.hutool.json.JSONObject;
import com.learning.core.annotation.CoolRestController;
import com.learning.core.base.BaseController;
import com.learning.modules.chapter.entity.ChapterInfoEntity;
import com.learning.modules.chapter.service.ChapterInfoService;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.servlet.http.HttpServletRequest;
import static com.learning.modules.chapter.entity.table.ChapterInfoEntityTableDef.CHAPTER_INFO_ENTITY;
/**
 * @Description:
 * @Date: 2025/2/3 16:00
 */
@Tag(name = "章节信息", description = "章节信息")
@CoolRestController(api = {"add", "delete", "update", "page", "list", "info","test"})
public class AdminChapterInfoController extends BaseController<ChapterInfoService, ChapterInfoEntity> {
    @Override
    protected void init(HttpServletRequest request, JSONObject requestParams) {
        setPageOption(createOp().keyWordLikeFields(CHAPTER_INFO_ENTITY.CHAPTER_NAME).fieldEq(CHAPTER_INFO_ENTITY.COURSE_ID));
        setListOption(createOp().keyWordLikeFields(CHAPTER_INFO_ENTITY.CHAPTER_NAME).fieldEq(CHAPTER_INFO_ENTITY.COURSE_ID));
    }
}
