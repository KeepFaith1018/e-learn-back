package com.learning.modules.exam.entity;

import com.learning.core.base.BaseEntity;
import com.learning.modules.base.entity.sys.BaseSysUserEntity;
import com.learning.modules.user.entity.UserInfoEntity;
import com.mybatisflex.annotation.RelationOneToOne;
import com.mybatisflex.annotation.Table;
import com.tangzc.mybatisflex.autotable.annotation.ColumnDefine;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

/**
 * @Description:
 * @Date: 2025/2/8 10:13
 */
@Getter
@Setter
@Table(value = "exam_records", comment = "成绩记录表")
public class ExamRecordEntity extends BaseEntity<ExamRecordEntity> {
    @ColumnDefine(comment = "学生用户名", notNull = true, length = 50)
    private String studentUsername;

    @ColumnDefine(comment = "试卷ID", notNull = true)
    private Long paperId;

    @ColumnDefine(comment = "考试成绩", notNull = true)
    private BigDecimal score;

    @ColumnDefine(comment = "答卷内容", type = "TEXT")
    private String content;

    @RelationOneToOne(
            selfField = "studentUsername",
            targetField = "username"
    )
    private BaseSysUserEntity studentInfo;

    @RelationOneToOne(
            selfField = "paperId",
            targetField = "id"
    )
    private ExamPaperInfoEntity examPaper;
}
