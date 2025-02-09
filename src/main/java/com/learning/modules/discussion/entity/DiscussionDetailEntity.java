package com.learning.modules.discussion.entity;

import com.learning.core.base.BaseEntity;
import com.learning.modules.base.entity.sys.BaseSysUserEntity;
import com.learning.modules.user.entity.UserInfoEntity;
import com.mybatisflex.annotation.RelationManyToOne;
import com.mybatisflex.annotation.Table;
import com.tangzc.mybatisflex.autotable.annotation.ColumnDefine;
import lombok.Getter;
import lombok.Setter;

/**
 * @Description:
 * @Date: 2025/2/4 20:49
 */

@Getter
@Setter
@Table(value = "discussion_details", comment = "讨论详情表")
public class DiscussionDetailEntity extends BaseEntity<DiscussionDetailEntity> {

    @ColumnDefine(comment = "讨论组ID", notNull = true)
    private Long groupId;

    @ColumnDefine(comment = "用户用户名", notNull = true, length = 50)
    private String userUsername;

    @ColumnDefine(comment = "讨论内容", notNull = true)
    private String content;


    // 关联讨论组信息：一个讨论详情属于一个讨论组（多对一关系）
    @RelationManyToOne(
            selfField = "groupId",
            targetField = "id"
    )
    private DiscussionGroupEntity discussionGroup;

    // 关联用户信息：一个讨论详情对应一个用户（多对一关系）
    @RelationManyToOne(
            selfField = "userUsername",
            targetField = "username"
    )
    private BaseSysUserEntity userInfo;
}
