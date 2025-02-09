package com.learning.modules.task.service.impl;

import com.learning.core.base.BaseServiceImpl;
import com.learning.modules.task.entity.TaskLogEntity;
import com.learning.modules.task.mapper.TaskLogMapper;
import com.learning.modules.task.service.TaskInfoLogService;
import org.springframework.stereotype.Service;

@Service
public class TaskInfoLogServiceImpl extends BaseServiceImpl<TaskLogMapper, TaskLogEntity>
        implements TaskInfoLogService {
}
