package com.learning.modules.chapter.entity;

import com.learning.core.base.BaseEntity;
import com.learning.modules.course.entity.CourseInfoEntity;
import com.mybatisflex.annotation.RelationManyToOne;
import com.mybatisflex.annotation.Table;

import com.tangzc.mybatisflex.autotable.annotation.ColumnDefine;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Table(value = "course_chapters", comment = "课程章节表")
public class ChapterInfoEntity extends BaseEntity<ChapterInfoEntity> {

    @ColumnDefine(comment = "章节名称", notNull = true, length = 100)
    private String chapterName;

    @ColumnDefine(comment = "PPT文件路径", length = 255)
    private String pptFilePath;

    @ColumnDefine(comment = "课程ID", notNull = true)
    private Long courseId;

    @RelationManyToOne(
            selfField = "courseId",
            targetField = "id"
    )
    private CourseInfoEntity courseInfo;  // 关联的课程实体
}
