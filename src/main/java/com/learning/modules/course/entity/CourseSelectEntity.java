package com.learning.modules.course.entity;

import com.learning.core.base.BaseEntity;
import com.mybatisflex.annotation.Table;
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

    private String studentUsername;

    private Long courseId;
}
