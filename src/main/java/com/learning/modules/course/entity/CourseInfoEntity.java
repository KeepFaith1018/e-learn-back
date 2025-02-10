package com.learning.modules.course.entity;

import com.learning.core.base.BaseEntity;
import com.learning.modules.base.entity.sys.BaseSysUserEntity;
import com.learning.modules.chapter.entity.ChapterInfoEntity;
import com.learning.modules.discussion.entity.DiscussionGroupEntity;
import com.learning.modules.exam.entity.ExamPaperInfoEntity;
import com.learning.modules.resource.entity.ResourceInfoEntity;
import com.mybatisflex.annotation.*;
import com.tangzc.mybatisflex.autotable.annotation.ColumnDefine;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

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
            selfField = "teacherUsername",
            targetField = "username"
    )
    private BaseSysUserEntity teacherInfo;

    @RelationOneToMany(
            selfField = "id",
            targetField = "courseId"
    )
    private List<ResourceInfoEntity> resources;

    @RelationOneToMany(
            selfField = "id",
            targetField = "courseId"
    )
    private List<ChapterInfoEntity> chapters;

    @RelationOneToMany(
            selfField = "id",
            targetField = "courseId"
    )
    private List<DiscussionGroupEntity> discussionGroups;

    @RelationOneToMany(
            selfField = "id",
            targetField = "courseId"
    )
    private List<ExamPaperInfoEntity> examPapers;
}