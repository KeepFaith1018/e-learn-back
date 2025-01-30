package com.cool.modules.course.entity;

import com.cool.core.base.BaseEntity;
import com.cool.modules.user.entity.UserInfoEntity;
import com.mybatisflex.annotation.RelationOneToOne;
import com.mybatisflex.annotation.Table;
import com.tangzc.mybatisflex.autotable.annotation.ColumnDefine;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Table(value = "courses", comment = "课程信息表")
public class CourseInfoEntity extends BaseEntity<CourseInfoEntity> {

    @ColumnDefine(comment = "课程名称", notNull = true, length = 100)
    private String courseName;

    @ColumnDefine(comment = "教师用户名", length = 50)
    private String teacherUsername;

    @ColumnDefine(comment = "封面图片地址", length = 255)
    private String coverImage;

    @ColumnDefine(comment = "课程大纲", type = "TEXT")
    private String outline;

    @ColumnDefine(comment = "课程介绍", type = "TEXT")
    private String introduction;

    @RelationOneToOne(
            selfField = "teacherUsername", // 当前实体的字段
            targetField = "username"       // 目标实体的字段
    )
    private UserInfoEntity teacherInfo; // 关联的教师信息
}