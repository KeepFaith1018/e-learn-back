package com.learning.modules.dict.controller.admin;

import cn.hutool.json.JSONObject;
import com.learning.core.annotation.CoolRestController;
import com.learning.core.base.BaseController;
import com.learning.modules.dict.entity.DictTypeEntity;
import com.learning.modules.dict.service.DictTypeService;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.servlet.http.HttpServletRequest;

import static com.learning.modules.dict.entity.table.DictTypeEntityTableDef.DICT_TYPE_ENTITY;

/**
 * 字典类型
 */
@Tag(name = "字典类型", description = "字典类型")
@CoolRestController(api = {"add", "delete", "update", "page", "list", "info"})
public class AdminDictTypeController extends BaseController<DictTypeService, DictTypeEntity> {

    @Override
    protected void init(HttpServletRequest request, JSONObject requestParams) {
        setPageOption(
            createOp().select(DICT_TYPE_ENTITY.ID, DICT_TYPE_ENTITY.KEY, DICT_TYPE_ENTITY.NAME));
    }
}
