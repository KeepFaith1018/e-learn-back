package com.learning.modules.discussion.entity;
import com.learning.core.base.BaseEntity;
import com.learning.modules.base.entity.sys.BaseSysUserEntity;
import com.learning.modules.course.entity.CourseInfoEntity;
import com.learning.modules.user.entity.UserInfoEntity;
import com.mybatisflex.annotation.RelationOneToMany;
import com.mybatisflex.annotation.RelationOneToOne;
import com.mybatisflex.annotation.Table;
import com.tangzc.mybatisflex.autotable.annotation.ColumnDefine;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * @Description: 讨论组实体类
 * @Date: 2025/2/1 17:28
 */

@Getter
@Setter
@Table(value = "discussion_groups", comment = "讨论组信息表")
public class DiscussionGroupEntity extends BaseEntity<DiscussionGroupEntity> {

    @ColumnDefine(comment = "讨论组名称", notNull = true, length = 100)
    private String groupName;

    @ColumnDefine(comment = "课程ID", notNull = true)
    private Long courseId;

    @ColumnDefine(comment = "创建者用户名", notNull = true, length = 50)
    private String creatorUsername;

    // 关联教师信息：一个讨论组只有一个创建者（教师）(一对一关系)
    @RelationOneToOne(
            selfField = "creatorUsername",
            targetField = "username"
    )
    private BaseSysUserEntity creatorInfo;

    // 关联课程信息：一个讨论组对应一个课程（一对一关系）
    @RelationOneToOne(
            selfField = "courseId",
            targetField = "id"
    )
    private CourseInfoEntity courseInfo;

    @RelationOneToMany(
            selfField = "id",
            targetField = "groupId"
    )
    private List<DiscussionDetailEntity> discussionDetails;
}
