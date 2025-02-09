package com.learning.modules.base.controller.admin.sys;

import cn.hutool.json.JSONObject;
import com.learning.core.annotation.CoolRestController;
import com.learning.core.base.BaseController;
import com.learning.core.request.R;
import com.learning.modules.base.entity.sys.BaseSysDepartmentEntity;
import com.learning.modules.base.service.sys.BaseSysDepartmentService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import jakarta.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * 系统部门
 */
@Tag(name = "系统部门", description = "系统部门")
@CoolRestController(api = { "add", "delete", "update", "list" })
public class AdminBaseSysDepartmentController
        extends BaseController<BaseSysDepartmentService, BaseSysDepartmentEntity> {

    @Override
    protected void init(HttpServletRequest request, JSONObject requestParams) {
    }

    @Operation(summary = "排序")
    @PostMapping("/order")
    public R order(@RequestBody List<BaseSysDepartmentEntity> list) {
        this.service.order(list);
        return R.ok();
    }
}