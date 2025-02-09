package com.learning.modules.resource.entity;

import com.learning.core.base.BaseEntity;
import com.learning.modules.course.entity.CourseInfoEntity;
import com.mybatisflex.annotation.RelationManyToOne;
import com.mybatisflex.annotation.Table;
import com.tangzc.mybatisflex.autotable.annotation.ColumnDefine;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Table(value = "course_resources", comment = "课程资源表")
public class ResourceInfoEntity extends BaseEntity<ResourceInfoEntity> {

    @ColumnDefine(comment = "资源类型", notNull = true, length = 100)
    private String type;

    @ColumnDefine(comment = "资源名称", notNull = true, length = 100)
    private String resourceName;

    @ColumnDefine(comment = "资源路径", notNull = true, length = 255)
    private String resourcePath;

    // 关联课程表的course_id外键
    @RelationManyToOne(
            selfField = "courseId",
            targetField = "id"
    )
    private CourseInfoEntity courseInfo;

    // 课程ID, 用作外键
    @ColumnDefine(comment = "课程ID", notNull = true)
    private Long courseId;
}
