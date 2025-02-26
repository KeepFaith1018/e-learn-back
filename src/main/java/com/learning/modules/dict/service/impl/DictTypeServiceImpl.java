package com.learning.modules.dict.service.impl;

import static com.learning.modules.dict.entity.table.DictInfoEntityTableDef.DICT_INFO_ENTITY;
import static com.learning.modules.dict.entity.table.DictTypeEntityTableDef.DICT_TYPE_ENTITY;

import com.learning.core.base.BaseServiceImpl;
import com.learning.modules.dict.entity.DictTypeEntity;
import com.learning.modules.dict.mapper.DictInfoMapper;
import com.learning.modules.dict.mapper.DictTypeMapper;
import com.learning.modules.dict.service.DictTypeService;
import com.mybatisflex.core.query.QueryWrapper;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

/**
 * 字典类型
 */
@Service
@RequiredArgsConstructor
public class DictTypeServiceImpl extends BaseServiceImpl<DictTypeMapper, DictTypeEntity> implements
    DictTypeService {

    final private DictInfoMapper dictInfoMapper;

    @Override
    public List<DictTypeEntity> list(QueryWrapper queryWrapper) {
        return super.list(
            queryWrapper.select(DICT_TYPE_ENTITY.ID, DICT_TYPE_ENTITY.KEY,
                DICT_TYPE_ENTITY.NAME));
    }

    @Override
    public boolean delete(Long... ids) {
        super.delete(ids);
        return dictInfoMapper.deleteByQuery(
            QueryWrapper.create().and(DICT_INFO_ENTITY.TYPE_ID.in((Object) ids))) > 0;
    }
}