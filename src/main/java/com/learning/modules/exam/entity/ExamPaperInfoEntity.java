package com.learning.modules.exam.entity;

import com.learning.core.base.BaseEntity;
import com.learning.modules.course.entity.CourseInfoEntity;
import com.mybatisflex.annotation.Column;
import com.mybatisflex.annotation.RelationOneToOne;
import com.mybatisflex.annotation.Table;
import com.tangzc.autotable.annotation.Ignore;
import com.tangzc.mybatisflex.autotable.annotation.ColumnDefine;
import lombok.Getter;
import lombok.Setter;

/**
 * @Description:
 * @Date: 2025/2/4 9:51
 */

@Getter
@Setter
@Table(value = "exam_papers", comment = "试卷信息表")
public class ExamPaperInfoEntity extends BaseEntity<ExamPaperInfoEntity> {

    @ColumnDefine(comment = "课程ID", notNull = true)
    private Long courseId;

    @ColumnDefine(comment = "试卷名称", notNull = true, length = 100)
    private String paperName;

    @ColumnDefine(comment = "试卷描述", type = "TEXT")
    private String description;

    @ColumnDefine(comment = "试卷内容", type = "TEXT")
    private String content;

    @ColumnDefine(comment = "是否发布", type = "BOOLEAN", defaultValue = "false")
    private Boolean isPublished;

    @RelationOneToOne(
            selfField = "courseId",
            targetField = "id"
    )
    private CourseInfoEntity courseInfo;
    @Column(ignore = true)
    private Float score;
}
