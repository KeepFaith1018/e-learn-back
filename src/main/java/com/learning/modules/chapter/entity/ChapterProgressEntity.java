package com.learning.modules.chapter.entity;

import com.learning.core.base.BaseEntity;
import com.mybatisflex.annotation.Table;
import com.tangzc.mybatisflex.autotable.annotation.ColumnDefine;
import lombok.Getter;
import lombok.Setter;

/**
 * @Description:
 * @Date: 2025/2/10 20:43
 */

@Getter
@Setter
@Table(value = "course_progress", comment = "课程进度表")
public class ChapterProgressEntity extends BaseEntity<ChapterProgressEntity> {

    @ColumnDefine(comment = "学生用户名", notNull = true, length = 50)
    private String studentUsername;

    @ColumnDefine(comment = "课程章节ID", notNull = true)
    private Long chapterId;

    @ColumnDefine(comment = "进度")
    private Number progress;
}
