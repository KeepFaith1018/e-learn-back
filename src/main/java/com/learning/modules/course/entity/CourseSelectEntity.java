package com.learning.modules.course.entity;

import com.learning.core.base.BaseEntity;
import com.learning.modules.base.entity.sys.BaseSysUserEntity;
import com.mybatisflex.annotation.RelationManyToOne;
import com.mybatisflex.annotation.RelationOneToOne;
import com.mybatisflex.annotation.Table;
import com.tangzc.mybatisflex.autotable.annotation.ColumnDefine;
import lombok.Getter;
import lombok.Setter;

/**
 * @Description:
 * @Date: 2025/2/10 10:19
 */
@Getter
@Setter
@Table(value = "student_course_selection", comment = "学生选课表")
public class CourseSelectEntity extends BaseEntity<CourseSelectEntity> {
    @ColumnDefine(comment = "学生姓名", notNull = true)
    private String studentUsername;
    @ColumnDefine(comment = "课程", notNull = true)
    private Long courseId;

    @RelationOneToOne(
            selfField = "studentUsername",
            targetField = "username"
    )
    private BaseSysUserEntity userInfo;
}
